import java.util.Arrays;
import java.util.stream.IntStream;

public class LotteryTicketSecond {
    public static boolean winOrNo (int ticketNumber) {
        int[] numbers = IntStream
                .iterate(ticketNumber, i -> i / 10 > 0 || i % 10 > 0, i -> i / 10)
                .map(i -> i % 10)
                .toArray();
        if (numbers.length < 2 || numbers.length > 8 || numbers.length % 2 != 0) return false;
        int right = Arrays.stream(numbers)
                .limit(numbers.length/2)
                .sum();
        int left = Arrays.stream(numbers)
                .skip(numbers.length/2)
                .sum();
        return left == right;
    }
}
