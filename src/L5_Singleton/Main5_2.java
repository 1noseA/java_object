package L5_Singleton;

public class Main5_2 {
	public static void main(String[] args) {
		System.out.println("Start.");
		for (int i = 0; i < 9; i++) {
			Triple triple = Triple.getInstance(i % 3);
			System.out.println(i + ":" + triple);
		}
		System.out.println("End.");
	}

}
