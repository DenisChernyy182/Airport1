public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        System.out.println();

        for (char i = 'Ё'; i <= 'ё'; i++) {
            if ((i > 'Ё' && i < 'А') || (i > 'я' && i < 'ё')) {
                continue;
            }
            System.out.println((int) i + " - " + i );
        }
    }
}

