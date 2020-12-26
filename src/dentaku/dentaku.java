package dentaku;

public class dentaku {
	public static void main(String args[]) {
		int val1 = 0; // 最初の数字
		int val2 = 0; // 次の数字
		String ope; // 演算子

		if (args.length != 3) {
			System.out.println("数値 演算子 数値を入力してください");
			System.out.println("演算子は kake waru tasu hiku の4つです");
			System.exit(0);
		}

		val1 = Integer.parseInt(args[0]);
		val2 = Integer.parseInt(args[1]);
		ope = args[1];

		String opeStr[] = {"kake", "waru", "tasu", "hiku"};
		boolean errFlag = true;

//		if (ope.equals("kake")) {
//			errFlag = false;
//		}
//
//		if (ope.equals("waru")) {
//			errFlag = false;
//		}
//
//		if (ope.equals("tasu")) {
//			errFlag = false;
//		}
//
//		if (ope.equals("hiku") ) {
//			errFlag = false;
//		}

		for (int i = 0; i < 4; i++) {
			if (ope.equals(opeStr[i])) {
				errFlag = false;
			}
		}

		if (errFlag == true) {
			System.out.println("演算子は kake waru tasu hiku の4つです");
			System.exit(0);
		}

		System.out.println("入力された色は " + val1 + " " + ope + " " + val2 + " です");
	}
}
