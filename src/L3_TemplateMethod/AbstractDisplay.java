package L3_TemplateMethod;

// Template Methodパターンでは抽象クラスの代わりにインタフェースを使うことはできない
// (抽象クラスでは一部のメソッドを具体的に実装できるが、インタフェースは抽象メソッドのみ)
public abstract class AbstractDisplay {  // 抽象クラスAbstractDisplay
	public abstract void open();         // サブクラスに実装を任せる抽象メソッド(1)open
	public abstract void print();        // サブクラスに実装を任せる抽象メソッド(2)print
	public abstract void close();        // サブクラスに実装を任せる抽象メソッド(3)close

    // finalは「もしサブクラスを作るならdisplayメソッドをオーバーライドせずに機能拡張せよ」
    // テンプレートメソッドはオーバーライドすべきでない
	public final void display() {        // この抽象クラスで実装しているメソッドdisplay
		open();                          // まずopenして…
		for (int i = 0; i < 5; i++) {    // 5回printを繰り返して…
			print();
		}
		close();                         // 最後にcloseする。これがdisplayメソッドで実装されている内容
	}
}
