package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.Faculty;

public class FacultyModel {
	public List<Faculty> findAll() {
		List<Faculty> faculties = new ArrayList<Faculty>();
		Faculty faculty1 = new Faculty("fa1","Faculty 1","Abaddon_icon.png");
		faculties.add(faculty1);
		Faculty faculty2 = new Faculty("fa2","Faculty 2","Alchemist_icon.png");
		faculties.add(faculty2);
		Faculty faculty3 = new Faculty("fa3","Faculty 3","Bounty_Hunter_icon.png");
		faculties.add(faculty3);
		Faculty faculty4 = new Faculty("fa4","Faculty 4","Clinkz_icon.png");
		faculties.add(faculty4);
		
		return faculties; 
	}
}
