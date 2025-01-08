import arc.*;
import java.awt.*;
import java.awt.image.*;

public class CPTMoses{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		
		//Font Colour
		con.setTextColor(Color.BLACK);
		
		//Background Image
		BufferedImage imgMath = con.loadImage("math.jpg");
		con.drawImage(imgMath,0,0);
		
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
		int intLinearQuestion;
		int intLinearAnswer1;
		int intLinearAnswer2;
		int intLinearAnswer3;
		int intQuadraticsQuestion;
		int intQuadraticsAnswer1;
		int intQuadraticsAnswer2;
		int intQuadraticsAnswer3;
		int intTrigsQuestion;
		int intTrigsAnswer1;
		int intTrigsAnswer2;
		int intTrigsAnswer3;
		String strShapesQuestion;
		String strShapesAnswer1;
		String strShapesAnswer2;
		String strShapesAnswer3;
		
		//Read Text Files
		while(Linear.eof() == false){
			intLinearQuestion = Linear.readInt();
			intLinearAnswer1 = Linear.readInt();
			intLinearAnswer2 = Linear.readInt();
			intLinearAnswer3 = Linear.readInt();
		}while(Linear.eof() == false){
			intQuadraticsQuestion = Quadratics.readInt();
			intQuadraticsAnswer1 = Quadratics.readInt();
			intQuadraticsAnswer2 = Quadratics.readInt();
			intQuadraticsAnswer3 = Quadratics.readInt();
		}while(Trigs.eof() == false){
			intTrigsQuestion = Trigs.readInt();
			intTrigsAnswer1 = Trigs.readInt();
			intTrigsAnswer2 = Trigs.readInt();
			intTrigsAnswer3 = Trigs.readInt();
		}while(Shapes.eof() == false){
			strShapesQuestion = Shapes.readLine();
			strShapesAnswer1 = Shapes.readLine();
			strShapesAnswer2 = Shapes.readLine();
			strShapesAnswer3 = Shapes.readLine();
		}
		
		//Menu Functions
		con.println("Menu");
		con.println("1. Play Game");
		con.println("2. View Scores");
		con.println("3. Quit");
		con.println("4. Help");
		con.println("Please Enter The Option Number: ");
		dblChoice = con.readDouble();
		
		//Invalid Option
		while(dblChoice != 1 && dblChoice != 1. && dblChoice != 2 && dblChoice != 2. && dblChoice != 3 && dblChoice != 3. && dblChoice != 4 && dblChoice != 4.){
			con.println("Invalid. Please try again. ");
			dblChoice = con.readDouble();
		}
		
		//Option 1 Functions
		if(dblChoice == 1 || dblChoice == 1.){
			con.clear();
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
					con.clear();
					con.println("You have selected Linear Tests. ");
				}else if(dblTestChoice == 2 || dblTestChoice == 2.){
					con.clear();
					con.println("You have selected Quadratics Tests. ");
				}else if(dblTestChoice == 3 || dblTestChoice == 3.){
					con.clear();
					con.println("You have selected Trigonometry Tests");
				}else if(dblTestChoice == 4 || dblTestChoice == 4.){
					con.clear();
					con.println("You have selected Shapes Tests. ");
				}
				
		//Option 2 Functions
		}else if(dblChoice == 2 || dblChoice == 2.){
			con.clear();
			con.println("The high score is: ");
			con.println("The player is: ");
			
		//Option 3 Functions
		}else if(dblChoice == 3 || dblChoice == 3.){
			con.clear();
			con.println("You Quit");
		
		//Option 4 Functions
		}else if(dblChoice == 4 || dblChoice == 4.){
			con.clear();
			con.println("You selected ");
		}
		
		//Close Text Files
		Linear.close();
		Quadratics.close();
		Trigs.close();
		Shapes.close();
		HighScore.close();
		
	}
}
