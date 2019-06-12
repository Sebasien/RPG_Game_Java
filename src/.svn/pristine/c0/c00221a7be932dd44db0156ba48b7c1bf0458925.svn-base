//
// ETNA PROJECT, 27/10/2018 by griol_s
// hangman
// File description:
//      [...]
//

import java.util.Scanner;

public class Hangman extends Game {

    private Scanner s;

    public Hangman(String name, Key keyCondition, Key keyReward){
        super (name, keyCondition, keyReward);
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

    public boolean canPlay(Key k){
        if (k != keyCondition){
            return false;
        }
        else
            return true;
    }

    public void print(String a, String b, String c){
        System.out.print(a);
        if (b == null)
            System.out.print("_");
        else
            System.out.print(b);
        if (c == null)
            System.out.println("_");
        else
            System.out.println(c);
    }
    
    public boolean play(Key k,String input){
        if (canPlay(k) == false){
            System.out.println("Key required");
            return false;
        }

        System.out.print("\033[H\033[2J");
        System.out.println("Welcome to the hangman  game!");
        System.out.println("Vous possÃ©dez 10 essaie pour trouver le mot mystÃ¨re. Good luck !");
        int i=1;
        String a = "N";
        String b = null;
        String c = null;
        print(a, b, c);
        while (i < 10){
            String tmp = s.nextLine();
            if (tmp.equals("I") || tmp.equals("i"))
                b = "i";
            else if (tmp.equals("D") || tmp.equals("d"))
                c = "d";
            else
                i++;
            print(a, b, c);
            if (b != null && c != null){
                System.out.println("Victoire");
                return true;
            }
        }
        System.out.println("Perdu");
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

