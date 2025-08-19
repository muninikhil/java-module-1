import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }
        sc.close();
    }
}