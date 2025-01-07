import arc.*;

public class CPTMoses{
	public static void main(String[] args){
		Console con = new Console();
		
		//Input Files
		TextInputFile Linear = new TextInputFile("linear.txt");
		TextInputFile Quadratics = new TextInputFile("quadratics.txt");
		TextInputFile Trigs = new TextInputFile("trigs.txt");
		TextInputFile Shapes = new TextInputFile("shapes.txt");
		
		//Output Files
		TextOutputFile HighScore = new TextOutputFile ("highscore.txt");
		
		//Variables
		double dblChoice;
		String strName;
		double dblTestChoice;
		
		//Menu Functions
		con.println("Menu");
		con.println("1. Play Game");
		con.println("2. View Scores");
		con.println("3. Quit");
		con.println("4. Help");
		con.println("Please Enter The Option Number: ");
		dblChoice = con.readDouble();
		
		//Option 1 Functions
		if(dblChoice == 1 || dblChoice == 1.){
			con.println("Please Enter Your Name: ");
			strName = con.readLine();
			con.println("Welcome, "+strName+", here are all the available tests. Please enter the option number to begin: ");
			con.println("1. Linear");
			con.println("2. Quadratics");
			con.println("3. Trigonometry");
			con.println("4. Shapes");
			dblTestChoice = con.readDouble();
			while(dblTestChoice != 1 && dblTestChoice != 2 && dblTestChoice != 3 && dblTestChoice != 4){
					con.println("Invalid. Please try again. ");
					dblTestChoice = con.readDouble();
				}if(dblTestChoice == 1 || dblTestChoice == 1.){
					con.println("You have selected Linear Tests. ");
				}else if(dblTestChoice == 2 || dblTestChoice == 2.){
					con.println("You have selected Quadratics Tests. ");
				}else if(dblTestChoice == 3 || dblTestChoice == 3.){
					con.println("You have selected Trigonometry Tests");
				}else if(dblTestChoice == 4 || dblTestChoice == 4.){
					con.println("You have selected Shapes Tests. ");
				}
				
		//Option 2 Functions
		}else if(dblChoice == 2 || dblChoice ==2.){
			
			
		}
		
	}
}
