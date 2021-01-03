package idcard;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();

	// IDCardのインスタンスを生成することで「製品を作る」ことを実際に実現
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	// IDCardのownerをownersフィールドに追加して「登録」という機能を実現
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwners() {
		return owners;
	}
}
