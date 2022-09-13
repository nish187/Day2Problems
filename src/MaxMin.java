import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value Of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the Value Of b : ");
        int b=sc.nextInt();
        System.out.println("Enter the Value of c : ");
        int c= sc.nextInt();
        int expr1=a+b*c;
        int expr2=c+a/b;
        int expr3=a%b+c;
        int expr4=a*b+c;
        int Max=Math.max(expr1 , expr2 );
        int Min=Math.min(expr3 ,expr4);
        System.out.println("The Max Expr is: "+Max);
        System.out.println("The Min Expr is: "+Min);

    }
}
