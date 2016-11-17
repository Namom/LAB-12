public class Inheritance {

	public static void main(String[] args) {
		Ant ant = new Ant();
		Cat cat = new Cat();
				
		System.out.println("Ant is "+ant.getType());	
		System.out.println("Cat is "+cat.getType());
		
	}

}
interface Activity {
	abstract void walk();
	abstract void run();
	abstract void eat();
}
class Animal {
	String type;

	public Animal() {
		super();
		this.type = "Unknown";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
class Ant extends Animal implements Activity {

	public Ant() {
		super();		
		setType("Insect");
	}

	@Override
	public void walk() {
		System.out.println("Ant walks on the floor");		
	}

	@Override
	public void run() {
		System.out.println("Ant runs .......");
		
	}

	@Override
	public void eat() {
		System.out.println("Ant eats sugar");
		
	}
	
}
class Cat extends Animal implements Activity {

	public Cat() {
		super();
		setType("Carnivorous");
	}

	@Override
	public void walk() {
		System.out.println("Cat walks on the floor");		
	}

	@Override
	public void run() {
		System.out.println("Cat runs .......");		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats fish");		
	}
	
}