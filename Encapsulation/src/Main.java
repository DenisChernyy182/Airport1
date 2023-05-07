import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(1,2,3);
        dimensions = dimensions.setLength(100);
        dimensions = dimensions.setWidth(800);
        dimensions = dimensions.setHeight(600);
        StorageOfCargoInformation cargoInformation = new StorageOfCargoInformation(50,
                "Москва",
                dimensions,
                "К123Е54",
                true,
                true,
                4,
                1,
                1);
        cargoInformation = cargoInformation.setWeight(192);
        System.out.println(cargoInformation);
        System.out.println("Объем товара- " + (dimensions.volume()) / 1000 + " " + "см.кв");
        System.out.println();


        Elevator elevator = new Elevator(-3,26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}