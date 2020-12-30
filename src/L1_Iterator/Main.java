package L1_Iterator;

public class Main {
	public static void main(String[] args) {
		// まず本が4冊入る本棚を作る
		BookShelf bookShelf = new BookShelf(4);

		// 4冊の本を作って入れる
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		// bookShelf.iterator()によって得られるitが本棚をスキャンするためのIteratorのインスタンス
		Iterator it = bookShelf.iterator();

		// 本がある限りループが回る
		while(it.hasNext()) {
			// ループの中でit.next()によって本を1冊1冊調べている
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
