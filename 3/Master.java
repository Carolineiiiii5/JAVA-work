package ktv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Master {
	//曲库
	List<Song>songList = new ArrayList<Song>();
	//添加歌曲入曲库
	public void addSongs()
	{
		songList.add(new Song("那就这样吧" , "动力火车" , "04:36"));
		songList.add(new Song("分分钟需要你" , "卢冠廷" , "02:46"));
		songList.add(new Song("美孚新村上春树" , "The Lee`s" , "05:32"));
		songList.add(new Song("圆" , "AGA" , "04:09"));
		songList.add(new Song("麦兜与鸡" , "何崇志" , "01:23"));
		songList.add(new Song("三年" , "李香兰" , "02:47"));
		songList.add(new Song("梦伴" , "李悦君" , "04:07"));
		
	}
	public void playInOrder()
	{
		songList.remove(0);
	}
	public void selectToPlay()
	{

	}

}
