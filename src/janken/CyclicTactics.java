/**
 * グー・チョキ・パーの順番で出す戦略クラス
 */

package janken;

public class CyclicTactics implements Tactics {
	/** 最後に出した手（未開始: -1） */
	int lastHand = -1;

	/**
	 * 戦略を読みジャンケンの手を得る。
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す。
	 * Player.STONE … グー
	 * Player.SCISSORS … チョキ
	 * Player.PAPER … パー
	 *
	 * @return ジャンケンの手
	 */
	public int readTactics() {
//		自分の回答違った
//		int hand = 0;
//		for (int i = 0; i < 3; i++) {
//			if (i == 0) {
//				hand = Player.STONE;
//			} else if (i == 1) {
//				hand = Player.SCISSORS;
//			} else {
//				hand = Player.PAPER;
//			}
//		}
//		return hand;

		// 模範解答
		// 最後に出した手により次の手を決める
		// 最後に出した手は記憶しておく
		// +----------------+
		// | 最後   | 次の手  |
		// +----------------+
		// | グー   | チョキ  |
		// | チョキ |  パー   |
		// | パー   |  グー   |
		// +----------------+
		lastHand = (lastHand + 1) % 3;

		// 次の手を出す
		return lastHand;
	}
}
