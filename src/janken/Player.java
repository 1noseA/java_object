/**
 *ジャンケンのプレイヤーを表すクラス
 */

package janken;

public class Player {
	// ジャンケンの手を表す定数
	public static final int STONE =  0; // グー
	public static final int SCISSORS = 1; // チョキ
    public static final int PAPER = 2; // パー

    // ------------------------
    // プレイヤークラスの属性
    // ------------------------
    /** プレイヤーの名前 */
    private String name_;

    /** プレイヤーの勝った回数 */
    private int winCount_ = 0;

    // ------------------------
    // プレイヤークラスの操作
    // ------------------------
    /**
     * プレイヤークラスのコンストラクタ
     *
     * @param name 名前
     */
    public Player(String name) {
    	this.name_ = name;
    }

    /** 与えられた戦略 */
    private Tactics tactics_;

    /**
     * プレイヤーに戦略を渡す
     *
     * @param tactics 戦略
     */
    void setTactics(Tactics tactics) {
    	tactics_ = tactics;
    }

    /**
     * ジャンケンの手を出す
     *
     * @return ジャンケンの手
     * */
    public int showHand() {
//    	// プレイヤーの手
//    	int hand = 0;
//
//    	// 0.0以上3.0未満の少数として乱数を得る
//    	double randomNum = Math.random() * 3;
//
//		if (randomNum < 1) {
//			// randomNumが0.0以上1.0未満の場合グー
//			hand = STONE;
//		} else if (randomNum < 2) {
//			// randomNumが1.0以上2.0未満の場合チョキ
//			hand = SCISSORS;
//		} else if (randomNum < 3) {
//			// randomNumが2.0以上3.0未満の場合パー
//			hand = PAPER;
//		}

    	// 与えられた戦略を読んでジャンケンの手を決める
    	int hand = tactics_.readTactics();

		// 決定した手を戻り値として返す
		return hand;
    }

    /**
     * 審判から勝敗を聞く
     *
     * @param result true:勝ち, false:負け
     */
    public void notifyResult(boolean result) {
    	if (true == result) {
    		// 勝った場合は勝ち数を加算する
    		winCount_ += 1;
    	}
    }

    /**
     * 自分の勝った回数を答える
     *
     * @return 勝った回数
     */
    public int getWinCount() {
    	return winCount_;
    }

    /** 自分の名前を答える
     *
     * @return 名前
     */
    public String getName() {
    	return name_;
    }
}