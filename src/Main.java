public class Main {
    public static void main(String[] args) {
        System.out.println(LotteryTicketFirst.winOrNo(123321)); //true
        System.out.println(LotteryTicketFirst.winOrNo(11111111)); //true
        System.out.println(LotteryTicketFirst.winOrNo(12345678)); //false
        System.out.println(LotteryTicketFirst.winOrNo(987123)); //false
        System.out.println(LotteryTicketFirst.winOrNo(12351)); //false

        System.out.println();
        System.out.println(LotteryTicketSecond.winOrNo(123321)); //true
        System.out.println(LotteryTicketSecond.winOrNo(11111111)); //true
        System.out.println(LotteryTicketSecond.winOrNo(12345678)); //false
        System.out.println(LotteryTicketSecond.winOrNo(987123)); //false
        System.out.println(LotteryTicketSecond.winOrNo(12351)); //false
    }
}