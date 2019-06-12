//
// ETNA PROJECT, 22/10/2018 by griol_s
// dress
// File description:
//      [...]
//

class Dress implements Item {

    private String name;
    private int lifePoints;
    private int defencePoints;

    public Dress() {
    }

    public Dress(int lifePoints, int defencePoints,String name) {
        this.name = name;
        this.defencePoints = defencePoints;
        this.lifePoints = lifePoints;
    }

    public void put(Player player) {
        player.getStats().addDefence(this.defencePoints);
        player.getHealthBar().addMaxPoint(this.lifePoints);
    }

    public void remove(Player player) {
        player.getStats().removeDefence(this.defencePoints);
        player.getHealthBar().removeMaxPoint(this.lifePoints);
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public String getName() {
        return this.name;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }
}
