package L1_Iterator;

import java.util.ArrayList;

/**
 * 本棚を表現しているクラス
 * 集合体として扱うためにAggregateインタフェースを実装
 */
public class BookShelf implements Aggregate {
	private ArrayList books;
	private int last = 0;

	public BookShelf(int initialsize) {
		this.books = new ArrayList(initialsize);
	}
	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}
	public void appendBook(Book book) {
		books.add(book);
	}
	public int getLength() {
		return books.size();
	}
	// 本棚の本を数え上げたい時iteratorメソッドが呼び出される
	public Iterator iterator() {
		// ここのthisはBookShelfクラスのBookShelf
		return new BookShelfIterator(this);
	}
}
