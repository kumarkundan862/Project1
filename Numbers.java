/*Tihis is the commit option doen*/
afdsafage om. jompany;
import java.util.Scanner;
public class Numbers {

    public static void main(String[] args) {
          /*
          System.out.println("Hello IntelliJ");

        int a = 5; int b = 4; int c = 3;

        int z = a + b - c * a;

        System.out.println(z);

    }
}
*/
        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){
            ones = number % 10 ;
            number = number/10;
            tens = number % 10 ;
            number = number/10;
            hundreds = number % 10 ;
            number = number/10;
            thousands = number % 10 ;
            number = number/10;
            tenThousands= number % 10 ;
            number = number/10;
            System.out.println(tenThousands+"\n"+thousands+"\n"+hundreds+"\n"+tens+"\n"+ones);
              fvdg fh h!q
		     t
		    :wq

