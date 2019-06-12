
//
// ETNA PROJECT, 24/10/2018 by griol_s
// PlusMinusGame
// File description:
//      [...]
//

import java.util.Scanner;

public class PlusMinusGame extends Game {

    private int findValue;
    private Scanner s;
    
    public PlusMinusGame(String name, Key keyCondition, Key keyReward, int findValue){
        super (name, keyCondition, keyReward);
        this.findValue = findValue;
        s = new Scanner(System.in);
    }

    public String getName(){
        return name;
    }

    public Key getKeyCondition(){
        return keyCondition;
    }

    public Key getKeyReward(){
        return keyReward;
    }

    public int getfindValue(){
        return findValue;
    }

    public boolean canPlay(Key k){
        if (k != keyCondition){
            return false;
        }
        else
            return true;
    }

    public boolean play(Key k,String input){
        if (canPlay(k) == false){
            System.out.println("Key required");
            return false;
        }

        System.out.print("\033[H\033[2J");
        System.out.println("Welcome to the " + getName() + " game!");
        System.out.println("Vous possédez 10 essaie pour trouver le chiffre mystère. Good luck !");
        int i=1;
        while ( i < 10){
            int tmp = Integer.parseInt(s.nextLine());
            if (tmp == findValue){
                System.out.println("Win");
                //s.close();
                return true;
            }
            if (tmp > findValue){
                System.out.println("Minus");
            }
            if (tmp < findValue){
                System.out.println("Plus");
            }
            if (i == 5)
                System.out.println(input);
            i++;
        }
        System.out.println("Lose");
        return false;
    }

    @Override
    public Key reward(boolean rslt){
        if (rslt == true)
            return keyReward;
        else
            return null;
    }
    
}
