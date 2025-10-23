public class powerFunction
{
    public static void main(String [] args) {
        int n = 20000;
        long a = 2;

        long start = System.nanoTime();
        powerRecursive(a, n);
        long end = System.nanoTime();
        System.out.println("Recursive time: " + (end - start) + " ns");
        
        start = System.nanoTime();
        powerIterative(a, n);
        end = System.nanoTime();
        System.out.println("Iterative time: " + (end - start) + " ns");
    }

    public static long powerRecursive(long num, int power) {

        if (power == 0) {
            return 1;
        }
        return num * powerRecursive(num, power-1);
    }
    public static long powerIterative(long num, int power) {

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}