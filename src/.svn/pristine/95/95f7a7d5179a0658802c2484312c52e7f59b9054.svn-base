//
// ETNA PROJECT, 26/10/2018 by griol_s
// weapon
// File description:
//      [...]
//

class Weapon implements Item {

    private String name;
    private int attackPoints;

    public Weapon() {
    }

    public Weapon(int attackPoints, String name) {
        this.name = name;
        this.attackPoints = attackPoints;
    }

    public void put(Player player) {
        player.getStats().addAttack(this.attackPoints);
    }

    public void remove(Player player) {
        player.getStats().removeAttack(this.attackPoints);
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }
}
