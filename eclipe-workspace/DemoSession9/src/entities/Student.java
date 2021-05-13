package entities;

public class Student {

	private String id;
	private String name;
	private double score;
	private Faculty faculty;
	private Course[] courses;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public void print() {
		System.out.println("id: " + this.id);
		this.faculty.print();
		System.out.println("Courses");
		for (Course course : this.courses) {
			course.print();
			System.out.println("--------------------");
		}
	}

}
