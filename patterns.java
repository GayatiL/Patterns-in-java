class patterns 
{
	public static void main(String[] args) {
		for(int i =1; i<=5; i++ )
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

      
		/*for(int i =1; i<5; i++ )
		{
			int num =1;
			for(int j = 1; j<=i; j++)
			{
				if(j%2!=0)
				{
					System.out.print(num+"  ");
				}
				else
				{
					System.out.println(num+2 +" ");
				}
				num++;
				
			}
			System.out.println();
		}
        int a =1;
		for(int i =1; i<5; i++ )
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(a++ + " ");

			}
			System.out.println();
        }*/
        

        for(int i =1; i<=5; i++)
        {
        	for (int j = 1; j<=5-i ;j++ ) {
        		System.out.print("  ");
        		
        	}
        	for (int j = 1; j<=i ; j++ ) {
        		System.out.print("* ");
        		
        	}
        	System.out.println();
        }

           for(int i =1; i<=5; i++)
        {
        	for (int j = 1; j<=5-i ;j++ ) {
        		System.out.print("* ");
        		
        	}
        	for (int j = 1; j<=i ; j++ ) {
        		System.out.print(" ");
        		
        	}
        	System.out.println();
        }
	}
}