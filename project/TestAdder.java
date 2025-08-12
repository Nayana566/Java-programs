import mypackage.Adder;
import java.util.Scanner;

public class TestAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Adder adder = new Adder();
        int sum = adder.add(a, b);

        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
