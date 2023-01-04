import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        binarySearch();
    }

    private static void binarySearch(){

        Scanner in = new Scanner(System.in);
        int min = 1;
        int max  = 100;
        int middle = (max + min)/2;
        int counterIter = 0;

        System.out.println("Загадайте число от 1 до 100.");

        String s;
        for (int i = 0; i < 8; i++) {
            counterIter++;
            System.out.println("Ваше число - " + middle +"?\n"  +
                    "Нажмите \"+\", если загаданное число больше \n " +
                    "\"-\" если загаданное число меньше \n " +
                    "\"=\" если это загаданное число");
            s = in.nextLine();
            switch (s) {
                case "+":
                    min = middle;
                    middle = (max + min) /2;
                    break;
                case "-":
                    max = middle;
                    middle = (max + min) /2;
                    break;
                case "=":
                    System.out.println("Ваше число = " + middle);
                    System.out.println("Понадобилось " + counterIter + " попыток");
                    return;
                default:
                    System.out.println("Попробуйте еще раз!");
            }
        }
    }
}