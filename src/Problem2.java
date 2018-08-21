import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Problem2 {
    /**
     * フィボナッチ数列の項は前の2つの項の和である. 最初の2項を 1, 2 とすれば, 最初の10項は以下の通りである.<br/>
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...<br/>
     * 数列の項の値が400万以下の, 偶数値の項の総和を求めよ.
     * @param args
     */
    public static void main(String[] args) {
        final Integer maxNum = 4000000;
        Integer startNum = 1;
        Integer secondNum = 1;
        Integer lastNum = 0;
        Integer fibonacciSum = 0;

        while(lastNum <= maxNum) {
            lastNum = startNum + secondNum;

            if (lastNum % 2 == 0) {
                fibonacciSum += lastNum;
            }
            startNum = secondNum;
            secondNum = lastNum;
        }
        System.out.println(fibonacciSum);
    }
}
