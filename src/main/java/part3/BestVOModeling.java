package part3;

import model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO vo = new MovieVO("아바타", 20221214, "제이크 설리", "액션", 192.0f, 12);
        System.out.println(vo);
    }
}
