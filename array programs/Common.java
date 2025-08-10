
import java.util.Scanner; 
public class Common { 
public static void main(String[] args) { 
int[] arr1 = {10, 2, 5, 8, 9, 12}; 
int[] arr2 = {1, 7, 5, 10, 18, 15}; 
System.out.print("Common elements are: "); 
for (int i = 0; i < arr1.length; i++) { 
for (int j = 0; j < arr2.length; j++) { 
if (arr1[i] == arr2[j]) { 
System.out.print(arr1[i] + " "); 
break; 
} 
} 
} 
} 
}