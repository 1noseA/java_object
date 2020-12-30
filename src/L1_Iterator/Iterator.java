package L1_Iterator;

// Iteratorインタフェースは要素の数え上げを行うもの、ループ変数のような役割を果たすもの
public interface Iterator {
	// 「次の要素」が存在するかどうかを調べるhasNextメソッド
	public abstract boolean hasNext();
	// 「次の要素」を得るためのnextメソッド
	public abstract Object next();

}
