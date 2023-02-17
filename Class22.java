public class Class22 {
    int arr[];
    int currentSize;
    // Parameterized Constructor
    public Class22(int n){
        this.arr = new int[n];
    }
    // insert element in array
    public void insert(int index,int item) {
        if(index > currentSize){
            System.out.println("Index can not be greater than current size");
            return;
        }
        if(index==arr.length){
            System.out.println("Array is full");
            return;
        }
        // if we insert item in any index which is already filled
        if(arr[index]>0){
            for (int i = currentSize; i >index ; i--) {
                arr[i]=arr[i-1];
            }
        }
        arr[index] = item;
        currentSize++;
        System.out.println("Element Added............");
    }
    // for delete
    public void delete(int index) {
        if( currentSize == 0){
            System.out.println("Array is empty");
            return;
        }
        if(index<currentSize){
            for (int i = index; i < currentSize-1; i++) {
                arr[i]=arr[i+1];
            }
        }
        arr[currentSize-1]=0;
        currentSize--;
        System.out.println("Element Added............");
    }
    // Search
    void Search(int element){
        for (int i = 0; i < currentSize; i++) {
            if(arr[i]==element){
                System.out.println(element+" is present at index"+i);
                return;
            }
        }
        System.out.println(element+" is not present");
    }
    // Update
    void Update(int index,int item){
        if(index<0 || index>currentSize){
            System.out.println("index is not present to update");
            return;
        }
        arr[index]=item;
    }
    void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Class22 obj = new Class22(5);
        obj.insert(0, 0);
        obj.insert(1, 1);
        obj.insert(2, 2);
        obj.insert(3, 3);
        obj.insert(1, 5);
        obj.print();
        obj.delete(1);
        // obj.insert(4, 4);
        // obj.insert(5, 5);
        obj.print();
        int arr2[] = {2,0,1,3,5,6,7};
        problem4.printBarChart(arr2, 7);
        obj.Search(5);
        obj.Update(4, 5);
        // obj.print();
        HomeworkOfClass22.spanArray(arr2, 7);
        HomeworkOfClass22.secondMax_approach1(arr2, 7);
    }
    
}

class problem1 {
    // TC : O(n^2)
    public static void findMax_Method1(int []arr,int currentsize) {
        boolean isMax;
        for (int i = 0; i < currentsize; i++) {
            isMax = true;
            for (int j = i; j < currentsize; j++) {
                if(arr[i]<arr[j]){
                    isMax=false;
                    break;
                }
            }
            if(isMax){
                System.out.println("Max element is "+ i );
                return;
            }
        }
    }
    // TC : O(n)
    public static void findMax_Method2(int []arr,int currentsize) {
        int max=arr[0];
        for (int i = 0; i < currentsize; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("Max element is "+max);
    }
    
}

class problem4{
    public static void printBarChart(int [] arr,int currentSize) {
        int max=arr[0];
        for (int i = 0; i < currentSize; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println(max);
        for (int i = max; i >=0; i--) {
            for (int j = 0; j < currentSize; j++) {
                if (arr[j]<i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
class HomeworkOfClass22{
    public static void spanArray(int []arr,int currentSize) {
        int max=arr[0],min=arr[0];
        for (int i = 0; i < currentSize; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Span of the given array is "+ (max-min));
    }
    public static void secondMax_approach1(int[]arr,int currentSize) {
        int max=arr[0],secondMax=0;
        for (int i = 0; i < currentSize; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        for (int i = 0; i < currentSize; i++) {
            if(arr[i]>=secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }
        System.out.println("Second Max of the given array is "+secondMax);
    }
}