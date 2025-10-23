public class sumNatNumbers
{
    public static void main(String [] args) {

        System.out.println(sumNaturalNumbers(5));
    }

    public static int sumNaturalNumbers(int num) {

        if (num == 0) {
            return 0;
        }
        return num + sumNaturalNumbers(num-1);
    }
}