package com.strat;

	import java.util.Scanner;

	public class Main {
		// Change
		//add specific defense and gear speed
		int g, z, y, l, a, b, c, a1, b1, c1;
		int l1, l2, l3, l4, l5, l6;
		int x1, x2, x3, x4, x5, x6, m1, m;
		int g1, n1, n2, n3, n4, n5, n6;

		public static void main(String args[]) {
			new Main();
		}
		
		public Main() {
			Scanner in = new Scanner(System.in);
			
			int total1 = 0;
			int total2 = 0;
		
			System.out.println("Team 1: ");
			int tm1 = in.nextInt(); 
			
			System.out.println("Team 2: ");
			int tm2 = in.nextInt(); 
			
			System.out.println("How many seconds does defense slow down bots on each pass?");
			int d = in.nextInt();

			{
			if(tm1 == 1)
			{
				a = 1;
				b = 1;
				c = 1;
			}
			
			if(tm1 == 2)
			{
				 a = 1;
				b = 1;
				c = 2;
			}
			if(tm1 == 3)
			{
				 a = 1;
				 b = 1;
				 c = 3;
			}
			
			if(tm1 == 4)
			{
				 a = 1;
				 b = 1;
				 c = 4;
			}
			if(tm1 == 5)
			{
				 a = 1;
				 b = 2;
				 c = 2;
			}
			
			if(tm1 == 6)
			{
				 a = 1;
				 b = 2;
				 c = 3;
			}
			if(tm1 == 7)
			{
				 a = 1;
				 b = 2;
				 c = 4;
			}
			
			if(tm1 == 8)
			{
				 a = 1;
				 b = 3;
				 c = 3;
			}
			if(tm1 == 9)
			{
				 a = 1;
				 b = 3;
				 c = 4;
			}
			
			if(tm1 == 10)
			{
				 a = 1;
				 b = 4;
				 c = 4;
			}
			if(tm1 == 11)
			{
				 a = 2;
				 b = 2;
				 c = 2;
			}
			
			if(tm1 == 12)
			{
				 a = 2;
				 b = 2;
				 c = 3;
			}
			if(tm1 == 13)
			{
				 a = 2;
				 b = 2;
				 c = 4;
			}
			
			if(tm1 == 14)
			{
				 a = 2;
				 b = 3;
				 c = 3;
			}
			if(tm1 == 15)
			{
				 a = 2;
				 b = 3;
				 c = 4;
			}
			
			if(tm1 == 16)
			{
				 a = 2;
				 b = 4;
				 c = 4;
			}
			if(tm1 == 17)
			{
				 a = 3;
				 b = 3;
				 c = 3;
			}
			
			if(tm1 == 18)
			{
				 a = 3;
				 b = 3;
				 c = 4;
			}
			if(tm1 == 19)
			{
				 a = 3;
				 b = 4;
				 c = 4;
			}
			
			if(tm1 == 20)
			{
				 a = 4;
				 b = 4;
				 c = 4;
			}
			
			//----------------------------------------------------------------------------------
			
			if(tm2 == 1)
			{
				 a1 = 1;
				 b1 = 1;
				 c1 = 1;
			}
			
			if(tm2 == 2)
			{
				 a1 = 1;
				 b1 = 1;
				 c1 = 2;
			}
			if(tm2 == 3)
			{
				 a1 = 1;
				 b1 = 1;
				 c1 = 3;
			}
			
			if(tm2 == 4)
			{
				 a1 = 1;
				 b1 = 1;
				 c1 = 4;
			}
			if(tm2 == 5)
			{
				 a1 = 1;
				 b1 = 2;
				 c1 = 2;
			}
			
			if(tm2 == 6)
			{
				 a1 = 1;
				 b1 = 2;
				 c1 = 3;
			}
			if(tm2 == 7)
			{
				 a1 = 1;
				 b1 = 2;
				 c1 = 4;
			}
			
			if(tm2 == 8)
			{
				 a1 = 1;
				 b1 = 3;
				 c1 = 3;
			}
			if(tm2 == 9)
			{
				 a1 = 1;
				 b1 = 3;
				 c1 = 4;
			}
			
			if(tm2 == 10)
			{
				 a1 = 1;
				 b1 = 4;
				 c1 = 4;
			}
			if(tm2 == 11)
			{
				 a1 = 2;
				 b1 = 2;
				 c1 = 2;
			}
			
			if(tm2 == 12)
			{
				 a1 = 2;
				 b1 = 2;
				 c1 = 3;
			}
			if(tm2 == 13)
			{
				 a1 = 2;
				 b1 = 2;
				 c1 = 4;
			}
			
			if(tm2 == 14)
			{
				 a1 = 2;
				 b1 = 3;
				 c1 = 3;
			}
			if(tm2 == 15)
			{
				 a1 = 2;
				 b1 = 3;
				 c1 = 4;
			}
			
			if(tm2 == 16)
			{
				 a1 = 2;
				 b1 = 4;
				 c1 = 4;
			}
			if(tm2 == 17)
			{
				 a1 = 3;
				 b1 = 3;
				 c1 = 3;
			}
			
			if(tm2 == 18)
			{
				 a1 = 3;
				 b1 = 3;
				 c1 = 4;
			}
			if(tm2 == 19)
			{
				 a1 = 3;
				 b1 = 4;
				 c1 = 4;
			}
			
			if(tm2 == 20)
			{
				 a1 = 4;
				 b1 = 4;
				 c1 = 4;
			}

//=================================================================================================================
			
			//Initiation Done
			
			//Ball Scoring start
			
//=================================================================================================================

			if(a==2||b==2||c==2)
			{
			System.out.println("Team 1 Bots Balls");

			System.out.println("      ");
			}
			
			if(a==2)
			{
				System.out.println("How many points by balls in a game can bot 1 get?");
				 n1 = in.nextInt();
			}
			if(b==2)
			{
				System.out.println("How many points by balls in a game can bot 2 get?");
				 n2 = in.nextInt();
			}
			
			if(c==2)
			{
				System.out.println("How many points by balls in a game can bot 3 get?");
				 n3 = in.nextInt();
			}
			System.out.println("      ");
			
			if(a1==2||b1==2||c1==2)
			{
			System.out.println("Team 2 Bots Balls");

			System.out.println("      ");
			}
			if(a1==2)
			{
				System.out.println("How many points by balls in a game can bot 1 get?");
				 n4 = in.nextInt();
			}
			
			if(b1==2)
			{
				System.out.println("How many points by balls in a game can bot 2 get?");
				 n5 = in.nextInt();
			}
			
			if(c1==2)
			{
				System.out.println("How many points by balls in a game can bot 3 get?");
				 n6 = in.nextInt();
			}
			


			
//=================================================================================================================

			//Balls scoring Done

			//Gears scoring Start

//=================================================================================================================
			
			
			if(a==1||b==1||c==1)
			{
System.out.println("Team 1 Bots");

System.out.println("      ");
			}
			if(a==1)
			{
				System.out.println("How many gears in a game can bot 1 get?");
				 x1 = in.nextInt();
			}

			if(b==1)
			{
				System.out.println("How many gears in a game can bot 2 get? ");
				 x2 = in.nextInt();
			}
			if(c==1)
			{
				System.out.println("How many gears in a game can bot 3 get? ");
				 x3 = in.nextInt();
			}
			
			if(a1==1||b1==1||c1==1)
			{
System.out.println("Team 2 Bots");

System.out.println("      ");
			}
			if(a1==1)
			{
				System.out.println("How many gears in a game can bot 1 get?");
				 x4 = in.nextInt();
			}

			if(b1==1)
			{
				System.out.println("How many gears in a game can bot 2 get? ");
				 x5 = in.nextInt();
			}
			if(c1==1)
			{
				System.out.println("How many gears in a game can bot 3 get? ");
				 x6 = in.nextInt();
			}

			int t = 120;
			
			if(a1==3)
			{
			y = t / x1;
			
			z = y + d;
			
			l1 = t / z;
			
			y = t / x2;
			}
			if(b1==3)
			{			
			z = y + d;
			
			l2 = t / z;
			
			y = t / x3;
			}
			if(c1==3)
			{
			z = y + d;
			
			l3 = t / z;
			}
			
			if(a1!=3&&b1!=3&&c1!=3)
			{
				l1 = x1;
				
				l2 = x2;
				
				l3 = x3;
			}	

			
			if(a==3)
			{
			y = t / x4;
			
			z = y + d;
			
			l4 = t / z;
			}
			if(b==3)
			{
			y = t / x5;
			
			z = y + d;
			
			l5 = t / z;
			}
			if(c==3)
			{
			y = t / x6;
			
			z = y + d;
			
			l6 = t / z;
			}
			if(a!=3&&b!=3&&c!=3)
			{
				l4 = x4;
				l5 = x5;
				l6 = x6;
			}	

			m = l1 + l2 + l3;
			
			if(m==0)
			{
			 g = 40;
			}
			
			if(m==2||m==3||m==4||m==5)
			{
				g = 80;
			}
			
			if(m==6||m==7||m==8||m==9||m==10||m==11||m==12)
			{
				g = 120;
			}
			if(m>=13)
			{
				g = 160;
			}
			
			
			
			m1 = l4 + l5 + l6;
			
			
			if(m1==0)
			{
			 g1 = 40;
			}
			
			if(m1==2||m1==3||m1==4||m1==5)
			{
				g1 = 80;
			}
			
			if(m1==6||m1==7||m1==8||m1==9||m1==10||m1==11||m1==12)
			{
				g1 = 120;
			}
			if(m1>=13)
			{
				g1 = 160;
			}
			
//=================================================================================================================
			
					//Gears scoring done
			
					//Final count Start
			
//=================================================================================================================


								 total1 += g;
								 total2 += g1;
								 total1 += n1;
								 total1 += n2;
								 total1 += n3;
								 total2 += n4;
								 total2 += n5;
								 total2 += n6;

							 System.out.println("      ");
							 
							 if(total2 > total1)
							 {
								 System.out.println("Team 2 Wins!");
							 }
							 
							 if(total1 > total2)
							 {
								 System.out.println("Team 1 Wins!");
							 }
							 
							 if(total1 == total2)
							 {
								 System.out.println("Tie");
							 }
							 System.out.println("      ");
							 
							 System.out.println("Team 1 Strategy: ");
							 
							 System.out.println("      ");
							 
							 if(a==1)
							 {
								 System.out.print("Gears, ");
							 }
								 else if(a==2)
								 {
									 System.out.print("Balls, ");
								 }
								 else if(a==3)
								 {
									 System.out.print("Defense, ");
								 }
								 else if(a==4)
								 {
									 System.out.print("Nothing, ");
								 }
							 
							 if(b==1)
							 {
								 System.out.print("Gears, ");
							 }
								 else if(b==2)
								 {
									 System.out.print("Balls, ");
								 }
								 else if(b==3)
								 {
									 System.out.print("Defense, ");
								 }
								 else if(b==4)
								 {
									 System.out.print("Nothing, ");
								 }
							 
							 if(c==1)
							 {
								 System.out.print("Gears");
							 }
								 else if(c==2)
								 {
									 System.out.print("Balls");
								 }
								 else if(c==3)
								 {
									 System.out.print("Defense");
								 }
								 else if(c==4)
								 {
									 System.out.print("Nothing");
								 }
							
							 System.out.println("      ");
						
							 System.out.println("      ");
							 
							 System.out.println("Team 1 Total: " + total1);
							 
							 System.out.println("      ");
							 
							 System.out.println("Team 2 Strategy: ");
							 
							 System.out.println("      ");
							 
							 if(a1==1)
							 {
								 System.out.print("Gears, ");
							 }
								 else if(a1==2)
								 {
									 System.out.print("Balls, ");
								 }
								 else if(a1==3)
								 {
									 System.out.print("Defense, ");
								 }
								 else if(a1==4)
								 {
									 System.out.print("Nothing, ");
								 }
							 
							 if(b1==1)
							 {
								 System.out.print("Gears, ");
							 }
								 else if(b1==2)
								 {
									 System.out.print("Balls, ");
								 }
								 else if(b1==3)
								 {
									 System.out.print("Defense, ");
								 }
								 else if(b1==4)
								 {
									 System.out.print("Nothing, ");
								 }
							 
							 if(c1==1)
							 {
								 System.out.print("Gears");
							 }
								 else if(c1==2)
								 {
									 System.out.print("Balls");
								 }
								 else if(c1==3)
								 {
									 System.out.print("Defense");
								 }
								 else if(c1==4)
								 {
									 System.out.print("Nothing");
								 }
							
							 System.out.println("      ");
							 
							 System.out.println("      ");
							 							 
							 System.out.println("Team 2 Total: " + total2);		 
			}			 
		}	
}