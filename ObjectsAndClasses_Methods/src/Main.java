public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 1.5);
        basket.add("Meat", 100, 1, 2.5);
        basket.add("Breat", 120, 1, 0.5);
        basket.add("Cheese", 1220, 1, 1);
        basket.print("Корзина");

        double ves = basket.getTotalWeight();
        System.out.println("Общий вес товара: " + ves + "кг.");

        System.out.println("Общее количество товаров: " + Basket.getItemCountForAllBaskets());
        System.out.println("Общая стоимость товаров: " + Basket.getCostForAllBaskets());



        Arithmetic arithmetic = new Arithmetic(2, 3);
        System.out.println("сумма чисел = " + (arithmetic.sum()));
        System.out.println("произведение чисел = " + (arithmetic.multiplication()));
        System.out.println("большее число = " + arithmetic.max());
        System.out.println("меньшее число = " + arithmetic.min());
    }


}
