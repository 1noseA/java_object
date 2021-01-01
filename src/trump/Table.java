package trump;

/**
 *テーブルを表すインタフェース
 */
public interface Table {
	/**
	 * カードを置く
	 * テーブルに置かれたカードをどのように扱うかはサブクラスで実装する
	 *
	 * @return card カード
	 */
	public void putCard(Card[] card);

	/**
	 * カードを見る
	 *
	 * @return テーブルに置かれたカードを表す配列
	 */
	public Card[][] getCards();
}
