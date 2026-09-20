import java.util.*;

class secondLargest {
    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = max;

  
        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondMax);
    }
}
