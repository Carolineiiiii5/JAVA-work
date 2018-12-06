public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer I1 = 1 ;
		Integer I2 = I1 ;
		Integer I3 =  new Integer(I1)  ;
		System.out.println("I1 = " + I1);
		System.out.println("I2 = " + I2);
		System.out.println("I3 = " + I3);
		I1 = 2 ;
		System.out.println("I1 = " + I1);
		System.out.println("I2 = " + I2);
		System.out.println("I3 = " + I3);
				
	}

}
