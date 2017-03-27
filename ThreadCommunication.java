package test01;
class Producer implements Runnable{
	Person55 p=null;
	public Producer(Person55 p){
		this.p=p;
	}
	public void run(){
		for(int i=0;i<10;i++){
			if(i%2==0){
				p.set("张三", "男");
			}else{
				p.set("李四", "女");
			}
		}
		
	}
}
class Consumer implements Runnable{
	Person55 q=null;
	public Consumer(Person55 q){
		this.q=q;
		
	}
	public void run(){
		for(int i=0;i<10;i++){
			q.get();
			
		}
	}
}
class Person55{
	private String name="李四";
	private String sex="女";
	private boolean bFull=false;
	public synchronized void set(String name,String sex){
		if(!bFull){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		this.name=name;
		this.sex=sex;
		bFull=false;
		notify();
	}
	public synchronized void get(){
		if(bFull){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		System.out.println(this.name+"     "+this.sex);
		bFull=true;
		notify();
	}
}
public class ThreadCommunication {
public static void main(String[] args) {
	Person55 q=new Person55();
	new Thread(new Producer(q)).start();
	new Thread(new Consumer(q)).start();
}
}
