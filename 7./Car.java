package transportation;

public class Car extends Vehicle {
	
	Car(int distance)
	{
		//交通方式名称
		name = "car" ;
		//取票时间
		ticketTime = 0 ;
		//安检时间
		checkTime = 0 ;
		//候车时间
		waitTime = 30 ;
		//车速
		speed = 100 ;
		//单价（汽车0.32元/公里，高铁二等座0.45/公里，飞机0.75/公里)
		unitPrice = 0.32 ;
		
		//两地距离
		this.distance = distance;
	}

	@Override
	protected void calculate() {
		// TODO Auto-generated method stub
		this.sumTime = (int)(ticketTime + checkTime + waitTime + distance/speed) ;
		this.sumPrice = distance*unitPrice ;
	}
}
