
import java.util.Arrays;

public class arrayFill {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6,7},{8,9,7}};
        int[][] copy = new int[arr.length][];
        for (int i=0;i< arr.length;i++){
            copy[i]=Arrays.copyOf(arr[i],arr[i].length);
        }
        arr[2][1]=1;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(copy));
        //for 1D Array
        int[] fills = new int[4];
        Arrays.fill(fills,23);

        System.out.println(Arrays.toString(fills));

        //for 2D Array
        int[][] arr6 = new int[3][4];
        for (int[] row:arr6){
            Arrays.fill(row,1);

        }
        System.out.print(Arrays.deepToString(arr6));
        System.out.println();


    }
}
