public class booleansWorking //
{

public static void main(String arg[])
{
 int X;
 int Y;
 int Z;
 
 Y = 3;
 X = 20;
 
 if (X == 20)
  Y = 0;
 	
 if (Y == 0); // booleansNotWorking.java:16: error: variable Y might not have been initialized

   Z = 8;
	
	System.out.println(Y);
	System.out.println(Z);
	}
	}