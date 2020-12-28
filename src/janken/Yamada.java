package janken;

public class Yamada extends Player {
	/**
     * プレイヤークラスのコンストラクタ
     *
     * @param name 名前
     */
    public Yamada(String name) {
    	// スーパークラスのコンストラクタを呼び出す
    	super(name);
    }

    /**
     * ジャンケンの手を出す
     * スーパークラスの同名メソッドをオーバーライドしている
     *
     * @return ジャンケンの手
     * */
//    public int showHand() {
//		// 必ずグーを出す
//		return PAPER;
//    }
}
