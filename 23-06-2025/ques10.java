public class CountPrimes {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 10, 13, 17};
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) count++;
        }
        System.out.println("Number of primes: " + count);
    }
}
