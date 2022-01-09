
public class Employee {
	String name;
	double salary;
	int workHours, hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		if(salary > 1000) {
			return salary * 0.03;
		}
		else
			return 0;
	}
	
	public double bonus(double workHours) {
		if(workHours > 40) {
			double hour = workHours - 40;
			return hour * 30;
		}
		return 0;
	}
	
	public double raiseSalary(int hireYear) {
		int year = 2021 - hireYear;
		if(year >= 20 ) {
			return 0.15;
		}
		else if(year >= 10 && year < 20) {
			return 0.10;
		}
		else {
			return 0.05;
		}
			
	}
	
	public void print() {
		System.out.println("Name : "+ this.name);
		System.out.println("Salary : "+ this.salary);
		System.out.println("Work Hours : "+ this.workHours);
		System.out.println("Hire Year : "+ this.hireYear);
		System.out.println("Tax : "+ tax(this.salary));
		System.out.println("Bonus : " + bonus(this.workHours));
		System.out.println("Salary Increase : "+ (this.salary * raiseSalary(this.hireYear)));
		System.out.println("Salary Together With Tax And Bonus : "+ (this.salary - tax(this.salary) + bonus(this.workHours)));
		System.out.println("Total Salary : "+ (this.salary + bonus(this.workHours) + (this.salary * raiseSalary(this.hireYear)) - tax(this.salary)));
	}
}
