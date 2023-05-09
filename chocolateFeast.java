package findIndexArray;

public class chocolateFeast {
	public static void main(String[] args) {
		int money = 15;
		int price = 3;
		int wrap = 2;
		int totalChocolate = totalChocolate(money, price, wrap);
		System.out.println(totalChocolate);

	}

	public static int totalChocolate(int money, int price, int wrap) {
		int choco = money / price;
		return choco + chocoExchange(choco, wrap);
	}

	public static int chocoExchange(int choco, int wrap) {
		if (choco < wrap)
			return 0;
		int newChoco = choco / wrap;
		return newChoco + chocoExchange(newChoco + choco % wrap, wrap);
	}
}
