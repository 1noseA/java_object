package gomoku;

import java.util.Scanner;

public class Stone implements Constant {
	Board board = new Board();

	// 石が正常に置けたらtrue, 置けなかったらfalse
	private boolean stoneSet;
	public boolean getStoneSet() {
		return stoneSet;
	}
	public void setStoneSet(boolean stoneSet) {
		this.stoneSet = stoneSet;
	}

	// 石の位置に関するフィールド
	private int tatePos;
	private int yokoPos;
	public int getTatePos() {
		return tatePos;
	}
	public void setTatePos(int tatePos) {
		this.tatePos = tatePos;
	}
	public int getYokoPos() {
		return yokoPos;
	}
	public void setYokoPos(int yokoPos) {
		this.yokoPos = yokoPos;
	}

	// 石配置処理
	// 後に続くコードが非推薦のメソッドであるなどの理由でコンパイル時に警告を出すものである場合、コンパイルする度に警告が出てしまうため、
	// @SuppressWarningsを先頭に置くことで警告を抑制してくれる効果がある。
	@SuppressWarnings("resource")
	// 引数trueが黒、falseが白
	public void stoneConfig(boolean stoneColer) {
		System.out.println("石の位置を入力してください");
		try {
			int tatePos = new Scanner(System.in).nextInt();
			int yokoPos = new Scanner(System.in).nextInt();
			if ((tatePos >= 0 && yokoPos >= 0) && (tatePos < BOARD_LENGTH && yokoPos < BOARD_LENGTH)) {
				if (Board.getPos(tatePos, yokoPos) == EMPTY_STONE) {
					setTatePos(tatePos);
					setYokoPos(yokoPos);
					board.board(getTatePos(), getYokoPos(), stoneColer);
					setStoneSet(true);
				} else {
					setStoneSet(false);
					System.out.println("石が置かれていない場所を選択してください");
				}
			} else {
				setStoneSet(false);
				System.out.println("0~" + (BOARD_LENGTH - 1) + "のどれかで入力してください");
			}
		} catch (Exception e) {
			setStoneSet(false);
			System.out.println("整数で入力してください");
		}
	}
}
