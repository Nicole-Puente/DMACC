package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

import model.Instructor;

public class InstructorFileHelper implements FileHelper {
	String nameOfFile = "instructors.txt";
	File instructorList = new File(nameOfFile);

	@Override
	public boolean doesAFileExist() {
		// TODO Auto-generated method stub
		if (instructorList.exists()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean writeFile(ArrayList<?> list) {
		// TODO Auto-generated method stub
		ArrayList<Instructor> InstructorToWrite = (ArrayList<Instructor>) (list);
		try {
			PrintWriter instructorList = new PrintWriter(nameOfFile);
			for (Instructor c : InstructorToWrite) {
				StringBuilder sb = new StringBuilder();
				sb.append(c.getFirstName() + "," + c.getLastName() + "," + c.getEmail());
				instructorList.println(sb.toString());
			}
			instructorList.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("No File called " + nameOfFile + " found when writing instructors.");
			return false;
		}
		return true;

	}

	@Override
	public ArrayList<?> readFile() {
		// TODO Auto-generated method stub
		ArrayList<Instructor> allInstructors = new ArrayList<Instructor>();

		Scanner fileIn;
		try {
			fileIn = new Scanner(instructorList);
			while (fileIn.hasNextLine()) {
				String value = fileIn.nextLine();
				String[] parts = value.split(",");
				Instructor currentInstructor = new Instructor(parts[0], parts[1], parts[2]);
				allInstructors.add(currentInstructor);
			}
			fileIn.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("No file called " + nameOfFile + " found when reading instructors.");
		}
		return allInstructors;
	}

}
