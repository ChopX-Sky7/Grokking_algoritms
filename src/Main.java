import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Это программа, демонстрирующая работу различных алгоритмов. Какой из них вы хотите посмотреть?");
        System.out.println("1. Бинарный поиск \t 2. Пузырьковая сортировка \t 3. Решето Эратосфена");
        System.out.println("Ваш выбор?");
        String selection = in.nextLine();

        switch (selection) {
            case "1":
                Algos.binarySearch();
                break;
            case "2":
                int[] array = Tools.setArray();
                Sorts.bubbleSort(array);
                break;
            case "3":
                Algos.sieveEratosthenes();
                break;
            default:
                System.out.println("Выбран несуществующий пункт!");
        }

    }


}