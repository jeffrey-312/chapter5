package pa;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Car {
	private int num;
	private double gas;
	public Car() {
		num=0;
		gas=0;
		System.out.println("已生產了汽車");
	}
	
	public void setCar(int n,double g) {
		num =n;
		gas =g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
	}
}