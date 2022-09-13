import java.util.Scanner;
public class ForReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num= sc.nextInt();
        int rev=0;
        for(;num != 0; num=num/10){
            int rem = num % 10;
            rev= rev * 10 + rem;

        } System.out.println("The Reverse Valse is: " +rev);
    }
}
