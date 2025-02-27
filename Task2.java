//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){
        int i = 0 ;
        int j = height.length -1;
        int max = 0;

        while (i < j){
            int leftH = height[i];
            int rightH = height[j];

            int min;

            if(leftH < rightH){
                min = leftH;

            }
            else{
                min = rightH;
            }
            int width = j-i;
            int area = min * width;
            if (area > max){
                max = area;

            }
            if(leftH < rightH){
                i++;
            }
            else{
                j--;
            }
            
        }
        System.out.println(max);

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
