public class bubblesort {
    public static void main (String [] args){
        int x [] = {1,5,7,6,3,2,9,4};
        int temp = 0;
        int size = x.length;

        System.err.println("After sortng : ");

        for(int i = 0 ; i < size; i ++){
            for (int j = 0 ; j < size-1; j++){
                if(x[j] > x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        for(int num : x){
            System.out.print(num + " ");
        }
    }
}
