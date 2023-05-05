import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(1,
                1,
                 "Moskov",
                true,
                "123",
                true);
        System.out.println("Габариты: " + (dimensions.getDimensions()));
        System.out.println("Масса: " + (dimensions.getWeight()));
        System.out.println("Адресс доставки: " + (dimensions.getDeliveryAddress()));
        System.out.println("Перевернутый: " + (dimensions.isFragile()));
        System.out.println("Номер регистрации: " + (dimensions.getRegistrationNumber()));
        System.out.println("Хрупкий: " + (dimensions.isFragile()));
        System.out.println();




        Elevator elevator = new Elevator(-3,26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }



    }
}