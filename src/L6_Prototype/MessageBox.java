package L6_Prototype;

import L6_Prototype_framework.Product;

/**
 * サブクラスMessageBoxはProductインタフェースを実装
 */
public class MessageBox implements Product {
	// dococharフィールドは文字列を飾り枠のように囲む文字
	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	// useメソッドは与えられた文字列をdococharで囲む
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}
}
