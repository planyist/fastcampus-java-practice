package part6;

import model.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("괴물", "봉준호", "2006", "한국"));
        list.add(new Movie("기생충", "봉준호", "2019", "한국"));
        list.add(new Movie("완벽한 타인", "이재규", "2018", "한국"));

        for (Movie m : list) {
            System.out.println(m);
        }

        System.out.println("+----------------+----+------+----+");
        System.out.println("|영화감독         |감독 |개봉년도|국가+");
        System.out.println("+----------------+----+------+----+");
        for (Movie m : list) {
            System.out.printf("|%-16s|%-3s|%4s|%-2s|\n", m.getTitle(), m.getDirector(), m.getYear(), m.getCountry());
        }
        System.out.println("+----------------+----+------+----+");

        String searchTitle = "기생충";
        for (Movie m : list) {
            if (m.getTitle().equals(searchTitle)) {
                System.out.println(m);
                break;
            }
        }
    }
}
