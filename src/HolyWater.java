//
// ETNA PROJECT, 22/10/2018 by griol_s
// holy water
// File description:
//      [...]
//

class HolyWater implements Tangible {

    public HolyWater(){
    }
    
    private int lifesToAdd;

    public HolyWater(int lifes) {
        this.lifesToAdd=lifes;
    }

    public void action(Player player) {
        player.heal(this.lifesToAdd);
    }

    public char showAs() {
        return 'H';
    }
}
