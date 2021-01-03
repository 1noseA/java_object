package idcard;

import java.util.HashMap;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
//	private List owners = new ArrayList();
//
//	// IDCardのインスタンスを生成することで「製品を作る」ことを実際に実現
//	protected Product createProduct(String owner) {
//		return new IDCard(owner);
//	}
//
//	// IDCardのownerをownersフィールドに追加して「登録」という機能を実現
//	protected void registerProduct(Product product) {
//		owners.add(((IDCard)product).getOwner());
//	}
//	public List getOwners() {
//		return owners;
//	}

	// 問題4-2
	private HashMap database = new HashMap();
	private int serial = 100;

	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	protected void registerProduct(Product product) {
		IDCard card = (IDCard)product;
		database.put(new Integer(card.getSerial()), card.getOwner());
	}

	public HashMap getDatabase() {
		return database;
	}
}
