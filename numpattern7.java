class numpattern7
{
	public static void main(String[] args) {
		
		for(int i= 1; i<=4; i++)
		{
			int num = 1;
			char ch = 'a';
			for(int j = 1; j <=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(num);
					
				}
				else 
				{
					System.out.print(ch);

				}
				num++;
				ch++;
			
			}
			System.out.println();
	}   }
}