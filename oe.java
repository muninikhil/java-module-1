import java.util.Scanner;
public class oe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter a number");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
