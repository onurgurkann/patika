
public class Main {

	public static void main(String[] args) {
		
		Course math = new Course("Math", "M101", "MATH");
        Course physics = new Course("Physics", "P101", "PHY");
        Course chemistry = new Course("Chemistry", "C101", "CHE");

        Teacher t1 = new Teacher("Mahmut", "90550000000", "MATH");
        Teacher t2 = new Teacher("Ayse", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali", "90550000002", "CHE");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Saban", 4, 140144015, math, physics, chemistry);
        s1.addExamNote(50,60,20,40,40,50);
        s1.isPass();

        Student s2 = new Student("Necmi", 4, 150111033, math, physics, chemistry);
        s2.addExamNote(100,80,50,60,40,40);
        s2.isPass();

        Student s3 = new Student("Ismail", 4, 150122012, math, physics, chemistry);
        s3.addExamNote(50,50,20,60,40,80);
        s3.isPass();

	}

}
