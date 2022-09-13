import java.util.Scanner;
public class UnitPosition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Position Place: ");
        int pos= sc.nextInt();
        if (pos == 1){
            System.out.println("It is Unit");
        }else if (pos == 10){
            System.out.println("It is Ten");
        }else if (pos == 100){
            System.out.println("It is Hundred");
        }else if (pos == 1000){
            System.out.println("It is Thousand");
        }else{
            System.out.println("Use Digit 1 10 100 1000");
        }

    }
}
