
public class Sample5_5_2 {

	public static void main(String[] args)throws CarException {
		// TODO Auto-generated method stub
		Car32 car1=new Car32();
		
		car1.setCar(1234, -10.5);
		
		car1.show();
	}

}
class Car32 {
	private int num;
	private double gas;
	public Car32() {
		num=0;
		gas=0;
		System.out.println("�w�Ͳ��F�T��");
	}
	
	public void setCar(int n,double g) throws CarException
	{
		if(g<0) {
			CarException e=new CarException();
			throw e;
		}else {
			num =n;
			gas =g;
			System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
		}
		
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}
class CarException extends Exception{
	
}