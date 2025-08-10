import java.util.Scanner;
public class MinMax { 
    public static void main(String[] args) { 
        int[] arr = {10, 2, 10, 15, 70, 25}; 
        int max = arr[0]; 
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > max) { 
                max = arr[i]; 
            } 
            if (arr[i] < min) { 
                min = arr[i]; 
            } 
        } 
        System.out.println("The largest element is: " + max); 
        System.out.println("The smallest element is: " + min); 
    } 
}