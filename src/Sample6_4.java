
public class Sample6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car47 car1=new Car47("No.1_CAR");
		car1.start();
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���b�B�zmain()���u�@");
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
				System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}