import java.util.Scanner;
public class NaturalNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number To Sum: ");
        int num = sc.nextInt();
        int  sum=0, i=1;
        while(i<=num){
            sum=(num*(num+1)/2);
            i++;
        }
        System.out.println("Sum of Natural Number is: " +sum);

    }
}
