import common.Logic;
import common.TaskUtils;
import org.junit.Test;
import org.junit.Assert;
import java.math.BigInteger;

public class Tests {

    @Test
    public void test1() {
        //Факториалы - 1, 2, 6, 24, 120, 120
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 24, 120, 120, -120};
        BigInteger expected = BigInteger.valueOf(273);
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(TaskUtils.intToBigIntegerArray(array)));
    }

    @Test
    public void test2() {
        //Факториалов нет
        int[] array = {0, 0, 0, 0, 0, 0, 0};
        BigInteger expected = BigInteger.valueOf(0);
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(TaskUtils.intToBigIntegerArray(array)));
    }

    @Test
    public void test3() {
        //Факториалы - шесть раз '1'
        int[] array = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1};
        BigInteger expected = BigInteger.valueOf(6);
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(TaskUtils.intToBigIntegerArray(array)));
    }

    @Test
    public void test4() {
        //Факториалы - 40320, 120, 6, 720
        BigInteger[] array = {TaskUtils.findFactorial(8), TaskUtils.findFactorial(5), TaskUtils.findFactorial(3), TaskUtils.findFactorial(6)};
        BigInteger expected = BigInteger.valueOf(41166);
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(array));
    }

    @Test
    public void test5() {
        //Факториалы - четыре раза '6', 1 и 120
        int[] array = {6, -6, 6, -6, 6, -6, 6, -6, 1, -1, 120};
        BigInteger expected = BigInteger.valueOf(145);
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(TaskUtils.intToBigIntegerArray(array)));
    }

    @Test
    public void test6() {
        //Факториалы - 362880 и 479001600
        BigInteger[] array = {TaskUtils.findFactorial(9), TaskUtils.findFactorial(12), BigInteger.valueOf(0), BigInteger.valueOf(-321312)};
        BigInteger expected = TaskUtils.findFactorial(9).add(TaskUtils.findFactorial(12));
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(array));
    }

    @Test
    public void test7() {
        //Факториалов нет
        int[] array = {-120, -720, -6, -24, -1, 0, 2312, 421412, 9999};
        BigInteger expected = BigInteger.valueOf(0);
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(TaskUtils.intToBigIntegerArray(array)));
    }

    @Test
    public void test8() {
        //Факториалы очень большие
        BigInteger[] array = {TaskUtils.findFactorial(1223), TaskUtils.findFactorial(1231), BigInteger.valueOf(3213), BigInteger.valueOf(0)};
        BigInteger expected = TaskUtils.findFactorial(1223).add(TaskUtils.findFactorial(1231));
        Assert.assertEquals(expected, Logic.getAmountOfFactorials(array));
    }

    @Test
    public void test9() {
        //Факториалы - все от 1! до 15! включительно
        BigInteger[] array = TaskUtils.setFactorialsArray(15);
        BigInteger expected = BigInteger.ZERO;

        for (int i = 1; i <= 15; i++) {
            expected = expected.add(TaskUtils.findFactorial(i));
        }

        Assert.assertEquals(expected, Logic.getAmountOfFactorials(array));
    }
}
