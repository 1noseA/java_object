/**
 * アダプターの役割
 * クラスによるAdapterパターン（継承(is a関係)を使ったもの）
 */

package L2_Adapter;

// Bannerクラスを拡張してshowWithParenメソッドとshowWithAsterメソッドを継承
// Printインタフェースを実装してprintWeakメソッドとprintStrongメソッドを実装
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}
	public void printWeak() {
		showWithParen();
	}
	public void printStrong() {
		showWithAster();
	}
}

// インスタンスによるAdapterパターン（委譲(has a関係)を使ったもの）
//public class PrintBanner extends Print {
//	private Banner banner;
//	public PrintBanner(String string) {
//		this.banner = new Banner(string);
//	}
//	public void printWeak() {
//		banner.showWithParen();
//	}
//	public void printStrong() {
//		banner.showWithAster();
//	}
//}
