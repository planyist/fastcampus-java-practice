package part3;

import model.CarDTO;

import java.util.Scanner;

public class CarTest {
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

        carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);


        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        carInfoPrint(car);
    }

    public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType) {
        System.out.println(carSn + "\t"
                + carName + "\t"
                + carPrice + "\t"
                + carOwner + "\t"
                + carYear + "\t"
                + carType);
    }

    public static void carInfoPrint(CarDTO car) {
        System.out.println(car.carSn + "\t"
                + car.carName + "\t"
                + car.carPrice + "\t"
                + car.carOwner + "\t"
                + car.carYear + "\t"
                + car.carType);
    }
}
