import java.util.Scanner;

public class MethodsOf_String {
    public static void main(String[] args) {
        String s1="hello";
        String s2 ="World";
        System.out.println(s1+" "+s2);
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter first name");
//         String a1= sc.next();
//        System.out.println("Enter last name");
//        String a2= sc.next();
        String input= sc.nextLine();
        System.out.println("Input - "+input);
        int index=0;
        for (int i=0; i<input.length();i++){
            if (input.charAt(i)==' '){
                index= i;
            }
        }
        System.out.println("Output - "+input.charAt(0)+"."+ input.substring(index+1));
    }

}
//System.out.println("Output - "+input.charAt(0)+"."+ input.substring(input.indexOf(" ")+1, input.length()-input.indexOf(" ")-1));
// System.out.println("Output - "+input.charAt(0)+"."+ );