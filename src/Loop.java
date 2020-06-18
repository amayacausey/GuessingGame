import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String [] args){

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10)+1;

        System.out.println("I am thinking about a number between 1 and 10 \nCan you guess it?");
        Scanner sc=new Scanner(System.in);
        int userNumber;
       do {
            userNumber = sc.nextInt();

       if (userNumber < randomNumber){
           System.out.println("Your guess is too low. Try again !");
       } else if (userNumber > randomNumber)
         {
             System.out.println("Your guess is too high. Try again!");
        }

       } while (userNumber != randomNumber);



        System.out.println("You guessed it!");


    }
}
