package L3_TemplateMethod;

public class CharDisplay extends AbstractDisplay {  // CharDisplayはAbstractDisplayのサブクラス
	private char ch;               // 表示すべき文字
	public CharDisplay(char ch) {  // コンストラクタで渡された文字chをフィールドに記憶しておく
		this.ch = ch;
	}
	public void open() {           // スーパークラスでは抽象メソッドだった。ここでオーバーライドとして実装
		System.out.print("<<");    // 開始文字列として"<<"を表示する
	}
	public void print() {          // printメソッドここで実装する。これがdisplayから繰り返して呼び出される
		System.out.print(ch);      // フィールドに記憶しておいた文字を1個表示する
	}
	public void close() {          // closeメソッドもここで実装
		System.out.println(">>");  // 終了文字列">>"を表示
	}

}
