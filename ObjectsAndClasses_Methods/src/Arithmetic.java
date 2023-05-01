public class Arithmetic {

        int parametr1;
        int parametr2;

    public Arithmetic( int parametr3, int parametr4){
            parametr1 = parametr3;
            parametr2 = parametr4;
        System.out.println();
        System.out.println("Калькулятор");

            System.out.println("сумма чисел = " + (parametr3 + parametr4));
            System.out.println("производная чисел чисел = " + (parametr3 * parametr4));

            if (parametr3 > parametr4) {
                System.out.println("максимальное из двух чисел = " + parametr3);
            } else {
                System.out.println("максимальное из двух чисел = " + parametr4);
            }
            if (parametr3 < parametr4){
                System.out.println("минимальное из двух чисел = " + parametr3);
            } else {
                System.out.println("минимальное из двух чисел = " + parametr4);
            }
        }
    }

