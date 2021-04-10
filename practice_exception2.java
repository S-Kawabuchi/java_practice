public class practice_exception2 {
    public static void main(String[] args) {
		Yushu y = new Yushu();
		Bonsai b = new Bonsai();
		Teihen t = new Teihen();
		
		System.out.println("優秀クラスの男子の人数は" + y.man + "人です。");
		System.out.println("優秀クラスの女子の人数は" + y.women + "人です。");
		System.out.println("凡才クラスの男子の人数は" + b.man + "人です。");
		System.out.println("凡才クラスの女子の人数は" + b.women + "人です。");
		System.out.println("底辺クラスの男子の人数は" + t.man + "人です。");
		System.out.println("底辺クラスの女子の人数は" + t.women + "人です。");
	}
}

class Yushu {
	int man = 15;
	int women = 16;
}

class Bonsai {
	int man = 17;
	int women = 13;
}

class Teihen {
	int man = 12;
	int women = 18;
}