public class Task3 {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        Node prev = null;
        Node now = head1;
        while(now!= null){
            Node next = now.next;
            now.next = prev;
             prev = now;
             now = next;
        }
        Node reversedHead1 = prev; 
        Node sumDummy = new Node(0);
        Node sumTail = sumDummy;
        Node x = head2;
        Node y = head3;

        while(x!=null || y!=null){
            int sum = 0;
            if(x!= null){
                sum += (int)x.elem;
                 x = x.next;
            }
            if(y!= null){
                sum += (int)y.elem;
                 y = y.next;
            }
            sum = sum % 10; 
            sumTail.next = new Node(sum, null);
            sumTail = sumTail.next;
        }

        Node dummy = new Node(0);
        Node tail = dummy;
        Node temp = reversedHead1;

        while(temp!= null){
            tail.next = new Node(temp.elem, null);
            tail = tail.next;
             temp = temp.next;
        }

        temp = sumDummy.next;
        while(temp != null){
            tail.next = new Node(temp.elem, null);
            tail = tail.next; 
            temp = temp.next;
        }

        return dummy.next;
    }
    

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = Task3.idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = Task3.idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
