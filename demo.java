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
		System.out.println("�̳��ҹ�!");
	}
	
}
class D extends S{
	
	public D(String name,int age){
		/*this.name=name;
		this.age=age;*/
		
		super(name,age);
		
	}
	public void show(){
		System.out.println("����Ϊ��"+this.name+",���䣺"+this.age);
	}
}
public class demo {
public static void main(String[] args) {
	S s=new D("Jackie",12);
	s.show();
}
}
