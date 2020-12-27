package dentaku;

public class dentaku {
	public static void main(String args[]) {
		int val1 = 0; // 最初の数字
		int val2 = 0; // 次の数字
		String ope; // 演算子
		int result; // 結果を格納

		if (args.length != 3) {
			errDisp("引数は3個入力してください");
		}

		try {
			val1 = Integer.parseInt(args[0]);
			val2 = Integer.parseInt(args[1]);
		} catch(NumberFormatException e) {
			errDisp("数値ではない値が入力されています");
			System.exit(0);
		}

		ope = args[1];

		String opeStr[] = {"kake", "waru", "tasu", "hiku"};
		boolean errFlag = true;

		for (int i = 0; i < 4; i++) {
			if (ope.equals(opeStr[i])) {
				errFlag = false;
			}
		}

		if (errFlag == true) {
			System.out.println("演算子は kake waru tasu hiku の4つです");
			System.exit(0);
		}

		if (ope.equals("kake")) {
			result = val1 * val2;
		} else if (ope.equals("tasu")) {
			result = val1 * val2;
		} else if (ope.equals("hiku")) {
			result = val1 - val2;
		} else {
			if (val2 == 0) {
				errDisp("0で割ろうとしました");
			}
			result = val1 / val2;
		}

		System.out.println("入力された色は " + val1 + " " + ope + " " + val2 + " です");
		System.out.println("計算結果は " + result + " です");
	}

	private static void errDisp(String errStr) {
		System.out.println("数値 演算子 数値を入力してください");
		System.out.println(errStr);
		System.exit(0);
	}
}
