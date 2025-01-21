import arc.*;
import java.awt.*;
import java.awt.image.*;

public class CPTMoses{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		
		//Background Image
		BufferedImage imgMath = con.loadImage("math.jpg");
		con.drawImage(imgMath,0,0);
		
		//Print Game Title
		con.println("Math Training Game");
		con.println("");
		
		//Input Files
		TextInputFile Linear = new TextInputFile("linear.txt");
		TextInputFile Quadratics = new TextInputFile("quadratics.txt");
		TextInputFile Trigs = new TextInputFile("trigs.txt");
		TextInputFile Shapes = new TextInputFile("shapes.txt");
		
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
		String strQuit;
		String strHelp;
		int intCount;
		
		//Arrays
		String strLinearQuestions[][] = new String[999][5];
		String strQuadraticsQuestions[][] = new String[999][5];
		String strTrigsQuestions[][] = new String[999][5];
		String strShapesQuestions[][] = new String[999][5];
		
		//Menu
		mosestoolscpt.printMenu(con);
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
			//Linear Tests
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
						
						//Read Questions & Answers
						strLinearQuestion = Linear.readLine();
						strLinearAnswer1 = Linear.readLine();
						strLinearAnswer2 = Linear.readLine();
						strLinearAnswer3 = Linear.readLine();
						
						//Load Questions into Arrays
						strLinearQuestions[0][0] = (strLinearQuestion);
						strLinearQuestions[0][1] = (strLinearAnswer1);
						strLinearQuestions[0][2] = (strLinearAnswer2);
						strLinearQuestions[0][3] = (strLinearAnswer3);
						strLinearQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
						
						//Print Questions
						con.println(strLinearQuestions[0][0]);
						con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
						strAnswer = con.readLine();
						
						//If Answer is Correct
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
							
