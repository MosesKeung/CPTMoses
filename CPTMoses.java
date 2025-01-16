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
		String strLinearAnswer1;
		String strLinearAnswer2;
		String strLinearAnswer3;
		String strQuadraticsQuestion;
		String strQuadraticsAnswer1;
		String strQuadraticsAnswer2;
		String strQuadraticsAnswer3;
		String strTrigsQuestion;
		String strTrigsAnswer1;
		String strTrigsAnswer2;
		String strTrigsAnswer3;
		String strShapesQuestion;
		String strShapesAnswer1;
		String strShapesAnswer2;
		String strShapesAnswer3;
		String strStart;
		double dblScore;
		String strAnswer;
		String strContinue;
		
		//Arrays
		String strLinearQuestions[][] = new String[999][5];
		String strQuadraticsQuestions[][] = new String[999][5];
		String strTrigsQuestions[][] = new String[999][5];
		String strShapesQuestions[][] = new String[999][5];
		
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
									strLinearAnswer1 = Linear.readLine();
									strLinearAnswer2 = Linear.readLine();
									strLinearAnswer3 = Linear.readLine();
									strLinearQuestions[0][0] = (strLinearQuestion);
									strLinearQuestions[0][1] = (strLinearAnswer1);
									strLinearQuestions[0][2] = (strLinearAnswer2);
									strLinearQuestions[0][3] = (strLinearAnswer3);
									strLinearQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
									con.println(strLinearQuestions[0][0]);
									con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
									strAnswer = con.readLine();
									if(strAnswer.equalsIgnoreCase(strLinearAnswer1) || strAnswer.equalsIgnoreCase(strLinearAnswer2) || strAnswer.equalsIgnoreCase(strLinearAnswer3)){
										dblScore += 100;
										con.println("Congratulations, You Picked The Right Answer! +100 points");
										con.println("Press C and Enter Key To Proceed To The Next Question. ");
										strContinue = con.readLine();
										if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
											con.clear();
											con.println(strName);
											con.println(strChoice);
											con.println("Score: "+(dblScore));
										}
									}else{
										con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
										con.println("Press C and Enter Key To Proceed To The Next Question. ");
										strContinue = con.readLine();
										if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
											con.clear();
											con.println(strName);
											con.println(strChoice);
											con.println("Score: "+(dblScore));
										}
									}
						}
						con.println("Congratulations, You Have Finished The Linear Tests. ");
						con.println(strName+", Your Score Is "+dblScore);
						HighScore.println("Player Name: "+strName);
						HighScore.println("Score: "+dblScore);
						HighScore.println("Test: Linear");
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
						while(Linear.eof() == false){
							strQuadraticsQuestion = Quadratics.readLine();
							strQuadraticsAnswer1 = Quadratics.readLine();
							strQuadraticsAnswer2 = Quadratics.readLine();
							strQuadraticsAnswer3 = Quadratics.readLine();
							strQuadraticsQuestions[0][0] = (strQuadraticsQuestion);
							strQuadraticsQuestions[0][1] = (strQuadraticsAnswer1);
							strQuadraticsQuestions[0][2] = (strQuadraticsAnswer2);
							strQuadraticsQuestions[0][3] = (strQuadraticsAnswer3);
							strQuadraticsQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
							con.println(strQuadraticsQuestions[0][0]);
							con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
							strAnswer = con.readLine();
							if(strAnswer.equalsIgnoreCase(strQuadraticsAnswer1) || strAnswer.equalsIgnoreCase(strQuadraticsAnswer2) || strAnswer.equalsIgnoreCase(strQuadraticsAnswer3)){
								dblScore += 100;
								con.println("Congratulations, You Picked The Right Answer! +100 points");
								con.println("Press C and Enter Key To Proceed To The Next Question. ");
								strContinue = con.readLine();
								if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
									con.clear();
									con.println(strName);
									con.println(strChoice);
									con.println("Score: "+(dblScore));
								}
							}else{
								con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
								con.println("Press C and Enter Key To Proceed To The Next Question. ");
								strContinue = con.readLine();
								if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
									con.clear();
									con.println(strName);
									con.println(strChoice);
									con.println("Score: "+(dblScore));
								}
							}
						}
						con.println("Congratulations, You Have Finished The Linear Tests. ");
						con.println(strName+", Your Score Is "+dblScore);
						HighScore.println("Player Name: "+strName);
						HighScore.println("Score: "+dblScore);
						HighScore.println("Test: Linear");
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
						while(Trigs.eof() == false){
							strTrigsQuestion = Trigs.readLine();
							strTrigsAnswer1 = Trigs.readLine();
							strTrigsAnswer2 = Trigs.readLine();
							strTrigsAnswer3 = Trigs.readLine();
							strTrigsQuestions[0][0] = (strTrigsQuestion);
							strTrigsQuestions[0][1] = (strTrigsAnswer1);
							strTrigsQuestions[0][2] = (strTrigsAnswer2);
							strTrigsQuestions[0][3] = (strTrigsAnswer3);
							strTrigsQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
							con.println(strTrigsQuestions[0][0]);
							con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
							strAnswer = con.readLine();
							if(strAnswer.equalsIgnoreCase(strTrigsAnswer1) || strAnswer.equalsIgnoreCase(strTrigsAnswer2) || strAnswer.equalsIgnoreCase(strTrigsAnswer3)){
								dblScore += 100;
								con.println("Congratulations, You Picked The Right Answer! +100 points");
								con.println("Press C and Enter Key To Proceed To The Next Question. ");
								strContinue = con.readLine();
								if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
									con.clear();
									con.println(strName);
									con.println(strChoice);
									con.println("Score: "+(dblScore));
								}
							}else{
								con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
								con.println("Press C and Enter Key To Proceed To The Next Question. ");
								strContinue = con.readLine();
								if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
									con.clear();
									con.println(strName);
									con.println(strChoice);
									con.println("Score: "+(dblScore));
								}
							}
						}
						con.println("Congratulations, You Have Finished The Linear Tests. ");
						con.println(strName+", Your Score Is "+dblScore);
						HighScore.println("Player Name: "+strName);
						HighScore.println("Score: "+dblScore);
						HighScore.println("Test: Linear");
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
						while(Shapes.eof() == false){
							strShapesQuestion = Shapes.readLine();
							strShapesAnswer1 = Shapes.readLine();
							strShapesAnswer2 = Shapes.readLine();
							strShapesAnswer3 = Shapes.readLine();
							strShapesQuestions[0][0] = (strShapesQuestion);
							strShapesQuestions[0][1] = (strShapesAnswer1);
							strShapesQuestions[0][2] = (strShapesAnswer2);
							strShapesQuestions[0][3] = (strShapesAnswer3);
							strShapesQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
							con.println(strShapesQuestions[0][0]);
							con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
							strAnswer = con.readLine();
							if(strAnswer.equalsIgnoreCase(strShapesAnswer1) || strAnswer.equalsIgnoreCase(strShapesAnswer2) || strAnswer.equalsIgnoreCase(strShapesAnswer3)){
								dblScore += 100;
								con.println("Congratulations, You Picked The Right Answer! +100 points");
								con.println("Press C and Enter Key To Proceed To The Next Question. ");
								strContinue = con.readLine();
								if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
									con.clear();
									con.println(strName);
									con.println(strChoice);
									con.println("Score: "+(dblScore));
								}
							}else{
								con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
								con.println("Press C and Enter Key To Proceed To The Next Question. ");
								strContinue = con.readLine();
								if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
									con.clear();
									con.println(strName);
									con.println(strChoice);
									con.println("Score: "+(dblScore));
								}
							}
						}
						con.println("Congratulations, You Have Finished The Linear Tests. ");
						con.println(strName+", Your Score Is "+dblScore);
						HighScore.println("Player Name: "+strName);
						HighScore.println("Score: "+dblScore);
						HighScore.println("Test: Linear");
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
