import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String R = "R";
        String P = "P";
        String S = "S";
        String playerA = "";
        String playerB = "";
        String go = "";
        boolean keepGoing = true;


        do {

            keepGoing = true;
            System.out.println("Hello welcome to Rock, Paper, Scissors.");

            // checks player one
            do {
                System.out.println("Player A enter Rock, Paper, or Scissors. [R, P, S]");

                if(scan.hasNextLine()){
                    playerA = scan.nextLine();
                    playerA = playerA.toUpperCase();
                    if(playerA.equals(R) || playerA.equals(P) || playerA.equals(S)){
                        break;
                    }
                }

                System.out.println("Sorry, you're input is invalid. Please try again.");
            } while (true);

            //checks player B
            do {
                System.out.println("Player B enter Rock, Paper, or Scissors. [R, P, S]");

                if(scan.hasNextLine()){
                    playerB = scan.nextLine();
                    playerB = playerB.toUpperCase();
                    if(playerB.equals(R) || playerB.equals(P) || playerB.equals(S)){
                        break;
                    }
                }

                System.out.println("Sorry, you're input is invalid. Please try again.");
            } while (true);

            // outputs the player one beats player two
            if(playerA.equals(R) && playerB.equals(S)){
                System.out.println("Rock Beats Scissors, Player A wins");
            }else if(playerA.equals(P) && playerB.equals(R)){
                System.out.println("Paper Beats Rock, Player A wins");
            }else if(playerA.equals(S) && playerB.equals(P)){
                System.out.println("Scissors Beats Paper, Player A wins");
            }

            if(playerB.equals(R) && playerA.equals(S)){
                System.out.println("Rock Beats Scissors, Player B wins");
            }else if(playerB.equals(P) && playerA.equals(R)){
                System.out.println("Paper Beats Rock, Player B wins");
            }else if(playerB.equals(S) && playerA.equals(P)){
                System.out.println("Scissors Beats Paper, Player B wins");
            }

            if(playerA.equals(playerB)){
                System.out.println("It's a tie! No one wins.");
            }

            // Y/N loop check
            do {
                System.out.println("would you like to continue?");
                if(scan.hasNextLine()){
                    go = scan.nextLine();
                    if(go.equalsIgnoreCase("N")){
                        break;
                    }
                    if(go.equalsIgnoreCase("Y")){
                        keepGoing = false;
                    }else{
                        System.out.println("You have entered an invalid input. Please try again");
                    }
                }
            } while (keepGoing);

            if(go.equalsIgnoreCase("N")){
                break;
            }

        } while (true);
    }
}