package L1_Iterator;

public interface Aggregate {
	// 集合体に対応するIteratorを1個作成するためのiteratorメソッドを一つ宣言
	// 集合体を数え上げたい、スキャンしたい、一つずつ調べていきたいという時には
	// iteratorメソッドを使ってIteratorインタフェースを実装したクラスのインスタンスを1個作る
	public abstract Iterator iterator();
}
