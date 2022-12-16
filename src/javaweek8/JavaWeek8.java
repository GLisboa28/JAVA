/* Guilherme Lisboa
Assignment week 8
Dice Roller Program
 */
package javaweek8;

import java.util.Scanner;

class Die
{
private int MAX = 6;
private int faceValue;

public Die(int maxVal)
{
faceValue = maxVal;
}

public int roll()
{
faceValue = (int)(Math.random() * MAX) + 1;
return faceValue;
}
}

//Pair of dice class
class airDice
{
//Main method
public static void main(String args[])
{
//Scanner class object
Scanner reader = new Scanner(System.in);
int sides;
do
{
//Reading number of sides of a die
System.out.print("Input maximum number of sides of a die: ");
sides = reader.nextInt();
}while(sides < 4 || sides > 12);

reader.nextLine();

String play = "Y";

//If user wants to play
while(play.equalsIgnoreCase("Y"))
{
//Creating two die objects
Die d1 = new Die(sides);
Die d2 = new Die(sides);

//Getting outcomes
int out1 = d1.roll();
int out2 = d2.roll();

//Calculating sum
int sum = out1 + out2;

//Printing results
System.out.printf(" %d + %d = %d ", out1, out2, sum);

//Checking sum
if(sum == 2)
{
System.out.println("snake eyes!");
}
else if(sum == 7)
{
System.out.println("craps!");
}
else if(sum == 12)
{
System.out.println("box cars!");
}

System.out.print(" Do u want to play another game(Y/N)? ");
play = reader.nextLine();
}
reader.close();
}
}