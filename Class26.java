public class Class26 {
    public static void main(String[] args) {
        int arr[] = {2,0,3,4,5,2,5};
        System.out.println(trappingRainWater_approach_1(arr));
    }
    public static int trappingRainWater_approach_1(int arr[]) {
        int waterQuantity = 0 ; 
        int [] prefix_max = new int[arr.length];
        int [] suffix_max = new int [arr.length];
        prefix_max[0]=arr[0];
        suffix_max[arr.length-1] = arr[arr.length-1];
        for (int i = 1,j=arr.length-2; i < suffix_max.length && j>=0; i++ , j--) {
            prefix_max[i] = Math.max(prefix_max[i-1], arr[i]);
            suffix_max[j] = Math.max(suffix_max[j+1], arr[j]);
        }
        for (int i = 0; i < suffix_max.length; i++) {
            int min = Math.min(prefix_max[i], suffix_max[i]);
            if(min>arr[i]){
                waterQuantity+=min-arr[i];
            }
        }
        return waterQuantity;
    }
}
