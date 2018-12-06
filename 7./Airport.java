package transportation;

public class Airport extends Vehicle {

	Airport(int distance)
	{
		//交通方式名称
		name = "airport" ;
		//取票时间
		ticketTime = 20 ;
		//安检时间
		checkTime = 10 ;
		//候车时间
		waitTime = 30 ;
		//车速
		speed = 900 ;
		//单价（汽车0.32元/公里，高铁二等座0.45/公里，飞机0.75/公里)
		unitPrice = 0.75 ;
		
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
