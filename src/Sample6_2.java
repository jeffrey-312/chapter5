
public class Sample6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car45 car1=new Car45("No.1_CAR");
		car1.start();
		
		Car45 car2=new Car45("No.2_CAR");
		car2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("���b�B�zmain()���u�@");
		}
	}
}
class Car45 extends Thread{
	private String name;
	public Car45(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}