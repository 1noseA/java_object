package idcard;

import framework.Product;

public class IDCard extends Product {
	private String owner;
	private int serial;

	// 問題4-1
	// publicでないのはidcardパッケージ外からnewを使って生成できないことを示している
	// IDCardのインスタンスを生成する時は必ずIDCardFactoryを経由しないといけない
	IDCard(String owner, int serial) {
		System.out.println(owner + "(" + serial + ")のカードを作ります");
		this.owner = owner;
		this.serial = serial;
	}
	public void use() {
		System.out.println(owner + "(" + serial + ")のカードを使います");
	}
	public String getOwner() {
		return owner;
	}

	// 問題4-2
	public int getSerial() {
		return serial;
	}
}
