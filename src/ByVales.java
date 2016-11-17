public class ByVales extends Person{

	public static void add(int a, int b) {
		a = a + b;
	}

	public static void add(Data a, Data b) {
		a.setData(a.getData() + b.getData());
	}

	public static void main(String[] args) {
		Data x, y;
		x = new Data(1);
		y = new Data(2);
		add(x, y);
		System.out.println(" X = " + x.getData());
		ByVales by = new ByVales();
		by.name("Narumon");
	}

	@Override
	public void name(String n) {
		name = n;
		show();
	}

}
class Data {
	int d;
	
	public Data(int d) {
		super();
		this.d = d;
	}

	public int getData() {
		return d;
	}

	public void setData(int d) {
		this.d = d;
	}
}
abstract class Person {
	String name;
	public abstract void name(String n);
	public void show() {
		System.out.println("Name = "+name);
	}
}