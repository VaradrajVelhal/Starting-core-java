package company.hr;

import company.Employee;

public class HRManager {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("--- Access from Different Package (company.hr) ---");

        // 1. PUBLIC: Accessible everywhere
        System.out.println(emp.publicName);

        // 2. PROTECTED: NOT accessible (different package, not a subclass)
        // System.out.println(emp.protectedID); // ERROR

        // 3. DEFAULT: NOT accessible (different package)
        // System.out.println(emp.defaultRole); // ERROR

        // 4. PRIVATE: NOT accessible (only same class)
        // System.out.println(emp.privateSalary); // ERROR

        // We can call a public method to see the data indirectly
        emp.showInternalAccess();
    }
}
