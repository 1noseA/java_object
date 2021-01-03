package framework;

public abstract class Product {
	public abstract void use();
	// 問題4-3
	// abstractなコンストラクタは作ることができない（意味がない）
	// コンストラクタで製品に名前をつけるのではなく、
	// 名前をつけるためのメソッドを別途宣言する
}
