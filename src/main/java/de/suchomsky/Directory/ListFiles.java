package de.suchomsky.Directory;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sushi on 16.03.17.
 */
public class ListFiles {
	public static void main(String[] args) {
		List<String> results = new ArrayList<String>();


		File[] files = new File("/home/sushi/Downloads/smsgott/").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null.

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
				System.out.println(file.getName());
			}
		}

	}
}
