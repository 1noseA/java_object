package framework;

public abstract class Factory {
	// createメソッドでProductのインスタンスを生成するものと規定
	// createProductで製品を作ってregisterProductで登録する
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
