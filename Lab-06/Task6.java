// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO

        return factNegSum(root,0); //remove this line
    }
    //============================================================================

    private static int factNegSum(BTNode x , int levl){
        BTNode temp = x;
        if(temp == null){
         return 0;
        }
        int a = (Integer)temp.elem;
        if(levl%2==0){
            a = (-1)*a;
       }
       int l = factNegSum(temp.left,levl+1);
       int r = factNegSum(temp.right,levl+1);
         return a + l + r;

    }
}