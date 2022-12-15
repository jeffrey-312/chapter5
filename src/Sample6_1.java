
public class Sample6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car44 car1=new Car44("No.1_CAR");
		car1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("正在處理main()的工作");
		}
	}
}
class Car44 extends Thread{
	private String name;
	public Car44(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}