package by.tr.home.oop;

public class Test1 {

	private int a;
	private int b;

	public Test1() {
	}

	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int sum() {
		return a + b;
	}

	public int getMax() {
		return a > b ? a : b;
	}

	public void print() {
		System.out.println("a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {

		Test1 test = new Test1();

		int max = test.getMax();

		test.print();

		System.out.println("max = " + max);

		test.setA(5);
		test.setB(6);

		test.print();

		max = test.getMax();

		System.out.println("max = " + max);
		System.out.println("Sum = " + test.sum());
	}

}
