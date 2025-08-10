import java.util.Scanner;
public class SumEven { 
    public static void main(String[] args) { 
        int[] arr = {16, 2, 3, 4, 5, 6, 7, 8, 12, 10}; 
        int sum = 0; 
        for (int element : arr) { 
            if (element % 2 == 0) { 
                sum += element; 
            } 
        } 
        System.out.println("The sum of even elements is: " + sum); 
    }
}