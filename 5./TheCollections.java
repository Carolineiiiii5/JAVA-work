package CollectionTest;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class TheCollections {
	public List<String> list = new ArrayList<String>() ;
	public Set<String> set = new HashSet<String>() ;
	public HashSet<String> hset = new HashSet<String>() ;
	public TreeSet<String> tset = new TreeSet<String>() ;
	public void addList()
	{
		for(int i = 1 ; i<= 1000 ; i++ ) 
		{
			list.add(String.valueOf(i)) ;
		}
	}	
	public void addSet()
	{
		for(int i = 1 ; i<= 1000 ; i++ ) 
		{
			set.add(String.valueOf(i)) ;
		}
	}
	public void addHashSet()
	{
		for(int i = 1 ; i<= 1000 ; i++ ) 
		{
			set.add(String.valueOf(i)) ;
		}
	}
	public void addTreeSet()
	{
		for(int i = 1 ; i<= 1000 ; i++ ) 
		{
			set.add(String.valueOf(i)) ;
		}
	}
}
