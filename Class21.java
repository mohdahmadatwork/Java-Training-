public class Class21 {
    static void approach_1(int n){
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    static void approach_2(int n){
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
    static void approach_3(int n){
        int sum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static void analysisOfLoop(int n) {
        // TC: O(n)
        for (int i = 0; i < n; i++) {
            // Logic
        }
        // TC: O(n)
        for (int i = 0; i < n; i+=2) {
            // Logic
        }
        // TC: O(log n)
        for (int i = n; i >=1; i/=2) {
            // Logic
        }
        // TC: O(log n)
        for (int i = n; i >=1; i*=2) {
            // Logic
        }


        // TC : O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Logic
            }
        }
    }
    public static void main(String[] args) {
        approach_1(5);
    }
}
