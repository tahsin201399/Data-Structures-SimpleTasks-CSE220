// Task04: Word Decoder
public class Task2 {

    public static Node wordDecoder( Node head ){
        
        Node dummy = new Node(null);
        Node currdecoder = dummy;
        Node now = head;
        int count = 0;
        while(now != null){
            count++;
            now = now.next;
        }
        now = head;
        int index = 0;
        while (now != null){
            if(index % (13%count)==0 && index != 0){
                currdecoder.next = new Node(now.elem);
                currdecoder = currdecoder.next;
            }
            index++;
            now = now.next;
        }
        Node prev = null;
        Node current = dummy.next;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        dummy.next = prev;
        

        return dummy.next;
    }
 

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
