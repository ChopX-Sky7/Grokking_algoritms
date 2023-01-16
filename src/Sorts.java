import java.util.Scanner;

public class Sorts {

    public static void selectionSort() { //допишу позже, возможно переделаю в список
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int arrSize = in.nextInt();
        System.out.println("Размер массива = " + arrSize);

        System.out.println("Введите минимальный элемент массива: ");
        int min = in.nextInt();
        System.out.println("Минимальный элемент массива = " + min);

        System.out.println("Введите максимальный элемент массива: ");
        int max = in.nextInt();
        System.out.println("Максимальный элемент массива = " + max);

        int[] array = Tools.getIntArray(arrSize, min, max);

        System.out.println("Что вы хотите сделать? \n 1. Найти максимум. \t 2. Найти минимум \t 3.Отсортировать");

    }
}
