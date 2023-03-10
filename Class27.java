public class Class27 {
    public static void main(String[] args) {
        int nums[] = {1};
        first_last_index_of_element_in_sorted_numsay_approach_1(nums, 1);
    }
    public static int binarySearch(int nums[],int search) {
        int low =0;
        int high =nums.length-1;
        int mid = 0;
        while (low<=high) {
            mid=(low+high)/2;
            if (search==nums[mid]) {
                // System.out.println("Element found at ...");
                return mid;
            }
            else if(search > nums[mid]){
                low = mid +1;
            }
            else if(search<nums[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
    public static void first_last_index_of_element_in_sorted_numsay_approach_1(int []nums,int target) {
        int ind = binarySearch(nums, target);
        // System.out.println(ind);
        if(ind==-1){
            System.out.println("first index : "+ -1);
            System.out.println("last index : "+ -1);
            return;
        }
        int i = ind,j=ind;
        while (i < nums.length -1 && nums[i]==nums[i+1]) {
            i++;
        }
        while (j>0 && nums[j]==nums[j-1]){
            j--;
        }
        System.out.println("first index : "+(j));
        System.out.println("last index : "+(i));
    }
    
}
