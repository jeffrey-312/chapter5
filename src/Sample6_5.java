
public class Sample6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car48 car1=new Car48("No.1_CAR");
		car1.start();
		
		try {
		car1.join();
		}catch(InterruptedException e) {
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("���b�B�zmain()���u�@");
		}
	}
}
class Car48 extends Thread{
	private String name;
	public Car48(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}