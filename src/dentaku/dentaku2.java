package dentaku;

import java.util.Scanner;

public class dentaku2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 標準入力を1行ずつ読み出す
		out : while(sc.hasNextLine()) {
			String line = sc.nextLine();

			String[] arr = line.split(" ");

			double total = 0;

			// 数字が4つのときエラーメッセージが出てしまう
			if (arr.length < 3 || ((arr.length != 3) && (arr.length % 3 != 2))) {
				System.out.println("数値 演算子 数値 演算子 数値 …の順に最低3つの引数を指定してください");
				continue;
			} else {
				// 先頭の数値
				if (checkNum(arr[0])) {
					// 数値変換
					total = Double.parseDouble(arr[0]);
				}

				for (int i = 0; i <= ((arr.length - 3) / 2); i++) {
					// 先頭の数値以降は一つとびに演算子と数値が続く
					if (checkOperator(arr[i * 2 + 1]) && checkNum(arr[i * 2 + 2])) {
						// 演算子によってtotalに合算する処理を変更
						switch(arr[i * 2 + 1]) {
						case "+":
							total = total + Double.parseDouble(arr[i * 2 + 2]);
							break;
						case "-":
							total = total - Double.parseDouble(arr[i * 2 + 2]);
							break;
						case "*":
							total = total * Double.parseDouble(arr[i * 2 + 2]);
							break;
						case "/":
							total = total / Double.parseDouble(arr[i * 2 + 2]);
							break;
						}
					} else {
						System.out.println("数値 演算子 数値 演算子 数値 …の順に引数を指定してください");
						continue out;
					}
				}
				System.out.println("合計：" + total);
			}
		}
		sc.close();
	}

	// 数値のチェック 数値の場合 true, 数値以外の場合 false
	private static boolean checkNum(String str) {
		try {
			// double型で変換し、エラーがなければ数値とみなす
			Double.parseDouble(str);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

	// 演算子チェック
	private static boolean checkOperator(String str) {
		if (str.equals("+") || str.equals("-") || str.contentEquals("*") || str.equals("/")) {
			return true;
		} else {
			return false;
		}
	}
}
