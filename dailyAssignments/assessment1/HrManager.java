package assessment1;

public class HrManager extends Employee {
	@Override
	public void work() {
		System.out.println("Hr manager is managing HR tasks");
	}
	
	public void addEmp() {
		System.out.println("Hr Manager is adding new Employee");
	}
}
