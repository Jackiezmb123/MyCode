package test01;
class S{
	String name;
	int age=23;
	
	
	public S(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("继承我哈!");
	}
	
}
class D extends S{
	
	public D(String name,int age){
		/*this.name=name;
		this.age=age;*/
		
		super(name,age);
		
	}
	public void show(){
		System.out.println("名字为："+this.name+",年龄："+this.age);
	}
}
public class demo {
public static void main(String[] args) {
	S s=new D("Jackie",12);
	s.show();
}
}
