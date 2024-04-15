package part7;

import com.google.gson.Gson;
import model.Address;
import model.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");
        Member mvo = new Member("홍길동", 30, "bit@empas.com", address);

        Gson gson = new Gson();
        String json = gson.toJson(mvo);
        System.out.println("json = " + json);
    }
}
