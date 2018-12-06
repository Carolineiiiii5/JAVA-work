package transportation;

public abstract class Vehicle {
	//交通方式名称
	String name ;
	//取票时间
	int ticketTime ;
	//安检时间
	int checkTime ;
	//候车时间
	int waitTime ;
	//总时间
	int sumTime ;
	//车速
	double speed ;
	//单价（汽车0.32元/公里，高铁二等座0.45/公里，飞机0.75/公里)
	double unitPrice ;
	//总价
	double sumPrice ;
	
	//两地距离
	int distance ;
	
	
	//计算消耗时间和价格
	protected abstract void calculate() ;
	//调用抽象方法输出。
	public void output() 
	{
		this.calculate();
		int hours = sumTime/60;
		int minutes = sumTime - hours*60;
		System.out.print("使用" + name  + "所需时间为:");
		if(hours!=0)
		{
			System.out.print(hours + "小时");
		}
		System.out.println(minutes + "分钟");
		System.out.println("使用" + name  + "所需价钱为:" + sumPrice + "元");
	}

}
