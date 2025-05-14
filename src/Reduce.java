public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int step = 0;
        while (i > 0) {
            i = r(i);
            step ++;
        }
        System.out.println(step);
    }

    public static int r(int i) {
        if (i % 2 == 0){
            i /= 2;
        }else{
            i -= 1;
        }
        return i;
    }
}
