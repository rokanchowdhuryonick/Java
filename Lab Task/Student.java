package student;

public class Student {
	private String name, id, department;
	private float cgpa;
	public Student() {
		//Default Constructor..
	}
	public Student(String name, String id, String department, float cgpa) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public void showInfo() {
		System.out.println("ID: " + this.id + "\nName: " + this.name + "\nCGPA: " + this.cgpa + "\nDepartment: " + this.department);
	}
	
	
}
