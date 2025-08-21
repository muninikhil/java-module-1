import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1= sc.nextInt();
        System.out.println("enter the second number");
        int n2= sc.nextInt();
        if(n1>n2)
        {
            System.out.println("the greater number is" + n1);
        }else if (n1 < n2) {
            System.out.println("the greater number is" + n2);
        }else
        {
            System.out.println("both numbers are equal");
        }
    }
}
