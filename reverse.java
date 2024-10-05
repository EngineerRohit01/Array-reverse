import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};

        int[] swappedArray = swap(arr);

        int i = 0;
        while (i < swappedArray.length) {
            System.out.print(Arrays.toString(swappedArray));
            i++; // Increment i to avoid infinite loop
        }
    }

    public static int[] swap(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
            i++;
        }
        return arr; // Return the modified array
    }
}
