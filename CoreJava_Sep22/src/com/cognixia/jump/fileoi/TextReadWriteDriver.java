package com.cognixia.jump.fileoi;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TextReadWriteDriver {

	public static void main(String[] args) {
		// Relative path is generally the best choice for file location
		//
		String relativeFilePath = "resources1/temp.txt";
		File file = new File(relativeFilePath);
		File resourceFolder = new File("resources1");

		// checks if the file exists
		System.out.println("Does file exist ? " + file.exists());

		// If file doesn't exist create it

		if (!file.exists()) {
			try {

				file.createNewFile();

				System.out.println("File created" + file.getName());
			} catch (IOException e) {
				System.out.println("File " + file.getName() + " could not be created with path " + file.getPath());
				if (!resourceFolder.exists()) {
					try {
						if (resourceFolder.mkdir()) {
							System.out.println("Folder : " + resourceFolder.getName() + " created");
						}
					} catch (Exception e2) {
						System.out.println(" ");
					}
				}
			}

		}

		// Sample meta data from file
		System.out.println(file.getAbsolutePath());
		Date modified = new Date(file.lastModified());
		System.out.println(modified.toString());

	}

}
