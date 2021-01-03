package L3_TemplateMethod;

public class StringDisplay extends AbstractDisplay {  // StringDisplayもAbstractDisplayのサブクラス
	private String string;                            // 表示するべき文字列
	private int width;                                // バイト単位で計算した文字列の「幅」

	public StringDisplay(String string) {             // コンストラクタで渡された文字列stringを
		this.string = string;                         // フィールドに記憶
		this.width = string.getBytes().length;        // バイト単位の幅もフィールドに記憶しておいて後で使う
	}

	public void open() {                              // オーバーライドして定義するopenメソッド
		printLine();                                  // このクラスのメソッドprintLineで線を引いている
	}

	public void print() {                             // フィールドで記憶しておいた文字列の
		System.out.println("|" + string + "|");       // 前後に"|"をつけて表示
	}

	public void close() {                             // openと同じく
		printLine();                                  // printLineメソッドで線を引いている
	}

	private void printLine() {                       // privateなのでこのクラスの中だけで使われる
		System.out.print("+");                       // 枠の角を表現する"+"マークを表示
		for (int i = 0; i < width; i++) {            // width個の"-"を表示して枠線として用いる
			System.out.print("-");
		}
		System.out.println("+");                     // 枠の角を表現する"+"マークを表示
	}
}
