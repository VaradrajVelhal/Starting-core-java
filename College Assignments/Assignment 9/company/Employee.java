package company;

public class Employee {
    public String publicName = "Public: Ganesh";
    protected String protectedID = "Protected: ID-123";
    String defaultRole = "Default: Developer"; // No modifier = package-private
    private double privateSalary = 50000.00;

    public void showInternalAccess() {
        System.out.println("--- Inside Same Class ---");
        System.out.println(publicName);
        System.out.println(protectedID);
        System.out.println(defaultRole);
        System.out.println(privateSalary);
    }
}