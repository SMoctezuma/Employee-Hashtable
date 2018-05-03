package FA2016_LAB6;

public class FA2016LAB6_TitleEmployee_Moctezuma extends FA2016LAB6_Employee_Moctezuma {
    private String supervisor;
    private String manager;
    private double bonus;

    public FA2016LAB6_TitleEmployee_Moctezuma() {
        super();
        //declaring variables other than null
        //which would work as well.
        supervisor = "";
        manager = "";
        bonus = 0.0f;
    }
    public FA2016LAB6_TitleEmployee_Moctezuma(String employeeID, String lastName, String firstName,
                                              String department, String salary, String v, String m, double b) {
        super(employeeID,lastName,firstName,department,salary);
        supervisor = v;
        manager = m;
        bonus = b;
    }

    //mutators
    public void setBonus(double n)
    {
        bonus = n;
    }
    public void setSupervisor(String visor)
    {
        supervisor = visor;
    }
    public void setManager(String s)
    {
        manager = s;
    }
    public double getBonus()
    {
        return bonus;
    }
    public String getSupervisor()
    {
        return supervisor;
    }
    public String getManager()
    {
        return manager;
    }

    public String toString() {
        return super.toString() + "Supervisor:" + supervisor +"\nManager:"
                + manager +"\nBonus:" + bonus + "\n";
    }
    public FA2016LAB6_TitleEmployee_Moctezuma deepCopy() {
        //pass all variables to new object
        return new FA2016LAB6_TitleEmployee_Moctezuma(getEmployeeID(),getLastName(), getFirstName(), getDepartment(),
                getSalary(), getSupervisor(),getManager(),getBonus());
    }
}
