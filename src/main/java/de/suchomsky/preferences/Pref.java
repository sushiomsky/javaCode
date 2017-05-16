package de.suchomsky.preferences;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * java
 * Copyright (c) 2017 Dennis Suchomsky <dennis.suchomsky@gmail.com>
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class Pref {
	Pref() {
		Preferences userPrefs = Preferences.userNodeForPackage(this.getClass());
		//userPrefs.put("host", "localhost");
		try {
			for(Object o : userPrefs.keys()){
				System.out.println(o.toString()+":"+userPrefs.get(o.toString(),o.toString()));
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
}
