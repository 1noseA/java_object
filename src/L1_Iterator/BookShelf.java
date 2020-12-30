package L1_Iterator;

/**
 * 本棚を表現しているクラス
 * 集合体として扱うためにAggregateインタフェースを実装
 */
public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	public int getLength() {
		return last;
	}
	// 本棚の本を数え上げたい時iteratorメソッドが呼び出される
	public Iterator iterator() {
		// ここのthisはBookShelfクラスのBookShelf
		return new BookShelfIterator(this);
	}
}
