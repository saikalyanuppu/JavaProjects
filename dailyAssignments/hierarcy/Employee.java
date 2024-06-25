package hierarcy;

public class Employee {
	String name;
	String address;
	double Salary;
	String Jobtitle;
	
	Employee(String name, String address, double Salary, String Jobtitle) {
		this.name = name;
		this.address = address;
		this.Salary = Salary;
		this.Jobtitle = Jobtitle;
				
	}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public String getJobTitle() {
        return Jobtitle;
    }

    public void setJobTitle(String jobTitle) {
        this.Jobtitle = jobTitle;
    }
	
	public double calcBonus() {
		return Salary * 0.1;
	}
	
	public void PerformanceReport() {
		System.out.println("Performance report for " + " " + name + " is generated");
	}
	
	public void manageProject() {
		System.out.println(Jobtitle + " " + name + " " + " is managing the project");
	}
}
