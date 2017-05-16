package de.suchomsky.database;

import java.sql.SQLException;

public class DatabaseManager {

    private static volatile DatabaseManager instance;
    private static volatile ConectionDB connetion;

    /**
     * Private constructor (due to Singleton)
     */
    private DatabaseManager() {
        connetion = new ConectionDB();
        final int currentVersion = connetion.checkVersion();
        if (currentVersion < CreationStrings.version) {
            recreateTable(currentVersion);
        }
    }

    /**
     * Get Singleton instance
     *
     * @return instance of the class
     */
    public static DatabaseManager getInstance() {
        final DatabaseManager currentInstance;
        if (instance == null) {
            synchronized (DatabaseManager.class) {
                if (instance == null) {
                    instance = new DatabaseManager();
                }
                currentInstance = instance;
            }
        } else {
            currentInstance = instance;
        }
        return currentInstance;
    }

    /**
     * Recreates the DB
     */
    private void recreateTable(int currentVersion) {
        try {
            connetion.initTransaction();
            if (currentVersion == 0) {
                currentVersion = createNewTables();
            }
            if (currentVersion == 1) {
                //  currentVersion = updateToVersion2();
            }
            connetion.commitTransaction();
        } catch (SQLException e) {
//            BotLogger.error(LOGTAG, e);
        }
    }
/*
    private int updateToVersion2() throws SQLException {
        connetion.executeQuery(CreationStrings.createRecentWeatherTable);
        connetion.executeQuery(String.format(CreationStrings.insertCurrentVersion, 2));
        return 2;
    }
*/

    private int createNewTables() throws SQLException {
        connetion.executeQuery(CreationStrings.createVersionTable);
        connetion.executeQuery(String.format(CreationStrings.insertCurrentVersion, CreationStrings.version));
        return CreationStrings.version;
    }
}
