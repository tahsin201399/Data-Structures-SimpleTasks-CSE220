//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        int row = matrix.length;
        int col = matrix[0].length;
        int[] Sum = new int[col];
        for(int c = 0; c < col; c++){
            int sum = 0;
            for(int r = 0; r < row; r++){
                sum += matrix[r][c];
            }
            Sum[c] = sum;
        }
        Integer[] decrypted = new Integer[col - 1];
        for (int i = 1; i < col; i++) {
            decrypted[i - 1] = Sum[i] - Sum[i - 1];
        }

        return decrypted;
        

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}