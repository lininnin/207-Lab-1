public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int num = 0;

        while (i <= 1000) {

            boolean b = divisibleBy3Or5(i);
            if (b){
                num ++;
            }
            i ++;
        }
        System.out.println(num);
    }
    public static boolean divisibleBy3Or5(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 || divisibleBy5) {

            return true;

        }
        return false;
    }
}
