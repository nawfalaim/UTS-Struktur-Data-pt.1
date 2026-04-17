import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] data = {88, 92, 85, 90, 87, 93, 84, 89, 91, 86};

        System.out.println("===== INSERTION SORT =====");

        System.out.println("\nSEBELUM DIURUTKAN");
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(data));
        System.out.println("---------------------------");

        for (int i = 1; i < data.length; i++) {

            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;

            System.out.println("Iterasi " + i + ": " + Arrays.toString(data));
        }

        System.out.println("---------------------------");
        System.out.println("SESUDAH DIURUTKAN");
        System.out.println(Arrays.toString(data));
    }
}