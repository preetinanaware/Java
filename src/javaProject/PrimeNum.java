package javaProject;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=35;
		int i,m=0,flag=0;
		
		m=num/2;
		
		for(i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+ " is not a prime number");
				flag=1;
				break;
		}
		
		
		}

	
	if(flag==0)
		System.out.println(num+ " is a prime number");
	}
}
