
public class InvA {
	public static void main(String[] args) {
		A a1=new A();
		a1.x=4;
		a1.y=3;
		B b1=new B();
		b1.x=7;
		b1.y=4;
		out.print(a1.add()+b1.subtract());
	}
}


class A {
	public int x;
	public int y;

	public A() {
		x = 0;
		y = 0;
	}

	public A(int a, int b) {
		x = a;
		y = b;
	}

	public int add() {
		return x + y;
	}
}

class B extends A {
	public B(int m, int n) {
		x = m;
		y = n;
	}

	public int subtract() {
		return x - y;
	}
}
