package transportation;

import java.util.Scanner;

public class mainControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入出发地:" );
		String come = sc.next();
		System.out.print("请输入目的地:" );
		String to = sc.next();
		System.out.print("请输入两地之间的距离(km):" );
		int dis = sc.nextInt();
		
		Car c = new Car(dis);
		Airport a =new Airport(dis);
		Train t = new Train(dis);
		System.out.println();
		System.out.println();
		System.out.println(come + "--->" + to);
		System.out.println();
		c.output();
		System.out.println();
		a.output();
		System.out.println();
		t.output();
		System.out.println();
		
		
	}

}
