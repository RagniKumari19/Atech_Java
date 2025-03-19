public class transpose1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("This is a real matrix");
        show_Matrix(matrix);
        int rows = matrix.length;
        int column = matrix[0].length;
        int[][] transpose = new int[rows][column];
        for (int i=0; i<rows; i++){
            for (int j=0; j<column;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println("This is a transpose matrix" );
        show_Matrix(transpose);
    }
    static void show_Matrix(int[][] matrix){
       for (int[] rows:matrix){
           for (int num : rows){
               System.out.print(num+" ");
           }
           System.out.println();
       }
    }

}

