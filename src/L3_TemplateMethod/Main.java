package L3_TemplateMethod;

public class Main {
	public static void main(String[] args) {
		// 'H'を持ったCharDisplayのインスタンスを1個作る
		AbstractDisplay d1 = new CharDisplay('H');

		// "Hello, world."を持ったStringDisplayのインスタンスを1個作る
		AbstractDisplay d2 = new StringDisplay("Hello, world");

		// "こんにちは。"を持ったStringDisplayのインスタンスを1個作る
		AbstractDisplay d3 = new StringDisplay("こんにちは。");

		d1.display();  // d1, d2, d3とも全て同じAbstractDisplayのサブクラスのインスタンスだから
		d2.display();  // 継承したdisplayメソッドを呼び出すことができる
		d3.display();  // 実際の動作は個々のクラスCharDisplayやStringDisplayで決まる
	}
}
