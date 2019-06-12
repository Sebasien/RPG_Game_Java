//
// ETNA PROJECT, 25/10/2018 by griol_s
// drop
// File description:
//      [...]
//

public class ActionDrop implements Reaction{

    private Position position;
    private Weapon w;
    private Boots b;
    private Dress d;
    private Hat h;

    public ActionDrop() {
    }

    public ActionDrop(Position position, Weapon item) {
        this.w = item;
        this.position = position;
    }

    public ActionDrop(Position position, Boots item) {
        this.b = item;
        this.position = position;
    }

    public ActionDrop(Position position, Hat item) {
        this.h = item;
        this.position = position;
    }

    public ActionDrop(Position position, Dress item) {
        this.d = item;
        this.position = position;
    }

    public void action(Player player) {
        if(b != null){
            System.out.println("Vous avez récupérer " + b.getName() + "!");
            player.putBoots(b);
        }
        else if (d != null){
            System.out.println("Vous avez récupérer " + d.getName() + "!");
            player.putDress(d);
        }
        else if (h != null){
            System.out.println("Vous avez récupérer " + h.getName() + "!");
            player.putHat(h);
        }
        else if (w != null){
            System.out.println("Vous avez récupérer " + w.getName() + "!");
            player.putWeapon(w);
        }
    }

        @Override
        public ReactionType getTypeReaction() {
            return null;
        }

        @Override
        public String getTextOfReaction() {
            return "Player drop an item";
        }

        public Position getPosition(){
            return position;
        }
}
