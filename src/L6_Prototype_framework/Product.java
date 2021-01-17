package L6_Prototype_framework;

/**
 * 複製を可能にするためのもの
 * java.lang,Cloneableインタフェースを継承
 * このインタフェースを実装しているインスタンスは
 * cloneメソッドを使って自動的に複製を行うことができる
 */
public interface Product extends Cloneable {
	// 「使う」ためのもの。サブクラスの実装に任されている
	public abstract void use(String s);
	// インスタンスの複製を行うためのもの
	public abstract Product createClone();
}
