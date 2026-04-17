import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] data = {88, 92, 85, 90, 87, 93, 84, 89, 91, 86};

        System.out.println("===== SELECTION SORT =====");

        System.out.println("\nSEBELUM DIURUTKAN");
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(data));
        System.out.println("---------------------------");

        for (int i = 0; i < data.length - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;

            System.out.println("Iterasi " + (i + 1) + ": " + Arrays.toString(data));
        }

        System.out.println("---------------------------");
        System.out.println("SESUDAH DIURUTKAN");
        System.out.println(Arrays.toString(data));
    }
}