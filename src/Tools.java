import java.util.Random;

public class Tools {


    public static int[] getIntArray(int size, int min, int max) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(min, max);
        }
        return arr;
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

    public static void swapElements(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
