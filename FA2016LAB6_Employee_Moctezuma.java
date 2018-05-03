package FA2016_LAB6;

public class FA2016LAB6_Employee_Moctezuma {
    private String employeeID;
    private String lastName;
    private String firstName;
    private String department;
    private String salary;

    public FA2016LAB6_Employee_Moctezuma() {
        //Just declaring variables
        employeeID = "";
        lastName = "" ;
        firstName = "" ;
        department = "" ;
        salary = "";
    }
    public FA2016LAB6_Employee_Moctezuma(String ID, String lastName, String firstName, String department, String salary)
    {
        employeeID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this. salary = salary;
    }

    //mutators
    public void setEmployeeID(String employeeID)
    {
        this.employeeID = employeeID;
    }
    public void setLastName(String n)
    {
        lastName = n;
    }
    public void setFirstName(String n)
    {
        firstName = n;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void setSalary(String _salary)
    {
        salary = _salary;
    }
    public String getEmployeeID()
    {
        return employeeID;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getSalary()
    {
        return salary;
    }

    public int compareTo(String ID)
    {
        return (employeeID.compareTo(ID));
    }
    public String toString()
    {
        return "Employee ID: " + employeeID + "\nLast name:" + lastName + "\nFirst name:" + firstName
                + "\nDepartment: " + department + "\nSalary:" + salary+"\n";
    }
    public FA2016LAB6_Employee_Moctezuma deepCopy()
    {
        return new FA2016LAB6_Employee_Moctezuma(employeeID,lastName, firstName, department, salary);
    }
}

