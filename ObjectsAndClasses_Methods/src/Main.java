public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk",40,1,1.5);
        basket.add("Meat", 100,1,2.5);
        basket.add("Breat", 120,1,0.5);
        basket.print("Корзина");

       double ves = basket.getTotalWeight();
       System.out.println("Общий вес товара: " + ves + "кг.");





        Arithmetic task1 = new Arithmetic(5, 7);

    }


}
