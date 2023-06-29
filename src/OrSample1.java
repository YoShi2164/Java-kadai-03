
public class OrSample1 {

	public static void main(String[] args) {
		int score_Sansu = 80;
		int score_Kokugo =80;

		if (score_Sansu >=60 && score_Kokugo >=60) {
			System.out.println("合格しています！");
		} else if (score_Sansu >=60 || score_Kokugo >=60) {
			System.out.println("算数か国語どちらかが補講対象です！！");
		} else {
			System.out.println("赤点です…補講を行います！");
		}



	}

}
