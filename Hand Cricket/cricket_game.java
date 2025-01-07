import java.util.Scanner;
import java.util.Random;
public class HandCricket {

    static void out(){
        System.out.println("You have entered Number that is greater than 10 . 'so you are out'");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rm = new Random();

// DECLARATION
        
        int userScore=0;
        int userScore1=0;
        int compScore=0;
        int finalScore=0;
        int finalScore1=0;
        int compScore1=0;
        int userchoice; 
        int z;

// TOSS TIME

     do{
        System.out.println("you are user choose 0 for even and 1 for odd ");
        userchoice=sc.nextInt();
        
        if(userchoice==0){
            System.out.println("EVEN");
        }
            else if(userchoice==1){
                System.out.println("odd");
            }
            else{
                System.out.println("invalid choice");
            }
        
        System.out.println("Enter a number between 0 to 10 : ");
        int b=sc.nextInt();
        if(b<=10){
            System.out.println("number choosen by user is : "+b);
            System.out.println("Number choosen by the computer is ");
            int c= rm.nextInt(11);
            System.out.println(c);
            int sum=b+c;
            System.out.println("Sum of both number is " +sum);
            if(sum%2==0){
                System.out.println("Even");
            }
           
            else{
                System.out.println("Odd ");
        }

// USER'S TURN IN BATTING

        if (sum % 2 == 0 && userchoice == 0) {
            System.out.println("It's the USER'S TURN!");
            System.out.println("choose to bat (0) or ball (1)");
            int choice=sc.nextInt();
            if(choice==0){
                System.out.println(" you choose to bat");
                System.out.println(" round start");

                int userPick = 0;
                int compPick = 1;

                for(int round=0;userPick!=compPick;round++){
                    System.out.println("Enter Num from 1 to 10 : ");
                    userPick=sc.nextInt();
                    System.out.println("computer's choice  from 1 to 10 : ");
                    compPick=rm.nextInt(11);
                    System.out.println(compPick);

                    if (userPick > 10 || userPick < 0 ) {
                    System.out.println("You have entered number that greater than 10 . so it won't be added ");
                    }else{
                        userScore1+=userPick;
                        finalScore1=userScore1+userScore;
                        System.out.println("Your Total Score is: "+finalScore1);
                    }
                    
                    if (userPick==compPick) {
                        System.out.println("______________Your choice is equal to computer's choice so You are Out_____________");
                        System.out.println("_______________Computer's turn to bat___________");

                        System.out.println("Enter Num from 1 to 10 : ");
                        userPick=sc.nextInt();
                        System.out.println("computer's choice  from 1 to 10 : ");
                        compPick=rm.nextInt(11);
                        System.out.println(compPick);
                    
                        compScore+=compPick;
                        for( round=0;compPick!=userPick;round++){
                            
                            System.out.println("Enter Num from 1 to 10 : ");
                            userPick=sc.nextInt();
                            System.out.println("computer's choice  from 1 to 10 : ");
                            compPick=rm.nextInt(11);
                            System.out.println(compPick);
                            compScore1+=compPick;
                            finalScore=compScore+compScore1;
                                System.out.println("___________Computer's Total Score is: "+finalScore+"__________");

                                if(compPick==userPick){
                                    System.out.println("Computers choice matched the user's choice . so Computer is out");
                                    System.out.println("\n\nComputer's Score :"+finalScore);
                                    System.out.println("Your Score is :"+finalScore1);
                                    if (finalScore1>finalScore) {
                                        System.out.println("___________________USER'R WON!!!!!_____________________________");
                                    }else if(finalScore1==finalScore){
                                        System.out.println("____________YOUR MATCH WAS A DRAW( TRY AGAIN LATER!! )______________");
                                    }else{
                                        System.out.println("\n\n\t\t\t__________________COMPUTER WON!!!!!!!!!!!!!!!_________");
                                        
                                    }
                                }
                           
                        }
                        
                    }
                    
                }
               
// USER STARTS BALLING

            }else if(choice==1){
                
                System.out.println(" you choose to ball");
                int userPick = 0;
                int compPick = 1;
                for(int round=0;userPick!=compPick;round++){
                    System.out.println("Enter Num from 1 to 10 : ");
                    userPick=sc.nextInt();
                    if(userPick > 10 || userPick < 0){
                        System.out.println("You have entered number that greater than 10 . so it won't be included .  ");
                    }
                    System.out.println("computer's choice  from 1 to 10 : ");
                    compPick=rm.nextInt(11);
                    System.out.println(compPick);
                    compScore1+=compPick;
                    finalScore=compScore+compScore1;
                        System.out.println("Computer Total Score is: "+finalScore);

                    if (compPick==userPick) {
                        System.out.println("______________Your choice is equal to computer's choice so Computer is Out_____________");
                        System.out.println("\n___________________NOW IT'S USER'S TURN TO BAT________");
                        System.out.println("Enter Num from 1 to 10 : ");
                        userPick=sc.nextInt();
                        System.out.println("computer's choice  from 1 to 10 : ");
                        compPick=rm.nextInt(11);
                        System.out.println(compPick);
                        if(userPick > 10 || userPick < 0){
                            System.out.println("You have entered number that greater than 10 . so it won't be added ");
                        }else{
                            userScore+=userPick;
                        }
                        
                        for( round=0;userPick!=compPick;round++){
                            System.out.println("Enter Num from 1 to 10 : ");
                            userPick=sc.nextInt();
                            System.out.println("computer's choice  from 1 to 10 : ");
                            compPick=rm.nextInt(11);
                            System.out.println(compPick);

                            if (userPick > 10 || userPick < 0 ) {
                                System.out.println("You have entered number that greater than 10 . so it won't be added ");
                                }else{
                                    userScore1+=userPick;
                                    finalScore1=userScore1+userScore;
                                        System.out.println("Your Total Score is: "+finalScore1);
                                }

                                if(compPick==userPick){
                                    System.out.println("Computers choice matched the user's choice . so Computer is out");
                                    System.out.println("\n\nComputer's Score :"+finalScore);
                                    System.out.println("Your Score is :"+finalScore1);
                                    if (finalScore1>finalScore) {
                                        System.out.println("___________________USER'R WON!!!!!_____________________________");
                                    }else if(finalScore1==finalScore){
                                        System.out.println("____________YOUR MATCH WAS A DRAW( TRY AGAIN LATER!! )______________");
                                    }else{
                                        System.out.println("\n\n\t\t\t__________________COMPUTER WON!!!!!!!!!!!!!!!_________");
                                        
                                    }
                                }
                        }
                        
                    }
                }
            }else{
                System.out.println(" invalid choice , choose 0 or 1 only");
            }
// COMPUTER'S TURN TO BAT
        } else {
            System.out.println("It's the COMPUTER'S TURN!");
            System.out.println("choose to bat (0) or ball (1)");
            int choice=rm.nextInt(2);
            if(choice==0){
                System.out.println("________________ computer choose to bat________________");
                
                int userPick = 0;
                int compPick =1;
                for(int round=0;userPick!=compPick;round++){
                    
                    System.out.println("Enter Num from 1 to 10 : ");
                    userPick=sc.nextInt();
                    userPick = Math.min(userPick,11);
                    System.out.println("computer's choice  from 1 to 10 : ");
                    compPick=rm.nextInt(11);
                    System.out.println(compPick);
                    compScore1+=compPick;
                    finalScore=compScore+compScore1;
                        System.out.println("___________Computer's Total Score is: "+finalScore+"__________");

                    if (compPick==userPick) {
                        System.out.println("______________Computer's choice is equal to user's choice so Computer is  Out_____________");
                        
                    
                    System.out.println("_________Now User Turn to bat_________");
                    System.out.println("Enter Num from 1 to 10 : ");
                    userPick=sc.nextInt();
                    System.out.println("computer's choice  from 1 to 10 : ");
                    compPick=rm.nextInt(11);
                    System.out.println(compPick);
                    if(userPick > 10 || userPick < 0){
                        System.out.println("You have entered number that greater than 10 . so it won't be included .  ");
                    }else{
                        userScore+=userPick;
                    }
                    
                    for( round=0;userPick!=compPick;round++){
                        System.out.println("Enter Num from 1 to 10 : ");
                        userPick=sc.nextInt();
                        System.out.println("computer's choice  from 1 to 10 : ");
                        compPick=rm.nextInt(11);
                        System.out.println(compPick);

                        if (userPick > 10 || userPick < 0 ) {
                            System.out.println("You have entered number that greater than 10 . so it won't be added ");
                            }else{
                                userScore1+=userPick;
                                finalScore1=userScore1+userScore;
                                System.out.println("Your Total Score is: "+finalScore1);
                            }

                        
                            if(compPick==userPick){
                                System.out.println("Computers choice matched the user's choice . so Computer is out");
                                System.out.println("\n\nComputer's Score :"+finalScore);
                                System.out.println("Your Score is :"+finalScore1);
                                if (finalScore1>finalScore) {
                                    System.out.println("___________________USER'R WON!!!!!_____________________________");
                                }else if(finalScore1==finalScore){
                                    System.out.println("____________YOUR MATCH WAS A DRAW( TRY AGAIN LATER!! )______________");
                                }else{
                                    System.out.println("\n\n\t\t\t__________________COMPUTER WON!!!!!!!!!!!!!!!_________");
                                    
                                }
                            }
                    }

                    }

                }
// COMPUTER'S TURN TO BALL
            }else if(choice==1){
                System.out.println(" _______Computer choose to ball_______");
                System.out.println(" _____Your Turn to  bat_____");
                System.out.println(" round start");

                int userPick = 0;
                int compPick = 1;

                
                for(int round=0;userPick!=compPick;round++){
                    System.out.println("Enter Num from 1 to 10 : ");
                    userPick=sc.nextInt();
                    System.out.println("computer's choice  from 1 to 10 : ");
                    compPick=rm.nextInt(11);
                    System.out.println(compPick);

                    if (userPick > 10 || userPick < 0 ) {
                        System.out.println("You have entered number that greater than 10 . so it won't be added ");
                        }else{
                            userScore1+=userPick;
                            finalScore1=userScore1+userScore;
                            System.out.println("Your Total Score is: "+finalScore1);
                        }

                    

                    if (userPick==compPick) {
                        System.out.println("______________Your choice is equal to computer's choice so You are Out_____________");
                        System.out.println("_______________Computer's turn to bat___________");

                        System.out.println("Enter Num from 1 to 10 : ");
                        userPick=sc.nextInt();
                        if (userPick > 10 || userPick < 0 ) {
                            System.out.println("You have entered number that greater than 10 . so it won't be included .  ");
                            
                        }
                        System.out.println("computer's choice  from 1 to 10 : ");
                        compPick=rm.nextInt(11);
                        System.out.println(compPick);
                    
                        compScore+=compPick;
                        for( round=0;compPick!=userPick;round++){
                            
                            System.out.println("Enter Num from 1 to 10 : ");
                            userPick=sc.nextInt();
                            if (userPick > 10 || userPick < 0 ) {
                                System.out.println("You have entered number that greater than 10 . so it won't be included .  ");
                            }    
                            System.out.println("computer's choice  from 1 to 10 : ");
                            compPick=rm.nextInt(11);
                            System.out.println(compPick);
                            compScore1+=compPick;
                            finalScore=compScore+compScore1;
                                System.out.println("___________Computer's Total Score is: "+finalScore+"__________");

                                if(compPick==userPick){
                                    System.out.println("Computers choice matched the user's choice . so Computer is out");
                                    System.out.println("\n\nComputer's Score :"+finalScore);
                                    System.out.println("Your Score is :"+finalScore1);
                                    if (finalScore1>finalScore) {
                                        System.out.println("___________________USER'R WON!!!!!_____________________________");
                                    }else if(finalScore1==finalScore){
                                        System.out.println("____________YOUR MATCH WAS A DRAW( TRY AGAIN LATER!! )______________");
                                    }else{
                                        System.out.println("\n\n\t\t\t__________________COMPUTER WON!!!!!!!!!!!!!!!_________");
                                        
                                    }
                                }
                            
                           
                        }
                        
                    }
                }
            }
        }

        }
            else if (b<0){
                System.out.println(" invalid number");
            }
            else{
                System.out.println("invalid choice");
            }
            System.out.println("you want to play again press (1) or else press (0) to exit");  
            z=sc.nextInt();
  }
  while(z==1);
}
}
