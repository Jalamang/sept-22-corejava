package com.cognixia.jump.fileoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cognixia.jump.classandobjects.Animal;
import com.cognixia.jump.classandobjects.Horse;

public class ObjectStreamDriver {

	public static void main(String[] args) throws ClassNotFoundException {
		File file = new File("resources/objectFile.data");

		try {
			file.createNewFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		writeObectToFile(file);
		readObectFromFile(file);
	}

	private static void writeObectToFile(File file) {
		Animal animal = new Animal("Whale", 3700.0);
		Horse horse = new Horse();
		String hello = "Hello World";

		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))) {
			writer.writeObject(animal);
			writer.writeObject(horse);
			writer.writeObject(hello);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readObectFromFile(File file) throws ClassNotFoundException {
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {
			Animal animal = (Animal) reader.readObject();
			System.out.println(animal);

			Horse horse = (Horse) reader.readObject();
			System.out.println(horse);

			String hello = (String) reader.readObject();
			System.out.println(hello);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
