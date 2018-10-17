import java.math.BigDecimal;
import java.util.stream.IntStream;

/**
 * Problem6: 2乗和の差.
 */
public class Problem6 {
    /**
     * 最初の10個の自然数について, その二乗の和と,<br/>
     * 最初の10個の自然数について, その和の二乗は,<br/>
     * 3025 - 385 = 2640 となる.<br/>
     * 同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.
     * @param args main引数.
     */
    public static void main(String[] args) {

        int limit = 100;
        double powSome = 0;
        double somePow = 0;

        for (int i = 1; i <= limit ; i++) {
            powSome += Math.pow(i, 2);
            somePow += i;
        }

        double result = Math.pow(somePow, 2);

        System.out.println(BigDecimal.valueOf(result - powSome).toPlainString());


        final double pow = IntStream
                .range(1, limit + 1)
                .asDoubleStream()
                .map(i -> Math.pow(i, 2))
                .sum();

        final double some = Math.pow(IntStream.range(1, limit + 1).sum(), 2);

        System.out.println(BigDecimal.valueOf(some - pow).toPlainString());


    }
}
