package part4;

public class Employee {
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
