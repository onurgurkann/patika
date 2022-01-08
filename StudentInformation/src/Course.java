
public class Course {
	Teacher cTeacher;
	String name, code, prefix;
	int note, note2;

	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.note2 = 0;
	}

	public void addTeacher(Teacher t) {
		if (this.prefix.equals(t.branch)) {
			this.cTeacher = t;
			System.out.println("Successfull");
		} else {
			System.out.println(t.name + " can't give this lesson");
		}
	}

	public void printTeacher() {
		if(cTeacher != null) {
			System.out.println(this.name + " lesson teacher : " + cTeacher.name);
		}
		else {
			System.out.println("Teacher isn't appointed to the "+this.name+" lesson.");
		}
	}

}
