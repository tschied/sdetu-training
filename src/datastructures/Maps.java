package datastructures;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args)
	{
		
		// Implement map Interfaces
		
//		Map<Integer,String> hMap = new HashMap<Integer,String>();				// random, not ordered
//		Map<Integer,String> hMap = new LinkedHashMap<Integer,String>();			// keys in order like added to the map
		Map<Integer,String> hMap = new TreeMap<Integer,String>();				// keys come ordered
		
		mapUtil(hMap);

	}
	
	public static void mapUtil(Map<Integer,String> map)
	{
		// 1. Add Key-Value - pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(22 , "Jennifer");
		map.put(315, "Mika");
		map.put(36 , "Ellie");
		map.put(750, "Kelly");
		
		// 2. Expose 7 access elements
		System.out.println("See all keys: "+map.keySet());
		System.out.println("See all key-value-pairs: "+map);
		System.out.println(map.get(502));
		
		
		// 3. Iterate through map of key-value pairs
		for( int key : map.keySet())
		{
			System.out.println("[KEY: "+key+". VALUE: "+map.get(key)+"]");
		}

	}

}
