package L1_Iterator;

/**
 * 本を表すクラス
 * 本の名前をgetNameメソッドで得ることだけ
 */
public class Book {
	private String name;
	// 本の名前はコンストラクタでインスタンスを初期化するときに引数で指定
	public Book(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
