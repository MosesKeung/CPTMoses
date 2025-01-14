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
		BufferedImage imgRick = con.loadImage("rick.jpg");
		
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
		String strChoice;
		String strLinearQuestion;
		int intLinearAnswer1;
		String strLinearAnswer2;
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
		String strStart;
		double dblScore;
		
		//Read Text Files
		while(Linear.eof() == false){
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
		con.println("Please Enter Option Number Then Press Enter Key: ");
		dblChoice = con.readDouble();
		
		//Invalid Option
		while(dblChoice != 1 && dblChoice != 1. && dblChoice != 2 && dblChoice != 2. && dblChoice != 3 && dblChoice != 3. && dblChoice != 4 && dblChoice != 4. && dblChoice != 5){
			con.println("Invalid. Please try again. ");
			dblChoice = con.readDouble();
		}
		
		//Option 1 Functions
		if(dblChoice == 1 || dblChoice == 1.){
			con.clear();
			con.println("Please Enter Your Name: ");
			strName = con.readLine();
			dblScore = (0);
			if(strName.equalsIgnoreCase ("Rokutan") || strName.equalsIgnoreCase ("Moses")){
				con.println("Congratulations "+strName+", you have entered hacker mode. You now have +100 scores");
				dblScore = (100);
			}
			con.println("Welcome, "+strName+", here are all the available tests. Please enter the option number and the Enter Key to begin: ");
			con.println("1. Linear");
			con.println("2. Quadratics");
			con.println("3. Trigonometry");
			con.println("4. Shapes");
			dblTestChoice = con.readDouble();
			while(dblTestChoice != 1 && dblTestChoice != 2 && dblTestChoice != 3 && dblTestChoice != 4){
					con.println("Invalid. Please try again. ");
					dblTestChoice = con.readDouble();
				}if(dblTestChoice == 1 || dblTestChoice == 1.){
					strChoice = ("Linear Tests");
					con.clear();
					con.println("You Have Selected Linear Tests. Please Press x & Enter Keys To Begin");
					strStart = con.readLine();
					if(strStart.equalsIgnoreCase ("x") || strStart.equalsIgnoreCase("X")){
						con.clear();
						con.println(strName);
						con.println(strChoice);
						con.println("Score: "+(dblScore));
						while(Linear.eof() == false){
							strLinearQuestion = Linear.readLine();
							intLinearAnswer1 = Linear.readInt();
							strLinearAnswer2 = Linear.readLine();
							intLinearAnswer3 = Linear.readInt();
							con.println(strLinearQuestion);
							con.println(intLinearAnswer1);
							con.println(strLinearAnswer2);
							con.println(intLinearAnswer3);
						}
					}
				}else if(dblTestChoice == 2 || dblTestChoice == 2.){
					strChoice = ("Quadratics Tests");
					con.clear();
					con.println("You Have Selected Quadratics Tests. Please Press x & Enter Keys To Begin");
					strStart = con.readLine();
					if(strStart.equalsIgnoreCase ("x") || strStart.equalsIgnoreCase("X")){
						con.clear();
						con.println(strName);
						con.println(strChoice);
						con.println("Score: "+(dblScore));
					}
				}else if(dblTestChoice == 3 || dblTestChoice == 3.){
					strChoice = ("Trigonometry Tests");
					con.clear();
					con.println("You Have Selected Trigonometry Tests. Please Press x & Enter Keys To Begin");
					strStart = con.readLine();
					if(strStart.equalsIgnoreCase ("x") || strStart.equalsIgnoreCase("X")){
						con.clear();
						con.println(strName);
						con.println(strChoice);
						con.println("Score: "+(dblScore));
					}
				}else if(dblTestChoice == 4 || dblTestChoice == 4.){
					strChoice = ("Shapes Tests");
					con.clear();
					con.println("You Have Selected Shapes Tests. Please Press x & Enter Keys To Begin");
					strStart = con.readLine();
					if(strStart.equalsIgnoreCase ("x") || strStart.equalsIgnoreCase("X")){
						con.clear();
						con.println(strName);
						con.println(strChoice);
						con.println("Score: "+(dblScore));
					}
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
			con.println("You selected Help. ");
		
		//Secret Menu
		}else if(dblChoice == 5){
			con.clear();
			con.drawImage(imgRick,0,0);
			con.println("Never Gonna Give You Up");
			con.sleep(1000);
			con.println("Never Gonna Let You Down");
			con.sleep(1000);
			con.println("Never Gonna Run Around And Desert You");
			con.sleep(1500);
			con.println("Never Gonna Make You Cry");
			con.sleep(1000);
			con.println("Never Gonna Say Goodbye");
			con.sleep(1000);
			con.println("Never Gonna Tell a Lie And Hurt You");
			con.println("");
			con.println("Haha You've Been Rickrolled. ");
		}
		
		//Close Text Files
		Linear.close();
		Quadratics.close();
		Trigs.close();
		Shapes.close();
		HighScore.close();
		
	}
}
