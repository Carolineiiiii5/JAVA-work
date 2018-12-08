package ktv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	//已点列表
	List<Song>orderedList = new ArrayList<Song>();
	//点播歌曲入已点列表
	public void orderSongs()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入想要点播的歌曲的序号：");
		int i = sc.nextInt();
		switch(i)
		{
		case 1 : 
			orderedList.add(new Song("那就这样吧" , "动力火车" , "04:36"));
			System.out.println("歌曲添加成功！");
			break;
		case 2 :
			orderedList.add(new Song("分分钟需要你" , "卢冠廷" , "02:46"));
		System.out.println("歌曲添加成功！");
			break;
		case 3 : 
			orderedList.add(new Song("美孚新村上春树" , "The Lee`s" , "05:32"));
			System.out.println("歌曲添加成功！");
			break;
		case 4 : 
			orderedList.add(new Song("圆" , "AGA" , "04:09"));
			System.out.println("歌曲添加成功！");
			break;
		case 5 : 
			orderedList.add(new Song("麦兜与鸡" , "何崇志" , "01:23"));
			System.out.println("歌曲添加成功！");
			break;
		case 6 :
			orderedList.add(new Song("三年" , "李香兰" , "02:47"));
			System.out.println("歌曲添加成功！");
			break;
		case 7 :
			orderedList.add(new Song("梦伴" , "李悦君" , "04:07"));
			System.out.println("歌曲添加成功！");
			break;
		default: System.out.println("您输入的数字有误，曲库中不存在此歌！");
		}
	}

}
