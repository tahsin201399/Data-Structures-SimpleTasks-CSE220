// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO
        if(root == null){
            return 0;
        }
        return DjiksterAlgo(root.left , root.right); // remove this line
    }

    private static Integer DjiksterAlgo(BSTNode l, BSTNode r){
        if(l == null ){
            return 0;
        }
        if(r == null){
            return 0;
        }
        int curr = l.elem + r.elem;
        int outsum= DjiksterAlgo(l.left, r.right);
        int insum= DjiksterAlgo(l.right, r.left);
        return curr + outsum + insum;
        
    }
    //===============================================================


}
