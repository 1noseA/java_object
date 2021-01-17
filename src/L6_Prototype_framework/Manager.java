package L6_Prototype_framework;

import java.util.HashMap;

/**
 * Productインタフェースを利用してインタフェースの複製を行うクラス
 * 他のクラスとの架け橋
 */
public class Manager {
	// showcaseフィールドはインスタンスの「名前」と「インスタンス」の対応関係
	// をHashMapとして表現したもの
	private HashMap showcase = new HashMap();

	// registerメソッドで製品の名前とProductインタフェースが与えられるとその1組をshowcase登録する
	public void register(String name, Product proto) {
		showcase.put(name,  proto);
	}

	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}
