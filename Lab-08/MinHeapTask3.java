import java.util.Arrays;

public class MinHeapTask3 {
    private int [] heap;
    private int size;
    private int capacity;
    public MinHeapTask3(int capacity){
        this.capacity = capacity;
        this.size=0;
        this.heap= new int[capacity];
    }
    public void insert(int val){
        if(size>= capacity){
            System.out.println("No space in the heap");
            return;
        }
        heap[size]= val;
        swim(size);
        size++;
    }
    public void delete(int indx){
        if(indx<0 || indx>= size){
            System.out.println("Index out of bounds!");
            return;
        }
        System.out.println("Delete: " + heap[indx]);
        heap[indx]= heap[size-1];
        size--;
        sink(indx);
        swim(indx);
    }
    public void swim(int indx){
        int parent = (indx-1)/2;
        while(indx >0&& heap[indx]<heap[parent]){
            swap(indx , parent);
            indx = parent;
            parent = (indx-1)/2;
        }

    }
    public void swap(int i, int j){
        int temp = heap[i];
        heap[i]= heap[j];
        heap[j]= temp;
    }

    public int extractMin(){
        if(size<=0){
            System.out.println("Heap is empty!");
            return -1;
        }
        int temp = heap[0];
        heap[0]= heap[size-1];
        size--;
        sink(0);
        return temp;
    }
    public void sink(int indx){
        int leftc = 2*indx+1;
        int rightc = 2*indx+2;
        if(leftc>= size){
            return;
        }
        int smallest = leftc;
        if(rightc<size && heap[rightc]<heap[smallest]){
            smallest = rightc;
        }
        if(heap[indx]>heap[smallest]){
            swap(indx, smallest);
            sink(smallest);
        }
    }
    public int [] sort(){
        int originalSize = size;
        int[] heapCopy = new int[originalSize];
        for (int i = 0; i < originalSize; i++){
            heapCopy[i] = heap[i];
        }
        int[] sorted = new int[originalSize];
        for(int i = 0; i < originalSize; i++){
            sorted[i] = extractMin();
        }
        for(int i = 0; i < originalSize; i++){
            heap[i] = heapCopy[i];
        }
        size = originalSize;
    
        return sorted;
    }

    public void printerHeap(){
        for(int i = 0; i < size; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static int [] tasksoperator(int [] arr, int m){
        MinHeapTask3 min = new MinHeapTask3(m);
        for(int i = 0; i < m; i++){
            min.insert(0); 
        }
        for(int i = 0 ; i < arr.length; i++){
            int mload = min.extractMin();
            mload += arr[i];
            min.insert(mload);
        }
        int [] res = new int[m];
        for(int i = 0; i < m; i++){
            res[i] = min.extractMin(); 
        }
        return res;
    }

    public static void main(String [] args){
        MinHeapTask3 min= new MinHeapTask3(11);
        min.insert(5);
        min.insert(3);
        min.insert(8);
        min.insert(1);
        min.insert(2);
        min.insert(4);
        min.insert(7);
        min.insert(6);
        min.insert(9);
        min.insert(0);
        min.insert(10);

        System.out.println("After inserting -Heap: ");
        min.printerHeap();
        System.out.println("Delete index 3: ");
        min.delete(3);
        System.out.println("Heap after deleting index 3: ");
        min.printerHeap();
        System.out.println("Heap before extracting min: ");
        min.printerHeap();
        System.out.println("Minimum value in the Heap : " + min.extractMin());
        System.out.println();
        System.out.println("Heap after extracting min: ");
        min.printerHeap();

        int sorted[] = min.sort();
        System.out.println("Sorted Heap: ");
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]+" ");
        }
        System.out.println();

        int [] arr = {2,4,7,1,6};
        int m = 4;
        int [] mload = tasksoperator(arr, m);
        System.out.println("Minimum load of each machine: " + Arrays.toString(mload));
      
        System.out.println();
    
    }
}
