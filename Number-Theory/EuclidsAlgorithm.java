
public class EuclidsAlgorithm {
    
    public static void main(String[] args) {
        System.out.println("The GCD using Euclid's algorithm :"  + gcd(100,20));
    }
    
    public static int gcd(int a, int b) {
      return (b == 0 ? a : gcd(b, a % b));
    }
}