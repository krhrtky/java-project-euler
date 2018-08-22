import java.util.HashSet;
import java.util.Set;

/**
 * Problem3: 最大の素因数
 */
public class Problem3 {
    /**
     * 13195 の素因数は 5, 7, 13, 29 である.<br/>
     * 600851475143 の素因数のうち最大のものを求めよ.
     * @param args
     */
    public static void main(String[] args) {

        Long targetNum = 600851475143L;
        Long counter = 2L;
        Set<Long> primeFactorsSet = new HashSet<>();

        while (targetNum >= counter) {
            while (targetNum % counter == 0) {
                targetNum = targetNum / counter;
                primeFactorsSet.add(counter);
            }
            counter++;
        }


        Long maxNum = 0L;
        for (Long i: primeFactorsSet) {
            if (maxNum < i ) {
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
}
