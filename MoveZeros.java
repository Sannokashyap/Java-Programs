
public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 5, 0, 12,0};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }x
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
