import arc.*;

public class CPTMoses{
	public static void main(String[] args){
		Console con = new Console();
		
		//Output Files
		
		
		//Input Files
		
		
		// Variables
		double dblChoice;
		String strName;
		
		//Menu Functions
		con.println("Menu");
		con.println("1. Play Game");
		con.println("2. View Scores");
		con.println("3. Quit");
		con.println("4. Help");
		con.println("5. Add Quiz");
		con.println("Please Enter Option Number: ");
		dblChoice = con.readDouble();
		
		
		//Options Functions
		if(dblChoice == 1 || dblChoice == 1.){
			con.println("Please Enter Your Name: ");
			strName = con.readLine();
		}else if(dblChoice == 2 || dblChoice == 2.){
			
		}
		
	}
}
