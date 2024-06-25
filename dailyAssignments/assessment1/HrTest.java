package assessment1;

public class HrTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.work();
		
		System.out.println("Employee's salary: " + emp.getSal());
		
		HrManager Hrm = new HrManager();
		Hrm.work();
		Hrm.addEmp();
		
		System.out.println("Hr Manager's Salary: " + Hrm.HrSal());
	}
}
