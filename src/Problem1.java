import java.util.stream.IntStream;

/**
 * Problem1: 3と5の倍数.
 */
public class Problem1 {

    /**
     * 10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる.<br/>
     * 同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.
     * @param args
     */
    public static void main(String[] args) {
        final int endNum = 1000;

        // for文実装
        int sumNum = 0;
        for (int i = 0; i < endNum; i++) {
            if (isMultipleOfThreeOrFive(i)) {
                sumNum += i;
            }
        }
        System.out.println(sumNum);

        // StreamAPI実装
        final int lambdaSum = IntStream
                .range(1, endNum)
                .filter(num -> isMultipleOfThreeOrFive(num))
                .sum();

        System.out.println(lambdaSum);
    }

    /**
     * 数値が3または5の倍数か判定する.
     * @param checkNum 判定する数値
     * @return {@code boolean} 3か5の倍数の場合{@code true}を返す.
     */
    private static boolean isMultipleOfThreeOrFive(int checkNum) {
        return checkNum != 0
                && (checkNum % 3 == 0 || checkNum % 5 == 0);
    }
}
