package by.tr.home.oop;

public class Test2 {

	private int varA;
	private int varB;

	public Test2() {
		this.varA = 5;
		this.varB = 4;
	}

	public Test2(int a, int b) {
		this.varA = a;
		this.varB = b;
	}

	public int getVarA() {
		return varA;
	}

	public void setVarA(int varA) {
		this.varA = varA;
	}

	public int getVarB() {
		return varB;
	}

	public void setVarB(int varB) {
		this.varB = varB;
	}

	public static void main(String[] args) {
		Test2 test1 = new Test2();
		Test2 test2 = new Test2(4, 4);

		System.out.println(test1.getVarA() + " > " + test2.getVarA() + " : " + (test1.getVarA() > test2.getVarA()));
		System.out.println(test1.getVarB() + " > " + test2.getVarB() + " : " + (test1.getVarB() > test2.getVarB()));

	}

}
