//
// ETNA PROJECT, 22/10/2018 by griol_s
// ActionDamage
// File description:
//      [...]
//


public class ActionDamage implements Reaction{

    private int damagePoint;

    public ActionDamage() {
    }

    public ActionDamage(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public void action(Player player) {
        player.takeDamage(this.damagePoint);
    }
    
    @Override
    public ReactionType getTypeReaction() {
        return ReactionType.Damage;
    }

    @Override
    public String getTextOfReaction() {
        return "Player takes damage";
    }

    @Override
    public Position getPosition(){
        return null;
    }
}
