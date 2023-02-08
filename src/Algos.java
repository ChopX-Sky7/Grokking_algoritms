import java.util.Scanner;

public class Algos {
    protected static Scanner in = new Scanner(System.in);

    public static void binarySearch() {
        System.out.println("Загадайте число, а программа его отгадает!");
        System.out.println("Введите нижнюю границу поиска");
        int min = 0;
        min = in.nextInt();
        System.out.println("Введите верхнюю границу поиска");

        int max = 0;
        max = in.nextInt();

        int middle = (max + min) / 2;
        int counterIter = 0;

        System.out.println("Загадайте число от " + min + " до " + max);
        String answer = "";
        while (answer != "=") {
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

    public static void sieveEratosthenes() {
        System.out.println("Введите границу поиска");
        int size = in.nextInt();
        boolean[] Barray = new boolean[size];
        int[] Iarray = Tools.getSortintArray(size, 2);
        for (int i = 0; i < Barray.length; i++) {
            Barray[i] = true;
        }
        for (int i = 2; i < size; i++) {
            if (Barray[i] != false) {
                for (int j = i; i * j < size; j++) {
                    Barray[i * j] = false;
                }
            }
        }
        for (int i = 2; i < Barray.length; i++) {
            if (Barray[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
