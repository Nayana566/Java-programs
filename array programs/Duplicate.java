import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input only non-zero elements
        System.out.println("Enter  non-zero elements:");
        for (int i = 0; i < n; i++) {
            int val;
            do {
                val = sc.nextInt();
                if (val == 0) {
                    System.out.print("Zero not allowed, enter again: ");
                }
            } while (val == 0);
            arr[i] = val;
        }

        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    break; 
                }
            }
            if (j == newSize) { 
                temp[newSize++] = arr[i];
            }
        }


        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}

