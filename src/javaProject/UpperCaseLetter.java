package javaProject;

public class UpperCaseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Print 8 UpPer CASE 77 LeTTer";
		System.out.print("UPper case letters are:");
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				
				System.out.print(s.charAt(i));
			}
			
		}

		System.out.println("\n");
		System.out.print("Lower case letter are:");
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
				System.out.print(s.charAt(i));
		}
	}

}
