
public class Review01 {

	public static void main(String[] args) {

		  int price = 1500;
	        int tax_Amount = tax(price);
	        int total_Price = price + tax_Amount;

	        System.out.println(price + "円の商品の税込価格は" + total_Price + "円、消費税は" + tax_Amount + "円です。");
	    }

	    public static int tax(int price) {
	        double tax_Rate = 0.1; // 消費税率 10% (0.1)
	        double tax_Amount = price * tax_Rate;
	        return (int) tax_Amount;


	}

}
