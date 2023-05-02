public class Arithmetic {

    int parametr1;
    int parametr2;




    public Arithmetic(int parametr3, int parametr4) {
        parametr1 = parametr3;
        parametr2 = parametr4;
        System.out.println();
        System.out.println("Калькулятор");
    }

    public void sum() {
        System.out.println("сумма чисел = " + (parametr1 + parametr2));
    }

    public void multiplication() {
        System.out.println("производная чисел = " + (parametr1 * parametr2));
    }

    public void maxMin() {
        if (parametr1 > parametr2) {
            System.out.println("максимальное из двух чисел = " + parametr1);
        } else {
            System.out.println("максимальное из двух чисел = " + parametr2);
        }
        if (parametr1 < parametr2) {
            System.out.println("минимальное из двух чисел = " + parametr1);
        } else {
            System.out.println("минимальное из двух чисел = " + parametr2);
        }
    }
}

