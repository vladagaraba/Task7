package common;

import java.math.BigInteger;
import java.util.HashMap;

public class Logic {


    public static boolean isFactorial(HashMap<Integer, BigInteger> factorials, BigInteger num){
        for (int i = factorials.size() - 1; i > 0; i--) {
            if(num.compareTo(factorials.get(i)) == 0) return true;
        }

        return false;
    }

    public static void addFactorial(HashMap<Integer, BigInteger> factorials){
        if(factorials.isEmpty()) {
            factorials.put(1, BigInteger.ONE);
            return;
        }

        factorials.put(factorials.size() + 1, factorials.get(factorials.size()).multiply(BigInteger.valueOf(factorials.size() + 1)));
    }

    public static BigInteger getAmountOfFactorials(BigInteger[] arr){
        BigInteger amount = BigInteger.ZERO;
        HashMap<Integer, BigInteger> factorials = new HashMap<>();
        addFactorial(factorials);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(factorials.get(factorials.size())) == 1){
                addFactorial(factorials);
                i--;
                continue;
            }

           else if(arr[i].compareTo(factorials.get(factorials.size())) == 0) amount = amount.add(arr[i]);

           else if(isFactorial(factorials, arr[i])) amount = amount.add(arr[i]);
        }

        return amount;
    }
}