package part3;

import model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "홍길동2";
        // dto.age = 1000;
        dto.phone = "010-2222-2222";
        System.out.println(dto.name + "\t" + /* dto.age */ dto.phone);
        // dto.play();
        dto.eat();
    }
}
