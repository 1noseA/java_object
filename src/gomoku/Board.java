package gomoku;

public class Board implements Constant {
	// 石の位置を保存
	private static String[][] pos = new String[BOARD_LENGTH][BOARD_LENGTH];
	public static void setPos(int tate, int yoko, String stone) {
		pos[tate][yoko] = stone;
	}
	public static String getPos(int tate, int yoko) {
		return pos[tate][yoko];
	}

	// trueなら黒、falseなら白
	private Boolean stoneColor;
	public Boolean isStoneColor() {
		return stoneColor;
	}
	public void setStoneColor(Boolean stoneColor) {
		this.stoneColor = stoneColor;
	}

	public void firstShowBoard() {
		// 基板の数字表示
		for (int i = 0; i < BOARD_LENGTH; i++) {
			if (i == (BOARD_LENGTH - 1)) {
				System.out.println(i);
			} else if (i == 0) {
				System.out.print(" " + i + ",");
			} else {
				System.out.print(i + ",");
			}
		}
		for (int j = 0; j < BOARD_LENGTH; j++) {
			System.out.println(j);
		}

		// pos配列の全ての座標に"□"を格納し、pos参照時のnullを防ぐ
		for (int i = 0; i < BOARD_LENGTH; i++) {
			for (int j = 0; j < BOARD_LENGTH; j++) {
				setPos(i, j, EMPTY_STONE);
				System.out.print(EMPTY_STONE);
			}
			System.out.println("");
		}
	}

	// 基板作成メソッド
	public void board(int tate, int yoko, boolean stoneColor) {
		// stoneColorがtrueで黒、falseで白
		setStoneColor(stoneColor);

		// iは縦、jは横
		for (int i = 0; i < BOARD_LENGTH; i++) {
			for (int j = 0; j < BOARD_LENGTH; j++) {
				if ((i == tate) && (j == yoko)) {
					if (isStoneColor()) {
						setPos(tate, yoko, BLACK_STONE);
						System.out.print(getPos(tate, yoko));
					} else {
						setPos(tate, yoko, WHITE_STONE);
						System.out.print(getPos(tate, yoko));
					}
				} else {
					System.out.print(getPos(i, j));
				}
			}
			System.out.println("");
		}
	}
}
