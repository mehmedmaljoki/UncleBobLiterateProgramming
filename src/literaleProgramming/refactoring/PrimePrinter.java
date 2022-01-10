package literaleProgramming.refactoring;

public class PrimePrinter {
    private static final int NUMBER_OF_PRIMES = 1000;
    private static final int LINES_PER_PAGE = 50;
    private static final int COLUMNS = 4;

    public static void main(String[] args) {
        PrimeGenerator primePrinterHelper = new PrimeGenerator();
        NumberPrinter numberPrinter = new NumberPrinter(LINES_PER_PAGE, COLUMNS);

        int primes[] = primePrinterHelper.generatePrimes(NUMBER_OF_PRIMES);
        numberPrinter.print(primes, NUMBER_OF_PRIMES);
    }
}