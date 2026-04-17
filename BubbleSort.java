import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] data = {88, 92, 85, 90, 87, 93, 84, 89, 91, 86};

        System.out.println("===== BUBBLE SORT =====");

        System.out.println("\nSEBELUM DIURUTKAN");
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(data));
        System.out.println("---------------------------");

        for (int i = 0; i < data.length - 1; i++) {

            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

            System.out.println("Iterasi " + (i + 1) + ": " + Arrays.toString(data));
        }

        System.out.println("---------------------------");
        System.out.println("SESUDAH DIURUTKAN");
        System.out.println(Arrays.toString(data));
    }
}