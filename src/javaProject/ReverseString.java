package javaProject;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am an engineer";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}

		System.out.println("Original string is: "+s);
		System.out.println("Reversed string is: "+rev);
	}

}
