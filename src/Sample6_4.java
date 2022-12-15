
public class Sample6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car47 car1=new Car47("No.1_CAR");
		car1.start();
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在處理main()的工作");
			}catch(InterruptedException e) {
				
			}
			
		}
	}
}
class Car47 extends Thread{
	private String name;
	public Car47(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("正在進行"+name+"的處理工作");
		}
	}
}