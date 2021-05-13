package models;

import java.util.ArrayList;
import java.util.List;

import entities.Faculty;

public class FacultyModel {

	public List<Faculty> findAll() {
		List<Faculty> faculties = new ArrayList<Faculty>();
		faculties.add(new Faculty("f1", "Faculty 1"));
		faculties.add(new Faculty("f2", "Faculty 2"));
		faculties.add(new Faculty("f3", "Faculty 3"));
		faculties.add(new Faculty("f4", "Faculty 4"));
		faculties.add(new Faculty("f5", "Faculty 5"));
		return faculties;
	}

}
