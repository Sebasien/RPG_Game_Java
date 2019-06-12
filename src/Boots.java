//
// ETNA PROJECT, 22/10/2018 by griol_s
// boots
// File description:
//      [...]
//

class Boots implements Item {

    private String name;
    private int lifePoints;
    private int attackPoints;

    public Boots() {
    }

    public Boots(int lifePoints, int attackPoints,String name) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.lifePoints = lifePoints;
    }

    public void put(Player player) {
        player.getStats().addAttack(this.attackPoints);
        player.getHealthBar().addMaxPoint(this.lifePoints);
    }

    public void remove(Player player) {
        player.getStats().removeAttack(this.attackPoints);
        player.getHealthBar().removeMaxPoint(this.lifePoints);
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
    
    public String getName() {
        return this.name;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }
}

    
