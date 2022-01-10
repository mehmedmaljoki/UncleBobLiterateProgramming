package literaleProgramming.refactoring;

class PrimeGenerator {
    private int ordmax = 30;
    private int[] primes;
    private int candidate;
    private int primeIndex;
    private boolean isPossiblyPrime;
    private int ord;
    private int square;
    private int n;
    private int[] multiplies = new int[ordmax + 1];

    public int[] generatePrimes(int numberOfPrimes) {
        primes = new int[numberOfPrimes + 1];
        n = 0;

        candidate = 1;
        primeIndex = 1;
        primes[1] = 2;
        ord = 2;
        square = 9;

        while (primeIndex < numberOfPrimes) {
            findNextPrime();
            primeIndex++;
            primes[primeIndex] = candidate;
        }
        return primes;
    }

    private void findNextPrime() {
        do {
            candidate += 2;
            if (candidate == square) {
                ord++;
                square = primes[ord] * primes[ord];
                multiplies[ord - 1] = candidate;
            }
            n = 2;
            isPossiblyPrime = true;
            while (n < ord && isPossiblyPrime) {
                while (multiplies[n] < candidate)
                    multiplies[n] += primes[n] + primes[n];
                if (multiplies[n] == candidate)
                    isPossiblyPrime = false;
                n++;
            }
        } while (!isPossiblyPrime);
    }
}
