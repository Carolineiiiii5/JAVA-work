package ktv;

import java.util.Scanner;

public class MainControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 , j = 0;
		Master master = new Master();
		User user = new User();
		Scanner sc = new Scanner(System.in);
		//加入歌曲信息
		master.addSongs();
		
		
		
		System.out.println("----菜单----");
		System.out.println("1.歌曲列表");	
		System.out.println("2.已点歌单");
		System.out.println("3.点歌");
		System.out.println("4.将歌曲顶置");
		System.out.println("5.顺序播放");
		System.out.println("6.选择播放");
		System.out.println("7.退出");
		System.out.println("------------");
		do 
		{
			System.out.print("请选择：");
			i = sc.nextInt();
			switch(i)
			{
			case 1 : 
				System.out.println("----------歌曲列表----------");
				for(j = 0;j<7;j++)
				{
					System.out.println((j+1) + ". " + master.songList.get(j).name + "-" + master.songList.get(j).singer + "  " + master.songList.get(j).time);
				}
				System.out.println("---------------------------");
				break;
			case 2 : 
				System.out.println("----------已点歌单----------");
				for(j = 0;j<user.orderedList.size();j++)
				{
					System.out.println((j+1) + ". " + user.orderedList.get(j).name + "-" + user.orderedList.get(j).singer + "  " + user.orderedList.get(j).time);
				}
				System.out.println("---------------------------");
				break;
			case 3 : 
				user.orderSongs();
				break;
			case 4 : 
				try
				{
					System.out.print("请输入想要顶置的歌曲在已点歌单中的序号：");
					j= sc.nextInt();
					Song a = user.orderedList.remove(j-1);
					user.orderedList.add(0, a);
					System.out.println("顶置成功！");
				}
				catch(Exception e)
				{
					System.out.println("您输入的数字有误，已点歌单中不存在此歌！");
				}
				
				break;
			case 5 : 
				user.orderedList.remove(0);
				System.out.println("播放成功！");
				break;
			case 6 : 
				System.out.print("请输入想要播放的歌曲在已点歌单中的序号：");
				j = sc.nextInt();
				Song a = user.orderedList.remove(j-1);
				break;
			case 7 : break;
			default: System.out.println("您输入的数字有误，请重新输入！");
			}	
		}while(i!=7);
		System.out.print("成功退出！");

	}

}
