import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
int b = sc.nextInt();

        System.out.println(++a);
        System.out.println(a--);


        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a^b);




    }
}
