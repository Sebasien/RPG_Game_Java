//
// ETNA PROJECT, 25/10/2018 by griol_s
// actiongogame
// File description:
//      [...]
//

public class ActionGoGame implements Reaction {

    private Position position;

    public ActionGoGame() {
    }

    public ActionGoGame(Position position){
        this.position = position;
    }
    
    @Override
    public ReactionType getTypeReaction() {
        return ReactionType.ChangeMap;
    }

    @Override
    public String getTextOfReaction() {
        return null;
    }
   
    public void action(Player player){
        if (position.getCurrentMap() == "Area One")
            player.startGame(1);
        else if (position.getCurrentMap() == "Area Two")
            player.startGame(2);
        else if (position.getCurrentMap() == "Area Three")
            player.startGame(3);
        
    }
    
    public Position getPosition(){
        return position;
    }
}
