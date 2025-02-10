import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        //factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out the sum of natural numbers: ");
        int n =sc.nextInt();

        System.out.println("Sum of " + n+ " is "+sumN(n));
    }
    public static  int sumN(int i){

        if(i==0 || i ==1){
            return 1; //base case

        }
        else{
            return i+sumN(i-1); //recursive case
        }
    }
}
