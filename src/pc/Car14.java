package pc;

public class Car14 {
	private int num;
	private double gas;
	public Car14() {
		num=0;
		gas=0;
		System.out.println("�w�Ͳ��F�T��");
	}
	
	public void setCar(int n,double g) {
		num =n;
		gas =g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}