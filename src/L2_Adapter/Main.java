package L2_Adapter;

// アダプター役のPrintBannerクラスを使ってHelloという文字列を弱く、また強く表示
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
