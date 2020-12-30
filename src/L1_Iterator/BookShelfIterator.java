package L1_Iterator;

/**
 * BookShelfクラスのスキャンを行うクラス
 * Iteratorインタフェースを実装
 */
public class BookShelfIterator implements Iterator {
    // BookShelfIteratorがスキャンする本棚
	private BookShelf bookShelf;
	// 現在注目している本を指す添字
	private int index;

	// コンストラクタ
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	// 「次の本」があるかどうか調べ、あるならtrue、ないならfalseを返す
	public boolean hasNext() {
		// 「次の本」があるかどうかはindexが本棚の本の冊数よりも小さいかどうかで判定
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	// 現在注目している本（Bookのインスタンス）を返し、さらに「次」へ進めるためのメソッド
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
