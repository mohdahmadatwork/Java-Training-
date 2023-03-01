public class Class25 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        Class25.buySellStock_Approach_1(arr);
        Class25.buySellStock_Approach_2(arr);
        Class25.buySellStock_Approach_3(arr);
    }
    public static void buySellStock_Approach_1(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(max< -1*(arr[i]-arr[j])){
                    max = -1*(arr[i]-arr[j]);
                }
            }
        }
        System.out.println(max);
    }
    public static void buySellStock_Approach_2(int [] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = arr[i] < result[i-1] ? arr[i] : result[i-1];
        }
        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if(max < arr[i] - result[i]){
                max = arr[i] - result[i];
            }
        }
        System.out.println(max);
    }
    public static void buySellStock_Approach_3(int arr[]) {
        int min = arr[0];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(min>Math.min(arr[i],min)){
                min = Math.min(arr[i],min);
            }
            if(max < arr[i] - min){
                max = arr[i] - min;
            }
        }
        System.out.println(max);
    }
}
