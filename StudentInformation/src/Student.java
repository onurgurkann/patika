
public class Student {
	String name;
	Course math;
	Course physics;
	Course chemistry;
	int studentNo, classNo;
	double average;
	boolean isPass;
	
	public Student(String name, int classNo, int studentNo, Course math, Course physics, Course chemistry) {
		this.name = name;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		calcAverage();
		this.isPass = false;
	}
	
	public void addExamNote(int math, int math2, int physics, int physics2, int chemistry, int chemistry2) {
		if(math >= 0 && math <= 100) {
			this.math.note = math;
			this.math.note2 = math2;
		}
		if(physics >= 0 && physics <= 100) {
			this.physics.note = physics;
			this.physics.note2 = physics2;
		}
		if(chemistry >= 0 && chemistry <= 100) {
			this.chemistry.note = chemistry;
			this.chemistry.note2 = chemistry2;
		}
	}
	
	public void calcAverage() {
		this.average = (((this.physics.note*0.80) + (this.physics.note2)*0.20) + ((this.chemistry.note*0.75) +
				(this.chemistry.note2)*0.25) + ((this.math.note*0.85) +(this.math.note2)*0.15)) / 3;
	}
	
	public void isPass() {
		if(this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 || this.math.note2 == 0 || 
				this.physics.note2 == 0 || this.chemistry.note2 == 0) {
			System.out.println("Notes not entered!");
		}
		else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Average : " + this.average);
			if(this.isPass) {
				System.out.println("Passed");
			}
			else
				System.out.println("Stayed");
		}
	}
	
	public boolean isCheckPass() {
		calcAverage();
		return this.average > 55;
	}
	
	public void printNote() {
		System.out.println("========================");
		System.out.println("Student : " + this.name);
		System.out.println("Math Note : " + this.math.note);
		System.out.println("Math Note2 : " + this.math.note2);
		System.out.println("Physics Note : " + this.physics.note);
		System.out.println("Physics Note2 : " + this.physics.note2);
		System.out.println("Chemistry Note : " + this.chemistry.note);
		System.out.println("Chemistry Note2 : " + this.chemistry.note2);
	}
}
