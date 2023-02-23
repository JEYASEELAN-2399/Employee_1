public class Employee {
    private String employee_name;
    private int employee_age;
    private String employee_dept;

    Employee(String employee_name,int employee_age,String employee_dept){
        this.employee_name=employee_name;
        this.employee_age=employee_age;
        this.employee_dept=employee_dept;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_dept() {
        return employee_dept;
    }

    public int getEmployee_age() {
        return employee_age;

    }

    @Override
    public String toString() {
        return employee_name + " " + employee_age + " " + employee_dept ;
    }
}
