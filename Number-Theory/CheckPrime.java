public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(checkPrime(13));
    }

    private static boolean checkPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2)
            return true; // the only one even prime
        if (n % 2 == 0)
            return false; // check if is even
        for (int i = 3; i * i <= n; i += 2) // for each odd number
            if (n % i == 0)
                return false;
        return true;
    }
}
