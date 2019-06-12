//
// ETNA PROJECT, 24/10/2018 by griol_s
// game
// File description:
//      [...]
//

abstract class Game {

    protected String name;
    protected Key keyCondition;
    protected Key keyReward;

    public Game(String name, Key keyCondition, Key keyReward){
        this.name = name;
        this.keyCondition = keyCondition;
        this.keyReward = keyReward;
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

    public abstract boolean play(Key k,String input);
    public abstract boolean canPlay(Key k);
    public abstract Key reward(boolean rslt);
}
