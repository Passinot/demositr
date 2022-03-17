package Day3;
//and operator  -- all conditions must be true (&&)
//wap to check if total sales>50000 and experience>5 year so eligible for bonus
//else not eligible 

import java.util.Scanner;

public class LogicalAndExample {

	public static void main(String[] args) 
	{
	 int sales,exp;
	 Scanner j= new Scanner(System.in);
	 System.out.println("enter sale done");
	 sales=j.nextInt();
	 
	 System.out.println("enter experince done");
	 exp=j.nextInt();
	 
	 if(sales>50000 && exp>5)
	 {
		 System.out.println(" Eligible for bonus");
	 }
	 else
	 {
		 System.out.println("not eligible");
	 }
			 
		
		
	}

}
