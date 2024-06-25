package hierarcy;

public class Programmer extends Developer {
	public Programmer(String name, String address, double Salary, String Jobtitle) {
		super(name, address, Salary, Jobtitle);
	}
	
    @Override
    public void PerformanceReport() {
        System.out.println("Performance report for " + getName() + " is not applicable for Programmers.");
    }
}
