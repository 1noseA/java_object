/**
 * オブジェクト指向を使用しないジャンケン
 */
public class SimpleJanken {
	// ジャンケンの手を表す定数
	public static final int STONE = 0; // グー
	public static final int SCISSORS = 1; // チョキ
	public static final int PAPER = 2;

	// プログラムスタート
	public static void main(String[] args) {
		// プレイヤー1の勝ち数
		int player1WinCount = 0;
		// プレイヤー2の勝ち数
		int player2WinCount = 0;
		// プレイヤー1が出す手
		int player1Hand = 0;
		// プレイヤー2が出す手
		int player2Hand = 0;

		// ジャンケンの手を決めるのに使用する乱数
		double randomNum = 0;

		// ①プログラムが開始したことを表示する
		// プログラム開始メッセージを表示する
	    System.out.println("【ジャンケン開始】\n");

		// ジャンケンを3回実施する
		// ⑥勝負した回数を加算する
		// ⑦3回勝負が終わったか
		for (int cnt = 0; cnt < 3; cnt++) {
			// 何回戦目かを表示する
			System.out.println("【" + (cnt + 1) + "回戦目】");

			// ②プレイヤー１が何を出すか決める
			// 0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;

			if (randomNum < 1) {
				// randomNumが0.0以上1.0未満の場合グー
				player1Hand = STONE;
				// プレイヤー1の手を表示する
				System.out.println("グー");
			} else if (randomNum < 2) {
				// randomNumが1.0以上2.0未満の場合チョキ
				player1Hand = SCISSORS;
				// プレイヤー1の手を表示する
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				// randomNumが2.0以上3.0未満の場合パー
				player1Hand = PAPER;
				// プレイヤー1の手を表示する
				System.out.println("パー");
			}

			// ③プレイヤー2が何を出すか決める
			// 0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				// randomNumが0.0以上1.0未満の場合グー
				player2Hand = STONE;
				// プレイヤー2の手を表示する
				System.out.println("グー");
			} else if (randomNum < 2) {
				// randomNumが1.0以上2.0未満の場合チョキ
				player2Hand = SCISSORS;
				// プレイヤー2の手を表示する
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				// randomNumが2.0以上3.0未満の場合パー
				player2Hand = PAPER;
				// プレイヤー2の手を表示する
				System.out.println("パー");
			}

			// ④どちらが勝ちか判断し結果を表示する
			// プレイヤー1が勝つ場合
			if((player1Hand == STONE && player2Hand == SCISSORS)
			|| (player1Hand == SCISSORS && player2Hand == PAPER)
			|| (player1Hand == PAPER && player2Hand == STONE)) {
				// ⑤プレイヤー1の勝った回数を加算する
				player1WinCount++;

				// ジャンケンの結果を表示する
				System.out.println("\nプレイヤー1が勝ちました！\n");
			}

			// プレイヤー2が勝つ場合
			else if((player1Hand == STONE && player2Hand == PAPER)
				|| (player1Hand == SCISSORS && player2Hand == STONE)
				|| (player1Hand == PAPER && player2Hand == SCISSORS)) {
				// ⑤プレイヤー2の勝った回数を加算する
				player2WinCount++;

				// ジャンケンの結果を表示する
				System.out.println("\nプレイヤー2が勝ちました!\n");
			} else {
				// 引き分けの場合
				// ジャンケンの結果を表示する
				System.out.println("\n引き分けです！\n");
			}
		}

		// ⑧最終的な勝者を判定し画面に表示する
		System.out.println("【ジャンケン終了】\n");

		// プレイヤー1の勝ち数が多いとき
		if (player1WinCount > player2WinCount) {
			// プレイヤー1の勝ちを表示する
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです\n");
		}
		// プレイヤー2の勝ち数が多いとき
		else if (player1WinCount < player2WinCount) {
			// プレイヤー2の勝ちを表示する
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです\n");
		}
		// プレイヤー1と2の勝ち数が同じとき
		else if (player1WinCount == player2WinCount) {
			// 引き分けを表示する
			System.out.println(player1WinCount + "対" + player2WinCount + "引き分けです！\n");
		}
	}
}
