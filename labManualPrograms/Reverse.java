public class Reverse {
    public static int reverse(int n) {
        int copy = n;
        int sum = 0;
        while (copy != 0) {
            int rem = copy % 10;
            sum = sum * 10 + rem;
            copy /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
