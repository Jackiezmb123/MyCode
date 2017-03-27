package test01;
class ThreadJoinTest implements Runnable{
	public void run(){
		int i=0;
		for(int x=0;x<5;x++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName()+"------"+i);
			i+=1;
		}
	}
	
}
public class ThreadJoin {
public static void main(String[] args) {
	Thread t=new Thread(new ThreadJoinTest());
	
	t.start();
	int i=0;
	for(int x=0;x<5;x++){
		if(i==3){
			try{
		//join()���� �߳����� һ���������߳���
		//��i=3ʱ�����̱߳�����ִ��t�̣߳�ֱ��t�߳̽������ٻ���ִ��main�߳�
		t.join();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		System.out.println("main:"+i);
		i+=1;
		
	}
}
}
