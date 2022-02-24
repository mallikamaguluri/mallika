package JavaPractics;

import java.util.ArrayList;
import java.util.Scanner;
class Employees {
    public String firstname;
    public String lastname;
    public int age;
    public int salary;

    Employees(String firstname, String lastname, int age, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of employees:");
        int NumberOfEmployees = in.nextInt();
        ArrayList<Employees> emplist = new ArrayList<>();
        for (int i = 0; i < NumberOfEmployees; i++) {
            System.out.println("enter employee" + (i + 1) + "details");
            System.out.println("enter firstname:");
            String firstname = in.next();
            System.out.println("enter lastname:");
            String lastname = in.next();
            System.out.println("enter age:");
            int age = in.nextInt();
            System.out.println("enter salary:");
            int salary = in.nextInt();
            Employee emp = new
                    Employee(firstname, lastname, age, salary);

        }
        System.out.println("enter first name and last name to search in employee list");
        System.out.println("enter first name:");
        String firstname = in.next();
        System.out.println("enter last name:");
        String lastname = in.next();
        int f = 0;

        for (int i = 0; i < NumberOfEmployees; i++) {
            Employees e = emplist.get(i);
            if (e.firstname.equals(firstname) && e.lastname.equals(lastname)) {
                f = 1;
                System.out.println("employee details are:");
                System.out.println("name:" + (e.firstname + " " + e.lastname) + "age:" + e.age + "salary:" + e.salary + "\n");
                break;
            }
        }
        if (f == 0) {
            System.out.println(firstname + "" + lastname + "is not present in employeelist!");
        }
        System.out.println("maximum salary is:");
        int maxSalary = Integer.MIN_VALUE;
        double averageAge = 0;
        Employees oldestemployee = emplist.get(0);
        Employees eldestemployee = emplist.get(0);

        for (int i = 0; i < NumberOfEmployees; i++) {
            Employees e = emplist.get(i);
            averageAge += e.age;
            if (oldestemployee.age < e.age)

                if (eldestemployee.age > e.age) {
                    eldestemployee = e;
                }
            if (e.salary > maxSalary) {
                maxSalary = e.salary;
            }
        }
        System.out.println(maxSalary);
        System.out.println("Average age of all the employees is:" + (averageAge / NumberOfEmployees));
        System.out.println("eldest employee is:" + eldestemployee.firstname + "" + eldestemployee.lastname + "with age:" + eldestemployee.age);
        System.out.println("oldest employee is:" + oldestemployee.firstname + "" + oldestemployee.lastname + "with age:" + oldestemployee.age);
    }
}
