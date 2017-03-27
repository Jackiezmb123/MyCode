package test01;
/*
 * 抽象类跟普通类的构造器区别：
 * 对于普通类，若在父类中声明了有参构造器后，子类中可以不声明构造器，但此时父类也要声明无参构造器，或者子类调用时会报错
 * 对于抽象类，若在抽象类中声明了构造器后，子类必须利用super调用此构造器，但可以在父类中不需要声明无参构造器
 * 
 * 有问题呀？？？？？？？？？？？？？？？？
 * 
 */
abstract class Person{
	String name;
	int age;
	String occupation;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	public abstract void show();
}
class Student extends Person{
	public Student(String name,int age,String occupation){
		this.name=name;
		this.age=age;
		this.occupation=occupation;
		//super(name,age,occupation);
		
	}
	public void show(){
		System.out.println("学生的姓名："+this.name+",年龄："+this.age+",职业："+this.occupation);
		//System.out.println("如果不调用的话，必须在父类中还要声明无参构造器");
	}
}
public class abstractConstruct {
public static void main(String[] args) {
	Person p=new Student("Jackie",23,"学习");
	//Person p=new Student("Jackie",23,"学习");
	p.show();
	
	/*Person p=new Student();
	p.show();*/
}
}
