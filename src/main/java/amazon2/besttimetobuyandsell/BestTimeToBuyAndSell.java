package amazon2.besttimetobuyandsell;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        // 3
        int[] prices = new int[] {1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }

    // noStock - price -> inHand, inHand -> inHand
    // inHand + price -> sell
    // noStock -> noStock, sell -> noStock
    public static int maxProfit(int[] prices) {
        int sell = 0;
        int noStock = 0;
        int inHand = Integer.MIN_VALUE;
        for (int price: prices) {
            int cashe = inHand;
            inHand = Math.max(noStock - price, inHand);
            noStock = Math.max(noStock, sell);
            sell = cashe + price;
        }
        return sell;
    }

    // prev design
//    public static int maxProfit(int[] prices) {
//        int sell = 0;
//        int hold = Integer.MIN_VALUE;
//        int prev = 0;
//
//        for (final int price : prices) {
//            int cache = sell;
//            sell = Math.max(sell, hold + price);
//            hold = Math.max(hold, prev - price);
//            prev = cache;
//            System.out.println("sell = " + sell + "; hold = " + hold + "; prev = " + prev);
//        }
//
//        return sell;
//    }
}
