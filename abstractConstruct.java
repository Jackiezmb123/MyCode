package test01;
/*
 * ���������ͨ��Ĺ���������
 * ������ͨ�࣬���ڸ������������вι������������п��Բ�����������������ʱ����ҲҪ�����޲ι������������������ʱ�ᱨ��
 * ���ڳ����࣬���ڳ������������˹������������������super���ô˹��������������ڸ����в���Ҫ�����޲ι�����
 * 
 * ������ѽ��������������������������������
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
		System.out.println("ѧ����������"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation);
		//System.out.println("��������õĻ��������ڸ����л�Ҫ�����޲ι�����");
	}
}
public class abstractConstruct {
public static void main(String[] args) {
	Person p=new Student("Jackie",23,"ѧϰ");
	//Person p=new Student("Jackie",23,"ѧϰ");
	p.show();
	
	/*Person p=new Student();
	p.show();*/
}
}
