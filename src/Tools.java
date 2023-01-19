import java.util.Random;
import java.util.Scanner;

public class Tools {

    private static final String STAR_LINE = "**********";

    public static int[] setArray() {
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
        System.out.println("Первоначальный массив:");
        Tools.printOneDArray(array);
        return array;
    }


    public static float[] getFloatArray(int size, int min, int max) {
        Random r = new Random();

        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextFloat(min, max);
        }
        return arr;
    }

    public static int[][] getTwoDimIntArray(int size, int min, int max) {
        Random r = new Random();

        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(min, max);
            }
        }
        return arr;
    }


    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void printOneDArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println("\n" + STAR_LINE);
    }

    private static int[] getIntArray(int size, int min, int max) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(min, max);
        }
        return arr;
    }


}