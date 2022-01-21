package javaProject;

public class occurenceOfCharsSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Preeti";
		StringBuilder sb= new StringBuilder(str);
		
		char ch;
		for(int i=0;i<sb.length();i++)
		{
			int count=1;
			for(int j=i+1;j<sb.length();j++)
			{
				ch=sb.charAt(i);
				if(sb.charAt(i)==sb.charAt(j))
				{
					count++;
					sb.setCharAt(j, '0');
				}
			}
		
			if(sb.charAt(i)!='0')
				System.out.println("Count of "+sb.charAt(i)+ " is "+count);		}
	}

}
