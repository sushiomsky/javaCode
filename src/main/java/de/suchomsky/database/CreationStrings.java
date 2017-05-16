package de.suchomsky.database;

public class CreationStrings {

    public static final int version = 1;
    public static final String createVersionTable = "CREATE TABLE IF NOT EXISTS Versions(ID INTEGER PRIMARY KEY AUTO_INCREMENT, Version INTEGER);";
    public static final String insertCurrentVersion = "INSERT IGNORE INTO Versions (Version) VALUES(%d);";

}
