
package test01;
abstract class Animal{
	public abstract void eat();
	public abstract void sleep();
	
}
class Person5 extends Animal{
	public void eat(){
		System.out.println("1");
	}
	public void sleep(){
		System.out.println("2");
		
	}
	public void work(){
		System.out.println("3");
	}
	public void study(){
		System.out.println("4");
	}
}
public class Test02 {
public static void main(String[] args) {
	//对象多态表现
	 Animal animal=new Person5();
	 animal.eat();
	 animal.sleep();
}
}
