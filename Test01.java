package test01;
abstract class Ope{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ope(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void work();
}
class Waitor extends Ope{
	public Waitor(String name,int age){
		super(name,age);
	}
	public void work(){
		System.out.println(this.getName()+"าชนคื๗ภี");
	}
}
public class Test01 {
public static void main(String[] args) {
	Ope p=new Waitor("jackie",23);
	p.work();
}
}
