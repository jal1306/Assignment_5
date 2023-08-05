// 2. A java program to find the number of days in a month without date function.

import java.util.Scanner;
class Qus2
{ 
    public static void main(String s[])
    {
		int m,y,days=0;
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Month in Number:- ");
		m=sc.nextInt();
		if(m<=12 && m>=1)
		{
			System.out.println("Enter Year:- ");
			y=sc.nextInt();
			if(m==1 || m==3 ||m==5 ||m==7||m==8||m==10||m==12)
			{
				days=31;	 
			}
			else 
			{
				if(m==4||m==6||m==9||m==11)
				{
					days=30;	  
				}
				else 
				{
					if(m==2)
					{
						if(y%400==0&&y%100==0)
						{
							days=29;
						}
						else  
						{
							if(y%4==0&&y%100!=0)
							{
								days=29;
							}
							else
							{
								days=28;
							}
						}
					}
		 	    }  	
			}	
			System.out.println("Number of Days in this Month is:- "+days);
		}
		else
		{
			System.out.println("Entered Month Number Wrong");
	    }         
	}
}