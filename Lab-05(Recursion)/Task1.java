import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        // TODO: Implement this using a loop
        for(int i =1 ; i <=10 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        // TODO: Implement this recursively
        if(i<=10){
            System.out.print(i + " ");
            task1B_recursive(i+1);
        }
        else System.out.println();
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        // TODO: Implement this using a loop
        for(int i = 1; i <=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        // TODO: Implement this recursively
        if(i<=n){
            System.out.print(i + " ");
            task1D_recursive(i+1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Driver code for testing Task 1 methods
        // Write on your own
        System.out.println("Printing the numbers 1 to 10 using a loop");
        task1A();
        System.out.println();
        System.out.println("Printing the numbers 1 to 10 using recursion");
        task1B_recursive(1);

        System.out.println("Printing the numbers 1 to n using a loop");
        int n = sc.nextInt();
        task1C(n);
        System.out.println("Printing the numbers 1 to n using recursion");
        System.out.println("Enter the value of n:");
        int n1 = sc.nextInt();
        task1D_recursive(1, n1);

        sc.close();
    }
}
