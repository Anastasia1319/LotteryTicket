import java.util.Arrays;

public class LotteryTicketFirst {

    public static boolean winOrNo (int ticketNumber) {
        int[] number = new int[String.valueOf(ticketNumber).length()];
        if (number.length < 2 || number.length > 8 || number.length % 2 != 0) return false;
        int right;
        int left;
        for (int i = 0; i < number.length; i ++) {
            number[i] = ticketNumber % 10;
            ticketNumber /=10;
        }
        right = Arrays.stream(number)
                .limit(number.length/2)
                .sum();
        left = Arrays.stream(number)
                .skip(number.length/2)
                .sum();
        return left == right;
    }


}
