package javaProject;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Preeti";
		int[] arr= new int[s.length()];
		char[] string = s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			arr[i]=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(string[i]==string[j])
				{
					arr[i]++;
					string[j]='0';
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(string[i]!='0')
				System.out.println(string[i]+" "+arr[i]);
		}

	}

}
