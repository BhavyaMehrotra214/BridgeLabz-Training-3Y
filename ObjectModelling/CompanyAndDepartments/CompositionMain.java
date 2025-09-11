package CompanyAndDepartments;

public class CompositionMain {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department hr = company.addDepartment("HR");
        Department it = company.addDepartment("IT");

        hr.addEmployee("Anya");
        hr.addEmployee("Bhavya");

        it.addEmployee("Chitra");
        it.addEmployee("Davi");

        System.out.println("\n Deleting Company \n");
        company.cleanup(); 
    }
}