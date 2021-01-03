package L5_Singleton;

// 問題5-2
// インスタンスの個数が3個に限定されているクラス
public class Triple {
	// TripleクラスのtripleフィールドをTripleのインスタンスで初期化している
	// tripleフィールドにstaticがついていなければ無限ループになり実行時エラーになる
	private static Triple[] triple = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};
	private int id;

	private Triple(int id) {
		System.out.println("The instance " + id + " is created.");
		this.id = id;
	}

	public static Triple getInstance(int id) {
		return triple[id];
	}

	public String toString() {
		return "[Triple id = " + id + "]";
	}
}
