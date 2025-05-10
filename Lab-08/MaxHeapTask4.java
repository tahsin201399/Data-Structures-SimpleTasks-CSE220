public class MaxHeapTask4 {
    private int [] heap;
    private int size;
    private int capacity;

    public MaxHeapTask4(int capacity){
        this.capacity = capacity;
        this.size=0;
        this.heap= new int[capacity];
    }

    public void insert(int val){
        if(size>=capacity){
            System.out.println("No space in the heap!");
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
        while(indx > 0 && heap[indx]>heap[parent]){
            swap(indx, parent);
            indx = parent;
            parent= (indx-1)/2;
        }
    }
    public void printHeap(){
        for(int i =0; i < size; i ++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int extractMax(){
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
        int leftc=2*indx+1;
        int rightc=2*indx+2;
        if(leftc>=size){
            return;
        }
        int largest = leftc;
        if(rightc < size && heap[largest]< heap[rightc]){
            largest = rightc;
        }
        if(heap[indx] < heap[largest]){
            swap(indx, largest);
            sink(largest);
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
            sorted[i] = extractMax();
        }
        for(int i = 0; i < originalSize; i++){
            heap[i] = heapCopy[i];
        }
        size = originalSize;
    
        return sorted;
    }
    
    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public static int [] FindTopK(int [] nums , int k){
        MaxHeapTask4 max = new MaxHeapTask4(nums.length);
        for(int i = 0 ; i < nums.length;i++){
            max.insert(nums[i]);
        }
        int [] newk = new int[k];
        for(int i = 0 ; i < k; i++){
            newk[i] = max.extractMax();
        }
        return newk;
    }
    public static void main(String[] args){
        MaxHeapTask4 max= new MaxHeapTask4(11);
        max.insert(5);
        max.insert(3);
        max.insert(8);
        max.insert(1);
        max.insert(2);
        max.insert(4);
        max.insert(7);
        max.insert(6);
        max.insert(9);
        max.insert(0);
        max.insert(10);

        System.out.println("After inserting -Heap: ");
        max.printHeap();
        System.out.println("Deleting index 3: ");
        max.delete(3);
        System.out.println("Heap after deleting index 3: ");
        max.printHeap();
        System.out.println("Heap before extracting max: ");
        max.printHeap();
        System.out.println("Maximum value in the heap: " + max.extractMax());
        System.out.println();
        System.out.println("Heap after extracting max: ");
        max.printHeap();
        int sorted[] = max.sort();
        System.out.println("Sorted Heap: ");
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]+" ");
        }
        System.out.println();

        int [] nums ={4,10,2,8,6,7};
        int k = 3;
        int [] topK = FindTopK(nums, k);
        System.out.println("top k elements: " + k +" ");
        for(int i = 0; i < k; i++){
            System.out.print(topK[i] + " ");
        }
        System.out.println();
    }
}
