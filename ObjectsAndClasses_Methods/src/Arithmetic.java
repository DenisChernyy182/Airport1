public class Arithmetic {

    public int parametr1;
    public int parametr2;


    public Arithmetic(int parametr3, int parametr4) {
        parametr1 = parametr3;
        parametr2 = parametr4;
        System.out.println();
        System.out.println("Калькулятор");
    }

    public int sum() {
       return parametr1 + parametr2;
    }

    public int multiplication() {
        return parametr1 * parametr2;
    }

    public int max() {
        if (parametr1 > parametr2) {
            return parametr1;
        } else {
            return parametr2;
        }
    }

    public int min() {
        if (parametr1 < parametr2) {
            return parametr1;
        } else {
            return parametr2;
        }
    }

}

