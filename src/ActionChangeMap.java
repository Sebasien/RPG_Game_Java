//
// ETNA PROJECT, 22/10/2018 by griol_s
// ActionChangeMap
// File description:
//      [...]
//


public class ActionChangeMap implements Reaction {

    private Position position;
    
    public ActionChangeMap() {
    }

    public ActionChangeMap(Position position){
        this.position = position;
    }
    
    @Override
    public ReactionType getTypeReaction() {
        return ReactionType.ChangeMap;
    }

    @Override
    public String getTextOfReaction() {
        return "Player changes map";
    }

    @Override
    public void action(Player player){
    }

    public Position getPosition(){
        return position;
    }
}
