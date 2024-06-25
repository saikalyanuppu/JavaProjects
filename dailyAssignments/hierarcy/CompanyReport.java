package hierarcy;

public class CompanyReport {
	public static void main(String[] args) {
		Manager m = new Manager("Karthik", "Hyderabad", 90000.00, "Manager");
        System.out.println(m.getName() + " " + "'s bonus: ₹ " + m.calcBonus());
        m.manageProject();
        m.PerformanceReport();
        
		Developer d = new Developer("Aravind", "Bangalore", 70000.00, "Developer");
        System.out.println(d.getName() + " " + "'s bonus: ₹ " + d.calcBonus());
        d.manageProject();
        d.PerformanceReport();
        
		Programmer p = new Programmer("Vivek", "Chennai", 50000.00, "Programmer");
        System.out.println(p.getName() +" " + "'s bonus: ₹ " + p.calcBonus());
        p.manageProject();
        p.PerformanceReport();

	}
}
