import java.util.Scanner;

public class MethodOverloadingTask {
    public static void main(String[] args) {
        //make a program using method overloading in which you can add 3 integers, 2 integers and
        // 3 float numbers
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of your wish");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        float f1 =sc.nextFloat();
        float f2 =sc.nextFloat();
        float f3 =sc.nextFloat();
        s(a, b, c);
        s(a, b);
        s(f1, f2, f3);
    }
    public static void s(int a ,int b,int c){
        System.out.println(a+b+c +" The sum of 3 Integers");

    }
    public static void s(int a, int b){
        System.out.println(a+b +" The sum of two integers");
    }
    public static void s(float a,float b , float c){
        System.out.println(a+b+c +" The sum of three float numbers");
    }
}
