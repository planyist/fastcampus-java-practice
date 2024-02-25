package model;

public class MemberDTO {
    public String name;
    public String phone;
    private int age;

    private void play() {
        System.out.println("운동을 한다.");
    }

    public void eat() {
        System.out.println("먹다.");
    }
}
