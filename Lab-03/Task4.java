// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){
        int row = matrix.length;
        int col = matrix[0].length;

        int nrow = row/2;
        int ncol = col/2;

        Integer [][] newarr = new Integer[nrow][ncol];
        for(int i = 0 ; i<row;i+=2){
            for(int j = 0 ; j <col; j+=2){
                int sum1 = matrix[i][j];
                int sum2 = matrix[i][j+1];
                int sum3 = matrix[i+1][j];
                int sum4 = matrix[i+1][j+1];

                int sum = sum1 +sum2 +sum3 +sum4;

                newarr[i/2][j/2] = sum;
            }

        }
        //For this task you'll need to create new 2D array
        
        //TO DO

        //remove the line below and return the newly created Compressed 2D matrix
        return newarr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}