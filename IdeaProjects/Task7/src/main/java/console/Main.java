package console;

import common.Logic;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger[] array = InputUtils.readBigIntegerArrayFromConsole();
        startProgram(array);

    }

    public static void printResult(String arrayAsString, BigInteger result){
        System.out.println("Сумма всех факториалов массива |\u001B[31m" + arrayAsString + "\u001B[0m| = \u001B[34m" + result + "\u001B[0m");
    }

    public static void startProgram(BigInteger[] array){
        BigInteger result = Logic.getAmountOfFactorials(array);
        printResult(arrayToString(array), result);
    }

    public static String arrayToString(BigInteger[] array){
        StringBuilder sb = new StringBuilder();

        if(array.length == 0) return "";

        for (int i = 0; i < array.length - 1; i++) {
            sb.append(array[i]);
            sb.append(", ");
        }
        sb.append(array[array.length - 1]);
        return sb.toString();
    }
}
