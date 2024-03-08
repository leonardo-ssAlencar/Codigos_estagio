public class fibonacci {

    public static boolean fibo(int valFim) {

        int fibo = 0;
        int ante = 0;
        int temp = 0;

        while (fibo < valFim) {
            if (fibo == 0) {
                fibo = 1;
            }
            temp = fibo;
            fibo = fibo + ante;
            ante = temp;
        }

        return fibo == valFim;
    }
}