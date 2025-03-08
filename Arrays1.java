import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {

//        Reverse the array
        int[] num = {12,54,98,6,80,34,83};
        int left=0; int right= num.length - 1;
        System.out.println("Original num is = "+Arrays.toString(num));
        int temp;
        while (left<right){
            temp=num[left];
            num[left] = num[right];
            num[right]=temp;
left++; right--;
        }
        System.out.println("Reverse num is = "+Arrays.toString(num));



        int[] marks = {67,90,75,83,86};
        System.out.println("Original marks : "+ Arrays.toString(marks));

        Arrays.sort(marks);
        System.out.println("Sorted Marks are :"+Arrays.toString(marks));

        System.out.println("Copied array :"+Arrays.toString(Arrays.copyOf(marks,marks.length)));

       System.out.println("Copied Range : " + Arrays.toString(Arrays.copyOfRange(marks, 1, 4)));
    }


}
