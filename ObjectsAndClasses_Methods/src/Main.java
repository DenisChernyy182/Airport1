public class Main {

    public static void main(String[] args) {
        Basket basketDima = new Basket();
        basketDima.add("Milk", 10, 1, 2.5);
        basketDima.add("Meat", 10, 1, 2.5);
        basketDima.add("Breat", 10, 1, 0.5);
        basketDima.add("Cheese", 10, 1, 1);
        basketDima.print("Корзина Димы");
        double vesD = basketDima.getTotalWeight();
        System.out.println("Общий вес товара: " + vesD + "кг.");
        System.out.println("Общее количество товаров: " + Basket.getItemCountForAllBaskets());
        System.out.println("Общая стоимость товаров корзины: " + Basket.getCostForAllBaskets() + " руб.");
        System.out.println();

        Basket basketNina = new Basket();
        basketNina.add("Milk", 10, 1, 1.5);
        basketNina.add("Meat", 10, 1, 2.5);
        basketNina.add("Breat", 10, 1, 0.5);
        basketNina.add("Cheese", 10, 1, 1);
        basketNina.add("Oil", 10, 1, 1);
        basketNina.print("Корзина Нины");
        double vesN = basketNina.getTotalWeight();
        System.out.println("Общий вес товара: " + vesN + "кг.");
        System.out.println("Общее количество товаров: " + basketNina.getCostOneBasket());
        System.out.println("Общая стоимость товаров корзины: " + basketNina.getTotalPrice() + " руб.");
        System.out.println();
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.averageBasket() + " руб.");
        System.out.println("Средняя стоимость корзин: " + basketNina.averageCostAll() + " руб.");




        Arithmetic arithmetic = new Arithmetic(2, 3);
        System.out.println("сумма чисел = " + (arithmetic.sum()));
        System.out.println("произведение чисел = " + (arithmetic.multiplication()));
        System.out.println("большее число = " + arithmetic.max());
        System.out.println("меньшее число = " + arithmetic.min());
    }
}
