// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            //TO DO
            if(root == null){
                return -1;
            }
            return lvlmodwithvalues(root , 0); 
        }
        public static int lvlmodwithvalues(BTNode x , int lvl){
            
            if(x == null){
                return 0;
            }
            int a = (Integer)x.elem;
            if(lvl !=0){
                a = a % lvl;
            }
        int left = lvlmodwithvalues(x.left, lvl + 1);
        int right = lvlmodwithvalues(x.right, lvl + 1);

        return a + left + right;
        }
    }
        //============================================================================
