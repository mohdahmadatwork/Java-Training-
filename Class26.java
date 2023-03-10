import java.util.ArrayList;

public class Class26 {
    public static void main(String[] args) {
        int arr[] = {2,0,3,4,5,2,5};
        System.out.println(trappingRainWater_approach_1(arr));
        int cost [] = {3,4,5,1,2};
        int [] gas = {1,2,3,4,5};
        HomeworkOfClass26.gasStation_approach_1(cost, gas);
        HomeworkOfClass26.gasStation_approach_2(cost, gas);
        HomeworkOfClass26.gasStation_approach_3(cost, gas);
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

class HomeworkOfClass26{
    public static void gasStation_approach_1(int []cost,int []gas) {
        int car_gas;
        for (int i = 0; i < gas.length; i++) {
            int ind = i;
            car_gas = 0;
            for (int j = ind; j < gas.length + ind; j++) {
                // System.out.println(i%gas.length);
                car_gas += gas[j%gas.length];
                car_gas -= cost[j%gas.length];
                if (car_gas<0) {
                    break;
                }
            }
            // System.out.println(car_gas);
            if (car_gas>=0) {
                System.out.println(i);
            }
        }

    }
    public static void gasStation_approach_2(int []cost,int[]gas) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < gas.length; i++) {
            if (gas[i]>cost[i] || gas.length >0 && gas.length <3) {
                arr.add(i);
            }
        }
        int car_gas ;
        for (int i :arr) {
            int ind = i;
            car_gas = 0;
            for (int j = ind; j < gas.length + ind; j++) {
                // System.out.println(i%gas.length);
                car_gas += gas[j%gas.length];
                car_gas -= cost[j%gas.length];
                if (car_gas<0) {
                    break;
                }
            }
            // System.out.println(car_gas);
            if (car_gas>=0) {
                System.out.println(i);
            }
        }
    }
    public static void gasStation_approach_3(int []cost,int []gas) {
        int  rem = 0 ;
        int startingPoint = 0;
        int loss =0;
        for (int i = 0; i < cost.length; i++) {
            rem +=gas[i]-cost[i];
            if (rem<0) {
                startingPoint = i+1;
                loss += rem;
                rem = 0;
            }
        }
        int res = loss + rem >= 0 ? startingPoint : -1;
        System.out.println(res);
    }
}
