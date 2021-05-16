//Coded By ~Hritvik~
import java.io.*;
import java.util.Scanner;
class Snakes_And_Ladders_By_Hritvik
{
    static Scanner scan = new Scanner(System.in);
    static int n1,count;
    static String player;
    public static void getName()                                                        //Used To Get Player Name
    {
        System.out.print("\tEnter Your Name: ");
        player = scan.nextLine();
        System.out.println("\n\t\t\t\t\t\t\t\t\t" + player + " v/s Computer\n");
    }
    public static void instructions()                                                    //Used To Print Instructions At Startup
    {
        System.out.println ("\n\n");
        System.out.println ("\t\t\t\t\t\t\t\tWelcome To Snakes And Ladders");
        System.out.println ("\t\t\t\t\t\t\t\t     ~By Hritvik Maini\n\n");
        System.out.println ("\t\t\t\t\t\t\t\t\tInstructions:");
        System.out.println ("\t\t\t\t\t\t\tThis Program Is A Regular Snakes & Ladders Game.");
        System.out.println ("\t\t\t\t\t\tRules Are Same, As Player Is Unlocked When There Is '6' On The Dice.");
        System.out.println ("\t\t\t\t\t\t\t\tAnd You Are Playing Against Computer.");
        System.out.println ("\t\t\t\t\t  You And The Computer Start At Square 1, And The First One To Reach Square 100(+1) Wins.");
        System.out.println ("\t\t\t\t\t\t     There Are Certain Snakes And Ladders Already Defined On Board.");
        System.out.println ("\t\t\t\t\t\t\t\t\tSo, Let's PLAY!!!");
    }
    public static void board_display()                                                      //Used To Display Game Board
    {
        System.out.println("\n");
        System.out.println ("     -----------------------------------------------------------------------Game Board---------------------------------------------------------------------------");
        int counter,iteration;
        counter = 100;
        iteration = -1;
        while (counter>0)
        {
            if(counter%10==0 && counter!=100)
            {
                if(iteration==-1)
                {
                    counter = counter-9;
                    iteration = 1;
                }
                else
                {
                    System.out.print("\t" + counter + "\t");
                    counter = counter-10;
                    iteration = -1;
                }
                if(counter!=0)
                {
                    System.out.print("\n\n\t" + counter + "\t");
                }
            }
            else
            {
                System.out.print("\t" + counter + "\t");
            }
            counter = counter+iteration;
        }
        System.out.println();
        System.out.println ("    -------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
    public static void main (String args[]) throws IOException
    {                                                                                           //Main Func() Of Game
        Scanner myInput2 = new Scanner(System.in);
        instructions();
        board_display();
        getName();
        String sGame = "y";
        System.out.print ("\tPlayer's Turn, Press y To Roll Dice: ");
        sGame = myInput2.nextLine();
        System.out.print ("\n\n\n\n\n\n");
        while (sGame.equals ("y") || sGame.equals ("Y"))
        {
            sGame = startGame(sGame);
        }
        System.out.println ("\t\t\t\t\t\t\t          Thnx For Playing Snakes & Ladder");
        System.out.println ("\t\t\t\t\t\t\t                  Made By ~Hritvik");
        System.out.println ("\t\t\t\t\t\t\t               Submitted To: Manik Sir");
        System.out.println ("\t\t\t\t\t\t\t                 Build Using VS Code");   
    }
  
    public static String startGame (String start) throws IOException
    {                                                                              //This Function Is BRAIN Of Game
        char stat_lock_player,stat_lock_comp,temp,temp_1;
        stat_lock_player = 'l';
        stat_lock_comp = 'l';
        temp = 'l';
        temp_1 = 'l';
        Scanner myInput = new Scanner(System.in);
        int userPosition = 1;
        int compPosition = 1;
        int diceRoll = 0;
        int userRoll = 1;
        int compRoll = 1;
        String playAgain = "y";
        
        int snakesLaddersArray [] = new int [15];
        snakesLaddersArray [0] = 40;
        snakesLaddersArray [1] = 27;
        snakesLaddersArray [2] = 43;
        snakesLaddersArray [3] = 99;
        snakesLaddersArray [4] = 54;
        snakesLaddersArray [5] = 89;
        snakesLaddersArray [6] = 66;
        snakesLaddersArray [7] = 76;
        snakesLaddersArray [8] = 4;
        snakesLaddersArray [9] = 13;
        snakesLaddersArray [10] = 33;
        snakesLaddersArray [11] = 42;
        snakesLaddersArray [12] = 50;
        snakesLaddersArray [13] = 62;
        snakesLaddersArray [14] = 74;
        
        while (playAgain.equals ("y") || playAgain.equals ("Y"))
        {
            System.out.println ("    -------------------------------------------------------------------------------------------------------------------------------------------------------------");
            userRoll =  getDice(diceRoll);
            if(n1<=5 && stat_lock_player=='l')
            {
                System.out.println("\t\t\t\t\t\t\t\t      " + player + " Is Locked");
                userRoll=0;
            }
            else if(n1==6 && temp=='l')
            {
                System.out.println("\t\t\t\t\t\t\t\t      " + player + " Is Unlocked");
                userRoll = userRoll-6;
                stat_lock_player = 'u';
                temp = 'u';
            }
            else
            {
                System.out.println("\t\t\t\t\t\t\t\t\t   " + player);
                stat_lock_player = 'u';
            }
            compRoll =  getDice(diceRoll);
            if(n1<=5 && stat_lock_comp=='l')
            {
                System.out.println("\t\t\t\t\t\t\t\t      Computer Is Locked");
                compRoll=0;
            }
            else if(n1==6 && temp_1=='l')
            {
                System.out.println("\t\t\t\t\t\t\t\t      Computer Is Unlocked");
                compRoll = compRoll-6;
                stat_lock_comp = 'u';
                temp_1 = 'u';
            }
            else
            {
                System.out.println("\t\t\t\t\t\t\t\t\t   Computer");
                stat_lock_comp = 'u';
            }
            System.out.println ("\n\t\t\t\t\t\t\t-----------------------------------------------");
            System.out.println ("\t\t\t\t\t\t\t  Total Value Of Dice Rolled By " + player + " Is " + userRoll + "\t\t");
            System.out.println ("\t\t\t\t\t\t\t  Total Value Of Dice Rolled By Computer Is " + compRoll + "\t");
            System.out.println ("\t\t\t\t\t\t\t-----------------------------------------------\n");

            userPosition = userPosition + userRoll;
            compPosition = compPosition + compRoll;
            
            userPosition = getP(userPosition, userRoll, snakesLaddersArray);
            compPosition = compgetP(compPosition, compRoll, snakesLaddersArray, userPosition);
            
            System.out.println("\n\t\t\t\t\t\t\t**************************************************");
            System.out.println ("\t\t\t\t\t\t\t\t" + player + " Is Currently On Square " + userPosition + "\t\t\t");
            System.out.println ("\t\t\t\t\t\t\t\tComputer Is Currently On Square " + compPosition + "\t\t");
            System.out.println("\t\t\t\t\t\t\t**************************************************");
            System.out.println ("    -------------------------------------------------------------------------------------------------------------------------------------------------------------");
            
            if (userPosition == 100 || compPosition == 100)
            {
                userPosition = 1;
                compPosition = 1;
                System.out.print ("\tPlayer's Turn, Press y To Roll Dice: ");
                playAgain = myInput.nextLine ();
                System.out.print ("\n\n\n\n\n\n\n\n\n\n\n\n");
            }
            else
            {
                System.out.print ("\tPlayer's Turn, Press y To Roll Dice: ");
                playAgain = myInput.nextLine ();
            }
        }
        return playAgain;
    }
    static int dice_roll()
    {
        int range,min,max,rand;
        min = 1;
        max = 6;
        range = max-min+1;
        rand = (int)(Math.random()*range)+min;
        return rand;
    }
    static int getDice(int diceroll)
    {
        int t_dice,n2,n3;
        n1 = dice_roll();
        System.out.print("\t\t\t\t\t\t\t\t\t   _______\n\n"+"\t\t\t\t\t\t\t\t\t   |  "+n1+"  |"+"\n\t\t\t\t\t\t\t\t\t   _______\n\n");
        if(n1==6)
        {
            n2 = dice_roll();
            System.out.print("\t\t\t\t\t\t\t\t\t   _______\n\n"+"\t\t\t\t\t\t\t\t\t   |  "+n2+"  |"+"\n\t\t\t\t\t\t\t\t\t   _______\n\n");
            if(n2==6)
            {
                n3 = dice_roll();
                System.out.print("\t\t\t\t\t\t\t\t\t   _______\n\n"+"\t\t\t\t\t\t\t\t\t   |  "+n3+"  |"+"\n\t\t\t\t\t\t\t\t\t   _______\n\n");
                if(n3==6)
                {
                    t_dice = 0;
                }
                else
                {
                    t_dice = 6+6+n3;
                }
            }
            else
            {
                t_dice = 6+n2;
            }
        }
        else
        {
            t_dice = n1;
        }
        return t_dice;
    }

    public static int getP (int userPosition, int userRoll, int snakesLaddersArray []) throws IOException
    {
        if(userPosition == snakesLaddersArray[0])
        {
            userPosition = 3;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 3~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[1])
        {
            userPosition = 5; 
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 5~~~~~~~~~~~~~");
            
        }
        else if (userPosition == snakesLaddersArray[2])
        {
            userPosition = 18;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 18~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[3])
        {
            userPosition = 41;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 41~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[4])
        {
            userPosition = 31;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 31~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[5])
        {
            userPosition = 53;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 53~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[6])
        {
            userPosition = 45;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 45~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[7])
        {
            userPosition = 58;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Player Got Bit By A Snake, Go To 58~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[8])
        {
            userPosition = 25;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Player Got A Ladder!! Go To 25~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[9])
        {
            userPosition = 46;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Player Got A Ladder!! Go To 46~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[10])
        {
            userPosition = 49;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Playet Got A Ladder!! Go To 49~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[11])
        {
            userPosition = 63;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Player Got A Ladder!! Go To 63~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[12])
        {
            userPosition = 69;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Player Got A Ladder!! Go To 69~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[13])
        {
            userPosition = 81; 
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Player Got A Ladder!! Go To 81~~~~~~~~~~~~~");
        }
        else if (userPosition == snakesLaddersArray[14])
        {
            userPosition = 92;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Player Got A Ladder!! Go To 92~~~~~~~~~~~~~");
        }
        
        if (userPosition < 0 || userPosition > 112)
        {
            System.out.println ("\tAn Error Has Occured Please Restart The Game!!");
        }
        
        else if (userPosition > 100)
        {
            userPosition = userPosition - userRoll;
            System.out.println ("\tThe Player Can't Jump!! He Must Land On 100");
            
        }
        else if (userPosition == 100)
        {
            System.out.println ("\tCONGRALUATIONS " + player + " WINS!!!!");
            
        }        
        return userPosition;
    }
    
    public static int compgetP (int compPosition, int compRoll, int snakesLaddersArray [], int userPosition) throws IOException
    {
        if(compPosition == snakesLaddersArray[0])
        {
            compPosition = 3;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 3~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[1])
        {
            compPosition = 5;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 5~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[2])
        {
            compPosition = 18;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 18~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[3])
        {
            compPosition = 41;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 41~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[4])
        {
            compPosition = 31;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 31~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[5])
        {
            compPosition = 53;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~COmputer Got Bit By A Snake, Go To 53~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[6])
        {
            compPosition = 45;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 45~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[7])
        {
            compPosition = 58;
            System.out.println ("\t\t\t\t\t\t  ~~~~~~~~~~~~~Computer Got Bit By A Snake, Go To 58~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[8])
        {
            compPosition = 25;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 25~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[9])
        {
            compPosition = 46;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 46~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[10])
        {
            compPosition = 49;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 49~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[11])
        {
            compPosition = 63;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 63~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[12])
        {
            compPosition = 69;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 69~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[13])
        {
            compPosition = 81;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 81~~~~~~~~~~~~~");
        }
        else if (compPosition == snakesLaddersArray[14])
        {
            userPosition = 92;
            System.out.println ("\t\t\t\t\t\t     ~~~~~~~~~~~~~Computer Got A Ladder!! Go To 92~~~~~~~~~~~~~");
        }

        if (compPosition < 0 || compPosition > 112)
        {
            System.out.println ("\tAn Error Has Occured Please Restart The Game!!");
        }
        
        else if (compPosition > 100)
        {
            compPosition = compPosition - compRoll;
            System.out.println ("\tThe Computer Can't Jump!! He Must Land On 100");
            
        }
        else if (compPosition == 100 && userPosition != 100)
        {
            System.out.println ("\tTHE COMPUTER WON, YOU FAILED, BETTER LUCK NEXT TIME!!!");
            
        }
        return compPosition;
    }
}