						//If Answer is Incorrect
						}else{
							con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
							con.println("The correct answer is "+strLinearAnswer1);
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
					
					//End of Game & Scores Management
					con.println("Congratulations, You Have Finished The Linear Tests. ");
					con.println(strName+", Your Score Is "+dblScore);
					TextOutputFile HighScoreOutput = new TextOutputFile ("highscore.txt", true);
					HighScoreOutput.println("Player Name: "+strName);
					HighScoreOutput.println(dblScore);
					HighScoreOutput.println("Test: Linear");
					HighScoreOutput.close();
				}
				
			//Quadratics Tests	
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
					while(Quadratics.eof() == false){
							
						//Read Questions & Answers
						strQuadraticsQuestion = Quadratics.readLine();
						strQuadraticsAnswer1 = Quadratics.readLine();
						strQuadraticsAnswer2 = Quadratics.readLine();
						strQuadraticsAnswer3 = Quadratics.readLine();
						
						//Load Questions into Arrays
						strQuadraticsQuestions[0][0] = (strQuadraticsQuestion);
						strQuadraticsQuestions[0][1] = (strQuadraticsAnswer1);
						strQuadraticsQuestions[0][2] = (strQuadraticsAnswer2);
						strQuadraticsQuestions[0][3] = (strQuadraticsAnswer3);
						strQuadraticsQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
							
						//Print Questions
						con.println(strQuadraticsQuestions[0][0]);
						con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
						strAnswer = con.readLine();
							
						//If Answer is Correct
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
							
						//If Answer is Incorrect
						}else{
							con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
							con.println("The correct answer is "+strQuadraticsAnswer1);
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
					
					//End of Game & Scores Management
					con.println("Congratulations, You Have Finished The Linear Tests. ");
					con.println(strName+", Your Score Is "+dblScore);
					TextOutputFile HighScoreOutput = new TextOutputFile ("highscore.txt", true);
					HighScoreOutput.println("Player Name: "+strName);
					HighScoreOutput.println(dblScore);
					HighScoreOutput.println("Test: Quadratics");
					HighScoreOutput.close();
				}
					
			//Trigonometry Tests
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
					con.println("Hint: a^2 + b^2 = c^2");
					while(Trigs.eof() == false){
							
						//Read Questions & Answers
						strTrigsQuestion = Trigs.readLine();
						strTrigsAnswer1 = Trigs.readLine();
						strTrigsAnswer2 = Trigs.readLine();
						strTrigsAnswer3 = Trigs.readLine();
						
						//Load Questions into Arrays
						strTrigsQuestions[0][0] = (strTrigsQuestion);
						strTrigsQuestions[0][1] = (strTrigsAnswer1);
						strTrigsQuestions[0][2] = (strTrigsAnswer2);
						strTrigsQuestions[0][3] = (strTrigsAnswer3);
						strTrigsQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
						
						//Print Questions
						con.println(strTrigsQuestions[0][0]);
						con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
						strAnswer = con.readLine();
						
						//If Answer is Correct
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
								con.println("Hint: a^2 + b^2 = c^2");
							}
						
						//If Answer is Incorrect
						}else{
							con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
							con.println("The correct answer is "+strTrigsAnswer1);
							con.println("Press C and Enter Key To Proceed To The Next Question. ");
							strContinue = con.readLine();
							if(strContinue.equalsIgnoreCase("c") || strContinue.equalsIgnoreCase("C")){
								con.clear();
								con.println(strName);
								con.println(strChoice);
								con.println("Score: "+(dblScore));
								con.println("Hint: a^2 + b^2 = c^2");
							}
						}
					}
					
					//End of Game & Scores Management
					con.println("Congratulations, You Have Finished The Linear Tests. ");
					con.println(strName+", Your Score Is "+dblScore);
					TextOutputFile HighScoreOutput = new TextOutputFile ("highscore.txt", true);
					HighScoreOutput.println("Player Name: "+strName);
					HighScoreOutput.println(dblScore);
					HighScoreOutput.println("Test: Trigonometry");
					HighScoreOutput.close();
				}
			
			//Shapes Tests
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
						
						//Read Questions & Answers
						strShapesQuestion = Shapes.readLine();
						strShapesAnswer1 = Shapes.readLine();
						strShapesAnswer2 = Shapes.readLine();
						strShapesAnswer3 = Shapes.readLine();
						
						//Load Questions into Arrays
						strShapesQuestions[0][0] = (strShapesQuestion);
						strShapesQuestions[0][1] = (strShapesAnswer1);
						strShapesQuestions[0][2] = (strShapesAnswer2);
						strShapesQuestions[0][3] = (strShapesAnswer3);
						strShapesQuestions[0][4] = (int)(Math.random() * 100 + 1) + "";
						
						//Print Questions
						con.println(strShapesQuestions[0][0]);
						con.println("Please Enter Your Answer. Then Proceed With Enter Key. ");
						strAnswer = con.readLine();
						
						//If Answer is Correct
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
							
						//If Answer is Incorrect
						}else{
							con.println("Oh no! You Picked The Wrong Answer... You Didn’t Get Any Points...");
							con.println("The correct answer is "+strShapesAnswer1);
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
					
					//End of Game & Scores Management
					con.println("Congratulations, You Have Finished The Linear Tests. ");
					con.println(strName+", Your Score Is "+dblScore);
					TextOutputFile HighScoreOutput = new TextOutputFile ("highscore.txt", true);
					HighScoreOutput.println("Player Name: " + strName);
					HighScoreOutput.println(dblScore);
					HighScoreOutput.println("Test: Shapes");
					HighScoreOutput.close();
				}
			}
				
		//Option 2 Functions
		}else if(dblChoice == 2 || dblChoice == 2.){
			con.clear();
			TextInputFile HighScoreInput = new TextInputFile("highscore.txt");
			String strHighScoreName;
			double dblHighScore;
			String strHighScoreGame;
			
			while(HighScoreInput.eof() == false){
				
				//Read High Score Data
				strHighScoreName = HighScoreInput.readLine();
				dblHighScore = HighScoreInput.readDouble();
				strHighScoreGame = HighScoreInput.readLine();
				
				//Print High Score Data
				con.println(strHighScoreName);
				con.println(dblHighScore);
				con.println(strHighScoreGame);
				con.println("");
			}
			
			//Close Text File
			HighScoreInput.close();
			
		//Option 3 Functions
		}else if(dblChoice == 3 || dblChoice == 3.){
			con.clear();
			con.println("You Quit");
			con.sleep(1000);
			System.exit(0);
		
		//Option 4 Functions
		}else if(dblChoice == 4 || dblChoice == 4.){
			
			//Clear Screen & Print Help Options
			con.clear();
			con.println("You selected Help. ");
			con.println("If Experiencing Trouble, Please Press q Then Enter Key To Exit. Then Reopen The Game. ");
			con.println("Otherwise Please Press i Then Enter Key To View Instructions. ");
			strHelp = con.readLine();
			
			//Close Game
			if(strHelp.equalsIgnoreCase("q") || strHelp.equalsIgnoreCase("Q")){
				con.clear();
				con.println("You Quit");
				con.sleep(1000);
				System.exit(0);
			
			//Access Instructions
			}else if (strHelp.equalsIgnoreCase("i") || strHelp.equalsIgnoreCase("I")){
				con.clear();
				con.println("Instructions");
				con.println("");
				con.println("Choose Play Game → Enter Name → Select 1 Available Test → Play The Game. ");
				con.println("");
				con.println("Once The Selected Test Is Completed, Your Name, Score As Well As The Test You Chose Will Be Saved. ");
				con.println("Players Can Then Access All The Saved Scores via The 'View Scores' Option On The Menu. ");
			}
		
		//Secret Menu
		}else if(dblChoice == 5){
			con.clear();
			con.setTextColor(Color.BLACK);
			BufferedImage imgRick = con.loadImage("rick.jpg");
			con.drawImage(imgRick,0,0);
			for(intCount = 0; intCount < 10; intCount++){
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
				con.sleep(3000);
				con.println("");
			}
			System.exit(0);
		}
		
		//Close Text Files
		Linear.close();
		Quadratics.close();
		Trigs.close();
		Shapes.close();
		
	}
}
