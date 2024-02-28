package part4;

public class RempVO extends Employee {
    public RempVO() {
        super();
    }

    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

}
