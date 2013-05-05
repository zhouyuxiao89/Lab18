import java.util.Scanner;
public class Dice {
  static int RollCount1 = 0;
  static int RollCount2 = 0;
  public static int RollDice1(int DiceNumber,int Max)
  {
      int dice;
      dice = 1 + (int)(Math.random()*Max*DiceNumber);
      RollCount1 ++;
      return dice;  
  }
  
  public int RollDice2(int DiceNumber,int Max)
  {
      int dice;
      dice = 1 + (int)(Math.random()*Max*DiceNumber);
      RollCount2 ++;
      return dice;	
  }
  public int getCount1()
  {
      return RollCount1;
  }
  
  public int getCount2()
  {
	  return RollCount2; 
  }
  
  public static int Roll_1_Dice()
  {
      int computerNum;
      computerNum = 1 + (int)(Math.random()*6);
      RollCount1 ++;
      return computerNum;
  }
}
