import java.util.Scanner;
public class ForPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The number: ");
        int num= sc.nextInt();
        int rev=0,temp=num;
        for(;num>0;num=num/10){
            int rem=num % 10;
            rev=rev*10+rem;

        }if(rev==temp){
            System.out.println( rev + "The Number is Palindrome");
        }else{
            System.out.println( rev + "This is Not Palindrome Number");
        }
    }
}
