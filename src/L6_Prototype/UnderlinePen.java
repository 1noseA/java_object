package L6_Prototype;

import L6_Prototype_framework.Product;
/**
 * MessageBoxとほぼ同じ動作
 */
public class UnderlinePen implements Product {
	// ulcharフィールド下線
	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	// useメソッド…与えられた文字列を二重引用符でくくりながら文字列の部分に下線を引く
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
