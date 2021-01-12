package common;

import java.math.BigInteger;
import java.util.Random;

public class TaskUtils {
    public static BigInteger findFactorial(int factorial){
        BigInteger bi = BigInteger.ONE;

        for (int i = 2; i <= factorial; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi;
    }

    public static BigInteger[] intToBigIntegerArray(int[] array){
        BigInteger[] arrayBI = new BigInteger[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayBI[i] = BigInteger.valueOf(array[i]);
        }
        return arrayBI;
    }

    public static BigInteger[] setRandomBigIntegerArray(int size){
        Random rnd = new Random();

        BigInteger[] array = new BigInteger[size];

        for (int i = 0; i < size; i++) {
            array[i] = BigInteger.valueOf(rnd.nextLong());
        }

        return array;
    }

    public static BigInteger[] setFactorialsArray(int size){
        BigInteger[] array = new BigInteger[size];

        for (int i = 0; i < size; i++) {
            array[i] = findFactorial(i + 1);
        }

        return array;
    }
}
