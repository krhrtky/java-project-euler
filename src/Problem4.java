import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem4: 最大の回文積.
 */
public class Problem4 {
    /**
     * 左右どちらから読んでも同じ値になる数を回文数という.
     * 2桁の数の積で表される回文数のうち, 最大のものは 9009 = 91 × 99 である.
     * では, 3桁の数の積で表される回文数の最大値を求めよ.
     * @param args main引数.
     */
    public static void main(String[] args) {

        final int LIMIT_VALUE = 999;
        final List<Integer> palindromeList = new ArrayList<>();

        for (int i = 10; i <= LIMIT_VALUE; i++) {
            for (int j = 10; j <= LIMIT_VALUE; j++) {
                final int multipleNum = i * j;

                if (isPalindrome(multipleNum)) {
                    palindromeList.add(multipleNum);
                }
            }
        }
        System.out.println(Collections.max(palindromeList));
    }

    /**
     * 回文積か判定する.
     * @param targetNum 判定する値.
     * @return 回文積であれば、trueを返す.
     */
    private static boolean isPalindrome(final int targetNum) {

        final String targetStr = Integer.toString(targetNum);
        // 文字列の後半を切り出して、反転する.
        final String targetReverse  = new StringBuffer(Integer.toString(targetNum))
                .reverse()
                .toString();

        return targetStr.equals(targetReverse);
    }
}
