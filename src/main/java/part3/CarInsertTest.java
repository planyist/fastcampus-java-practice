package part3;

import model.CarDAO;
import model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("자동차 일련번호 :");
        int carSn = scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 이름 :");
        String carName = scan.nextLine();

        System.out.println("자동차 가격 :");
        int carPrice = scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 소유자 :");
        String carOwner = scan.nextLine();

        System.out.println("자동차 연식 :");
        int carYear = scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 타입 :");
        String carType = scan.nextLine();

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
