// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        // TO DO
        if(root == null) {
            return null;
        }
        if(root.elem== key) {
            return root.elem.toString();
        }
        else if(key < root.elem){
            String l = findPath(root.left, key);
            if(l!=null){
            return root.elem + " " + l;
            }
        } 
        else{
            String r = findPath(root.right, key);
            if(!r.equals("No Path Found")){
                return root.elem + " " + r;
            }
        }
        return "No Path Found";
        
    }
    //============================================================================

}
