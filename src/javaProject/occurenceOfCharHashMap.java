package javaProject;

import java.util.HashMap;

public class occurenceOfCharHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Preeti";
		char[] ch=s.toCharArray();
		
		HashMap<Character, Integer> hm= new HashMap<>();
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				//hm.put(c, hm.get(ch)+1);
				hm.put(c, hm.get(c)+1);
				
			}
			else
			{
				hm.put(c, 1);
			}
					}
		System.out.println("Character frequency:"+hm);


	}

}
