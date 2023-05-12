public class Basket {
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 4000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    static int totalCount;
    static int totalCost;
    public int goodsInOneBasket;

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1,0);
    }

    public void add(String name, int price, int count, double weight) {
        totalWeight = totalWeight + weight * count;
        totalCount += count;
        goodsInOneBasket += count;
        totalCost = totalCost + count * price;


        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт.  " + price + " руб. " ;
        items = items + weight + " кг." ;
        totalPrice = totalPrice + count * price;
    }


    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
    public double getTotalWeight(){
        return totalWeight;
    }

    public static int getItemCountForAllBaskets() {
        return totalCount;
    }
    public static int getCostForAllBaskets() {
        return totalCost;
    }

    public static int averageBasket() {
        return getCostForAllBaskets() / totalCount;
    }

    public static int averageCostAll() {
        return totalCost / count;
    }

    public int getGoodsInOneBasket() {
        return goodsInOneBasket;
    }
}
