// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror( BTNode root ){
        // TO DO
        if(root == null){
            return null;
        }
        BTNode nRoot = new BTNode(root.elem);
        nRoot.right = convertMirror(root.left);
        nRoot.left = convertMirror(root.right);
        return nRoot;
    }
    //==================================================

}
