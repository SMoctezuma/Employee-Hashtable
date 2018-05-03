package FA2016_LAB6;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
/*
Had so trouble parsing the string when reading in a file, so I didn't implement a read function.
But I wanted to turn in something so this is somewhat "unfinished".
 */

public class FA2016LAB6_HashedDataStructure_Moctezuma {
    public static void main(String[] args)
    {
        FA2016LAB6_Employee_Moctezuma EmployeeT;
        int userInput;

        Hashtable <String, FA2016LAB6_Employee_Moctezuma> table = new Hashtable<String, FA2016LAB6_Employee_Moctezuma>();

        FA2016LAB6_Employee_Moctezuma e = null;
        Scanner UI = new Scanner(System.in);
        do { //Menu
            System.out.println("1.Insert Employee/Employee with a title" + "\n2.Fetch" + " \n3.Encapsulation"
                    + "\n4.Update" + "\n5.Delete" + "\n6.Show all" + "\n7.Exit");
            userInput = UI.nextInt();
            UI.nextLine();
            //TODO: Make reg expression here.
            //So program terminates on user Input.
            String t;
            switch(userInput) {
                case 1 :
                    do {
                        e = emp_ask(UI);
                        table.put(e.getEmployeeID(),e);
                        System.out.println("Is there another employee you wish to enter?(y/n)");
                        t = UI.nextLine();
                    }while(t.matches(("nN")));
                    //Prints Employees somewhat neatly
                    System.out.println("------------------");
                    showAll(table);
                    break;
                case 2 :
                    System.out.println("Enter employee's ID: ");
                    String employeeID = UI.nextLine();
                    EmployeeT = table.get(employeeID);
                    System.out.println(EmployeeT);
                    break;
                case 3:
                    System.out.println("ID: ");
                    employeeID = UI.nextLine();
                    EmployeeT = table.get(employeeID);
                    System.out.println("Salary: ");
                    String newSal = UI.nextLine();
                    EmployeeT.setSalary(newSal);
                    table.put(e.getEmployeeID(),e);
                    e = table.get(e.getEmployeeID());
                    if(EmployeeT.equals(e.getSalary())) {
                        System.out.println("Encapsulated.");
                    }
                    else {
                        System.out.println("Not Encapsulated.");
                    }
                    break;
                case 4 :
                    System.out.println("Enter your employee ID: ");
                    employeeID = UI.nextLine();
                    e = table.get(employeeID);
                    System.out.println(e);
                    System.out.println("Enter your department: ");
                    String department = UI.nextLine();
                    e.setDepartment(department);
                    table.put(e.getEmployeeID(),e);
                    e = table.get(e.getEmployeeID());
                    System.out.println(e);
                    break;
                case 5 :
                    System.out.println("Enter your employee ID: ");
                    employeeID = UI.nextLine();
                    table.remove(employeeID);
                    e = table.get(employeeID);
                    showAll(table);
                    break;
                case 6 :
                    Enumeration key = table.keys();
                    while(key.hasMoreElements()) {
                        System.out.println(table.get(key.nextElement()));
                    }
                    break;
                case 7 :
            }
        }while(userInput!=7);
    }
    public static FA2016LAB6_Employee_Moctezuma emp_ask (Scanner userInput) {
        int type;
        double bonus;
        String employeeID;
        String lastName;
        String firstName;
        String department;
        String salary;
        String supervisor;
        String manager;

        //Have to declare it or else I'll get an error when returning. "Might not be initialized"
        FA2016LAB6_Employee_Moctezuma e = null;
        //Even thought the case will never occur. Compile-time error.

        System.out.println("Enter Employee ID: ");
        employeeID = userInput.nextLine();
        System.out.println("Enter your last name: ");
        lastName = userInput.nextLine();
        System.out.println("Enter your first name: ");
        firstName = userInput.nextLine();
        System.out.println("Enter your department: ");
        department = userInput.nextLine();
        System.out.println("Enter your salary: ");
        salary = userInput.nextLine();
        System.out.println("1. Employee \n2. Employee Title\n");
        type = userInput.nextInt();
        userInput.nextLine();
        if(type==1) {
            e = new FA2016LAB6_Employee_Moctezuma(employeeID,lastName,firstName,department,salary);
        }
        else if(type==2) {
            System.out.println("Job title: ");
            supervisor = userInput.nextLine();
            System.out.println("Enter the name of the manager: ");
            manager = userInput.nextLine();
            System.out.println("Enter Bonus: ");
            bonus = userInput.nextDouble();
            e = new FA2016LAB6_TitleEmployee_Moctezuma(employeeID,lastName,firstName,department,salary,supervisor,manager,bonus);

        }
        return e;
    }
    public static void showAll(Hashtable t) {
        Enumeration key = t.keys();
        while(key.hasMoreElements()) {
            System.out.println(t.get(key.nextElement()));
        }
    }
}
