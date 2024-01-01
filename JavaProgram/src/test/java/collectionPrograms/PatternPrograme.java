package collectionPrograms;

public class PatternPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefg";
		char[] c = s.toCharArray();
		int m=c.length;
		
		for(int i=0;i<m;i++)
		{
			
			if(m%2==0)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(c[j]);
					
				}
				System.out.println();
			}
			
			if(m%2!=0)
			{
				for(int j=i+1;j<m;j++)
				{
					System.out.print(c[j]);

				}
			}
			System.out.println();
			m--;

			
		}

	}
}

