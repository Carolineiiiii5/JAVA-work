package CollectionTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test() ;
		System.out.println("测试各类集合对数据的存储性能：" );
		test.storageCapacity();
		System.out.println();
		System.out.println("测试各类集合对数据的查找性能：" );
		test.searchCapacity();
	}
}
