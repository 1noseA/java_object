package L5_Singleton;

// Singletonパターン：プログラマがどう間違ってもインスタンスが1個しか生成されないことを保証する
public class Singleton {
	// インスタンスは一つしか作られない
	private static Singleton singleton = new Singleton();

	// コンストラクタはprivate
	private Singleton() {
		System.out.println("インスタンスを生成しました。");
	}

	// 名前は何でも良いが、唯一インスタンスを得るメソッドは必要
	public static Singleton getInstance() {
		return singleton;
	}
}
