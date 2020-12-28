/**
 * 「グーが大好き！」戦略クラス
 */

package janken;

public class StoneOnlyTactics implements Tactics {
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
		// 必ずグーを出す
		return Player.STONE;
	}
}
