package L5_Singleton;

// 問題5-3
public class Singleton5_3 {
	private static Singleton5_3 singleton = null;
	private Singleton5_3() {
		System.out.println("インスタンスを生成しました。");
		slowdown();
	}

	// synchronizedを使えば厳密なSingletonパターンにできる
	public static synchronized Singleton5_3 getInstance() {
		if (singleton == null) {
			singleton = new Singleton5_3();
		}
		return singleton;
	}

	private void slowdown() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
		}
	}
}
