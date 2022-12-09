public class Class20 {
    public static void main(String[] args) {
        System.out.println(game(10, 2));
    }
    // JosephursProblem
    public static int game(int n,int k) {
        if (n==1) {
            return 1;
        }
        return (game(n-1,k)+k-1)%n+1;
    }
}
