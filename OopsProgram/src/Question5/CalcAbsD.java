package Question5;



public class CalcAbsD extends CalcAbsC{
	@Override void div(int a, int b) 
	{ 
		float div=a/b; 
		System.out.println("Division is:" +div);
		
		} 

	public static void main(String[] args) {
		CalcAbsD d= new CalcAbsD();
		d.div(4,2);
		d.mul(3, 4);
		d.sub(10, 8);
		d.sum(9, 1);
	}
}
