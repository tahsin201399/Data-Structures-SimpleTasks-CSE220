public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
        int summation = 0;
        int indx = 0;
        while (distArr.length > indx){
            int dist= distArr[indx];
            Node xhead = head;
            int i = 0;
            while (i < dist && xhead!=null){
                xhead=xhead.next;
                i++;
            }
            if(xhead!=null){
                summation += (int)xhead.elem;
            }
            indx++;
            
        }
        return summation;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = Task5.sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
