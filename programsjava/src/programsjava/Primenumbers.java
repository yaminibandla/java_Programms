package programsjava;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String Primenumbers=" ";
		for (int i=1;i<=50;i++)
		{
			boolean flag = true;
			//int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
					
				}
			}
			if(flag==true)
			{
				System.out.println("i");
				//System.out.println();
			}
			
		}

	}

}
