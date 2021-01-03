package L5_Singleton;

// 問題5-1
public class TicketMaker {
//	private int ticket = 1000;
//	public int getNextTicketNumber() {
//		return ticket++;
//	}
	private int ticket = 1000;
	private static TicketMaker singleton = new TicketMaker();
	private TicketMaker() {
	}
	public static TicketMaker getInstance() {
		return singleton;
	}

	// synchronizedメソッド：複数のスレッドから呼び出されても正しく動くように
	// synchronizedがついていないと複数のスレッドに対して同じ値を返す危険性がある
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
