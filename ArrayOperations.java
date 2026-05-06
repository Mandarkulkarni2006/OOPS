import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        System.out.println("Array Elements:");

        for(int i=0; i<n; i++) {

            System.out.print(arr[i] + " ");

            sum += arr[i];

            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        double avg = (double)sum / n;

        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}