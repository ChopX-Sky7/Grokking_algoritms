import java.util.Scanner;

public class Algos {

    public static void binarySearch() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите нижнюю границу поиска");
        int min = 0;
        min = in.nextInt();
        System.out.println("Введите верхнюю границу поиска");

        int max = 0;
        max = in.nextInt();

        int middle = (max + min) / 2;
        int counterIter = 0;

        System.out.println("Загадайте число от " + min + " до " + max);
        String crutch = "1";
        String answer;

        while (crutch != "=") {
            counterIter++;
            System.out.println("Ваше число - " + middle + "?\n" +
                    "Нажмите \"+\", если загаданное число больше \n " +
                    "\"-\" если загаданное число меньше \n " +
                    "\"=\" если это загаданное число");
            answer = in.nextLine();
            switch (answer) {
                case "+":
                    min = middle;
                    middle = (max + min) / 2;
                    break;
                case "-":
                    max = middle;
                    middle = (max + min) / 2;
                    break;
                case "=":
                    System.out.println("Ваше число = " + middle);
                    System.out.println("Понадобилось " + counterIter + " итераций");
                    return;
                default:
                    System.out.println("Попробуйте еще раз!");
            }
        }
    }
}
