package janken;

public class Murata extends Player {
    /**
     * プレイヤークラスのコンストラクタ
     *
     * @param name 名前
     */
    public Murata(String name) {
    	// スーパークラスのコンストラクタを呼び出す
    	super(name);
    }

    /**
     * ジャンケンの手を出す
     * スーパークラスの同名メソッドをオーバーライドしている
     *
     * @return ジャンケンの手
     * */
    public int showHand() {
		// 必ずグーを出す
		return STONE;
    }
}
