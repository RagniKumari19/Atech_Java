import java.util.Scanner;

public class switchStatement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to know the week day: ");
            int i =sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("It's Sunday");
                    break;
                case 2:
                    System.out.println("It's Monday");

                    break;
                case 3:
                    System.out.println("It's Tuesday");
                    break;
                case 4:
                    System.out.println("It's Wednesday");
                    break;
                case 5:
                    System.out.println("It's Thursday");
                    break;
                case 6:
                    System.out.println("It's Friday");
                    break;
                case 7:
                    System.out.println("It's Saturday");
                    break;
                default:
                    System.out.println("Wrong Input");
            }

        }


}
