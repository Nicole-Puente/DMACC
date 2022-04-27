package tests;
import java.time.LocalTime;

import model.Classroom;
import model.Course;
import model.Instructor;

/**  
* Nicole Puente - npuente  
* CIS171 22149
* Apr 7, 2022  
*/

public class RegistrationTesterPuente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom compSciLab = new Classroom();
		compSciLab.setBuilding("8");
		compSciLab.setRoomNumber("17");
		compSciLab.setCampus("Ankeny");
		compSciLab.setType("Computer Lab");
		compSciLab.setCapacity(20);
		
		Classroom bioLab = new Classroom();
		bioLab.setBuilding("3");
		bioLab.setRoomNumber("28a");
		bioLab.setCampus("Carroll");
		bioLab.setType("Science Lab");
		bioLab.setCapacity(22);
		
		Classroom litRoom = new Classroom();
		litRoom.setBuilding("Betts");
		litRoom.setRoomNumber("12");
		litRoom.setCampus("Urban");
		litRoom.setType("Classroom");
		litRoom.setCapacity(18);
		
		System.out.println(compSciLab.toString());
		System.out.println(bioLab.toString());
		System.out.println(litRoom.toString());
		
		Instructor wsmith = new Instructor();
		wsmith.setFirstName("Wanda");
		wsmith.setLastName("Smith");
		
		Instructor wfitz = new Instructor();
		wsmith.setFirstName("Wilma");
		wsmith.setLastName("Fitz");
		
		Instructor etheo = new Instructor();
		wsmith.setFirstName("Emily");
		wsmith.setLastName("Theo");
		
		Course bio101 = new Course();
		bio101.setCourseIdentifier("2468");
		bio101.setCourseName("BIO101");
		bio101.setStartTime(LocalTime.of(11, 15));
		bio101.setEndTime(LocalTime.of(12, 55));
		bio101.setTeacher(wsmith);
		bio101.setLocation(bioLab);
		
		Course cis171 = new Course();
		cis171.setCourseIdentifier("23456");
		cis171.setCourseName("CIS171");
		cis171.setStartTime(LocalTime.of(10, 10));
		cis171.setEndTime(LocalTime.of(12, 20));
		cis171.setTeacher(wfitz);
		cis171.setLocation(compSciLab);
		
		Course lit105 = new Course();
		lit105.setCourseIdentifier("29876");
		lit105.setCourseName("LIT105");
		lit105.setStartTime(LocalTime.of(15, 15));
		lit105.setEndTime(LocalTime.of(16, 40));
		lit105.setTeacher(etheo);
		lit105.setLocation(litRoom);
		
		System.out.println(bio101.toString());
		System.out.println(cis171.toString());
		System.out.println(lit105.toString());

	}

}
