import java.util.Scanner;
public class ForNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num =sc.nextInt();
        int sum=0;
        for(int i=1; i<=num; i++){
            sum= (num*(num+1)/2);}
            System.out.println("The Sum of Natural Number is: " +sum);

    }
}
