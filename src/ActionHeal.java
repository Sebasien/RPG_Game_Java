//
// ETNA PROJECT, 22/10/2018 by griol_s
// ActionHeal
// File description:
//      [...]
//

public class ActionHeal implements Reaction{

    private int healPoint;

    public ActionHeal() {
    }

    public ActionHeal(int healPoint) {
        this.healPoint = healPoint;
    }

    public void action(Player player){
        player.heal(this.healPoint);
    }

    @Override
    public ReactionType getTypeReaction() {
        return ReactionType.Heal;
    }

    @Override
    public String getTextOfReaction() {

        return "Player gets health";
    }

    @Override
    public Position getPosition(){
        return null;
    }

}
