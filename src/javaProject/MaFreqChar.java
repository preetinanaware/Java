package javaProject;

import java.util.HashMap;
import java.util.Map;

public class MaFreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Preeti";
		char[] c=s.toCharArray();
		
		HashMap<Character,Integer> hm= new HashMap<>();
		for(char ch:c)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);

		int max=0;
		char maxchar=' ';
		for(Map.Entry<Character, Integer>me: hm.entrySet())
		{
			if(max<me.getValue())
			{
			 max=me.getValue();
			maxchar=me.getKey();
			}
		}
		System.out.println("Max repeated char: "+maxchar+"; occurred " +max+" times");
	}

}
