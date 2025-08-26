import java.util.Scanner;
public class countofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] rr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            rr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < rr.length; i++) {
            if(rr[i]>50)
             count++;
        }
        System.out.println("Total numbers: " + count);
    }
 }