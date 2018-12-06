package CollectionTest;

public class Test {
	TheCollections L1 = new TheCollections();
	long startTime ;
	long endTime ;
	int number ;
	public void storageCapacity() {
		//List
		startTime = System.nanoTime() ;
		L1.addList() ;
		endTime = System.nanoTime() ;
		System.out.println("list存储数据所用时间为：" + (endTime - startTime));
		//Set
		startTime = System.nanoTime() ;
		L1.addSet();
		endTime = System.nanoTime() ;
		System.out.println("Set存储数据所用时间为：" + (endTime - startTime));
		//HashSet
		startTime = System.nanoTime() ;
		L1.addHashSet();
		endTime = System.nanoTime() ;
		System.out.println("HashSet存储数据所用时间为：" + (endTime - startTime));
		//TreeSet
		startTime = System.nanoTime() ;
		L1.addTreeSet();
		endTime = System.nanoTime() ;
		System.out.println("TreeSet存储数据所用时间为：" + (endTime - startTime));
		
	}
	public void searchCapacity() {
		//List
		number = (int) (Math.random()* L1.list.size() );//随机取一个数
		startTime = System.nanoTime() ;
		L1.list.contains(number) ;
		endTime = System.nanoTime() ;
		System.out.println("list查询数据所用时间为：" + (endTime - startTime));
		//Set
		number = (int) (Math.random()* L1.set.size() );//随机取一个数
		startTime = System.nanoTime() ;
		L1.set.contains(number) ;
		endTime = System.nanoTime() ;
		System.out.println("Set查询数据所用时间为：" + (endTime - startTime));
		//HashSet
		number = (int) (Math.random()* L1.hset.size() );//随机取一个数
		startTime = System.nanoTime() ;
		L1.hset.contains(number) ;
		endTime = System.nanoTime() ;
		System.out.println("HashSet查询数据所用时间为：" + (endTime - startTime));
		//TreeSet
		number = (int) (Math.random()* L1.tset.size() );//随机取一个数
		startTime = System.nanoTime() ;
		L1.tset.contains(number) ;
		endTime = System.nanoTime() ;
		System.out.println("TreeSet查询数据所用时间为：" + (endTime - startTime));
	}

}
