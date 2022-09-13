import java.util.Scanner;
public class vowel_consonant {
    public static void main(String[] args) {

        char chr;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value :");

        chr=sc.next().charAt(0);

        System.out.println("char=" +chr);
        switch(chr){
            case 'a':
                System.out.println("vowel");
                break;

            case 'e':
                System.out.println("vowel");
                break;

            case 'i':
                System.out.println("vowel");
                break;

            case 'o':
                System.out.println("vowel");
                break;

            case 'u':
                System.out.println("vowel");
                break;

            default:
                System.out.println("consonant");

        }
    }
}
