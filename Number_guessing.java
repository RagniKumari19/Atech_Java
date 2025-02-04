

import java.util.Random;
import java.util.Scanner;

public class Number_guessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        int num = random.nextInt(100);
        int input,score = 100;
        int attempts=0;
        boolean matched = false;
        while(!matched){
            System.out.println("Enter a number of your choice:");
             input = sc.nextInt();
            if(input==num){
                System.out.println("Hurray! you guess it right");
                System.out.println("your score is:" +score);
                System.out.println("No. of attempts--> "+attempts);
                matched=true; //to end the loop here

            } else if (input>num) {
                System.out.println("Think small");
                score--;
                attempts++;
            }
            else {
                System.out.println("Think big");
                score--;
                attempts++;
            }
        }

    }
}
