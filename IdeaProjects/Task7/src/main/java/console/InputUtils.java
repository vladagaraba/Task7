package console;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {

    private static BigInteger[] fromListToArrayBI(List<BigInteger> list){
        BigInteger[] array = new BigInteger[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public static BigInteger[] toBigIntegerArray(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("(\\s|[,:;])+");
        System.out.println();
        List<BigInteger> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextBigInteger());
        }
        return fromListToArrayBI(list);
    }

    public static BigInteger[] readBigIntegerArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Enter Array: ");
                String line = scanner.nextLine();
                return toBigIntegerArray(line);
            } catch (Exception e) {
                System.err.printf("Error! Try again:%n");
            }
        }
    }


}
