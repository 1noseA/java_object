package trump;

/**
 * トランプルールインタフェース
 * 現在の手札とテーブルから出しうるカードの組み合わせを見つける
 */
public interface Rule {
	/**
	 * テーブルに置けるカードを探す
	 * 手札とテーブルからテーブルに出しうるカードの組み合わせを探す
	 *
	 * @param hand 手札
	 * @param table テーブル
	 * @return 見つかったカードの組み合わせ。見つからなかった場合はnullを返す
	 */
	public Card[] findCardidate(Hand hand, Table table);
}
