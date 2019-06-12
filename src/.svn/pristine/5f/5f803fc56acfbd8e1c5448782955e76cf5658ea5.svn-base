//
// ETNA PROJECT, 24/10/2018 by griol_s
// quiz
// File description:
//      [...]
//

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Quiz extends Game {

    private List<Question> questions;
    private Scanner sc = new Scanner(System.in);
    
    public Quiz(String name, Key keyCondition, Key keyReward, List<Question> listQuestion){
        super(name, keyCondition, keyReward);
        questions = new ArrayList<Question>();
        this.questions = listQuestion;
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
        System.out.println("Welcome to the quiz");
        for (int i=0;i<questions.size();i++){
            Question q = questions.get(i);
            String rep;
            q.print();
            rep = sc.nextLine();
            if (rep.equals(q.getAnswer())){
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong");
                return false;
            }
        }
        System.out.println("Win");
        sc.close();
        return true;
        
    }

    public Key reward(boolean rslt){
        if(rslt == true)
            return keyReward;
        else 
            return null;
    }
}
