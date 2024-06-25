package hierarcy;

public class Manager extends Employee{
	public Manager(String name, String address, double Salary, String Jobtitle) {
		super(name, address, Salary, Jobtitle);
	}
	
	@Override
	public double calcBonus() {
		return getSalary()*0.15;
	}
}
