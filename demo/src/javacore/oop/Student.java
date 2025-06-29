package javacore.oop;

public class Student extends Person {
	private int mark;
	private String grade;

	
	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
		this.grade = grade;
	}

	

	private int getMark() {
		return mark;
	}



	private void setMark(int mark) {
		this.mark = mark;
	}



	private String getGrade() {
		return grade;
	}



	private void setGrade(String grade) {
		this.grade = grade;
	}



//	private void setGrade() {
//		
//	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}
	
	

}
