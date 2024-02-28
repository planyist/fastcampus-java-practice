package part4;

public class EmployeeTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO();
        vo.name = "홍길동";
        vo.age = 50;
        vo.phone = "010-1111-1111";
        vo.empDate = "2022-10-10";
        vo.dept = "홍보부";
        vo.marriage = true;

        System.out.println(vo.name + "\t"
                + vo.age + "\t"
                + vo.phone + "\t"
                + vo.empDate + "\t"
                + vo.dept + "\t"
                + vo.marriage);
        System.out.println(vo);
    }
}
