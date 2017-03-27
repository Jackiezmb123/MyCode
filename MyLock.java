package test01;
//ËÀËø³ÌÐò    (Í¬²½Ç¶Ì×------µ¼ÖÂËÀËø)
class Lock implements Runnable{
	public boolean flag;
	Lock(boolean flag){
    this.flag=flag;
}
	public void run(){
		if(flag){
			synchronized(MyDeadLock.locka){
				System.out.println(Thread.currentThread().getName()+"if........locka");
				
				synchronized(MyDeadLock.lockb){
					System.out.println(Thread.currentThread().getName()+"if........lockb");
				}
			}
			
		}else{
                synchronized(MyDeadLock.lockb){
                	System.out.println(Thread.currentThread().getName()+"else........lockb");
				synchronized(MyDeadLock.locka){
					System.out.println(Thread.currentThread().getName()+"else........locka");
				}
			}
		}
	}
}
class MyDeadLock{
	public static final Object locka=new Object(); 
	public static final Object lockb=new Object(); 
}
public class MyLock {
public static void main(String[] args) {
	new Thread(new Lock(true)).start();
	new Thread(new Lock(false)).start();
}
}
