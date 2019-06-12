//
// ETNA PROJECT, 22/10/2018 by griol_s
// player
// File description:
//      [...]
//

import java.util.List;
import java.util.ArrayList;

public class Player implements Tangible {
    
    private String name;
    private int point;
    private HealthBar healthBar;
    private Stats stats;
    private List<Item> bag;
    private Boots boots;
    private Hat hat;
    private Dress dress;
    private Weapon weapon;
    private char symbol;
    private Position position;
    private Key kPlayer = new Key("clef du joueur");
    private Key k1 = new Key("clef jeu 1");
    private Key k2 = new Key("clef jeu 2");
    private Key k3 = new Key("clef jeu 3");
    private Key kWin = new Key("Victoire");

    public Player(String name, int point, Stats stats, HealthBar healthBar, List<Item> listItem){
        this.name = name;
        this.point = point;
        this.stats = stats;
        this.healthBar = healthBar;
        this.bag = new ArrayList<Item>();
        this.bag = listItem;
    }
    
    public Player(String name, int point, Stats stats, HealthBar healthBar, List<Item> listItem,char symbol, Position position){
        this.name = name;
        this.point = point;
        this.stats = stats;
        this.healthBar = healthBar;
        this.bag = new ArrayList<Item>();
        this.bag = listItem;
        this.symbol = symbol;
        this.position=position;
    }
    
    public void attack(Player player){
        if (this.stats.getAttack() > player.getStats().getDefence()){
            int i = stats.getAttack() - player.getStats().getDefence();
            if (i < 0){
                i = 0;
            }
            player.getHealthBar().removeCurrentPoint(i);
        }
    }
    
    public HealthBar getHealthBar() {
        return healthBar;
    }
    
    public void setHealthBar(HealthBar healthBar) {
        this.healthBar = healthBar;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPoint(int point) {
        this.point = point;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPoint() {
        return point;
    }

    public Key getKPlayer(){
        return kPlayer;
    }
    
    public void resetScore() {
        this.point = 0;
    }
    
    public void addScore(int point) {
        this.point += point;
    }

    public void removeScore(int point) {
        this.point -= point;
    }
    
    public String toString() {
        return "Name : " + name + ", Point : " + point;
    }
    
    public Stats getStats() {
        return stats;
    }

    public void removeHat() {
        this.bag.add(this.hat);
        this.hat.remove(this);
        this.hat.put(this);
    }

    public void putHat(Hat hat) {
        if (this.hat != null)
            this.removeHat();
        this.hat = hat;
        this.hat.put(this);
    }

    public void removeDress() {
        this.bag.add(this.dress);
        this.dress.remove(this);
        this.dress.put(this);
    }

    public void putDress(Dress dress) {
        if (this.dress != null)
            this.removeDress();
        this.dress = dress;
        this.dress.put(this);
    }

    public void removeBoots() {
        this.bag.add(this.boots);
        this.boots.remove(this);
        this.boots.put(this);
    }

    public void putBoots(Boots boots) {
        if (this.boots != null)
            this.removeBoots();
        this.boots = boots;
        this.boots.put(this);
    }

    public void removeWeapon() {
        this.bag.add(this.weapon);
        this.weapon.remove(this);
        this.weapon.put(this);
    }

    public void putWeapon(Weapon weapon) {
        if (this.weapon != null)
            this.removeWeapon();
        this.weapon = weapon;
        this.weapon.put(this);
    }

    public void printBag() {
        if (bag.size() == 0)
            System.out.println("Bag Empty");
        else {
            for(int i=0; i < bag.size(); i++) {
                System.out.print(i+1);
                if(bag.get(i) instanceof Hat)
                    System.out.println(" -> Hat");
                else if (bag.get(i) instanceof Boots)
                    System.out.println(" -> Boots");
                else
                    System.out.println(" -> Dress");
            }
        }
    }

    public void heal(int healPoint) {
        this.healthBar.addCurrentPoint(healPoint);
    }

    public void takeDamage(int damagePoint) {
        this.healthBar.removeCurrentPoint(damagePoint);
    }

    public void dropKey(){
        this.kPlayer = k1;
    }

    public void movePlayer(World world, Direction direction){
        int x = this.position.getX();
        int y = this.position.getY();
        Cell[][] area = world.getAreaByName(this.position.getCurrentMap()).getArea();
        if(direction == null)
            return;
        if(direction.equals(Direction.WEST) && x-1 >= 0){
            System.out.println("Player moved!");
            area[x][y].removeTangible(this);
            this.position.setX(x-1);
        }
        else if(direction.equals(Direction.EAST) && x+1 <area[y].length){
            System.out.println("Player moved!");
            area[x][y].removeTangible(this);
            this.position.setX(x+1);
        }
        else if(direction.equals(Direction.NORTH) && y-1 >= 0){
            System.out.println("Player moved!");
            area[x][y].removeTangible(this);
            this.position.setY(y-1);
        }
        else if(direction.equals(Direction.SOUTH) && y+1 < area.length){
            System.out.println("Player moved!");
            area[x][y].removeTangible(this);
            this.position.setY(y+1);
        }
        else {
            System.out.println("Player didn't move!");
            area[x][y].removeTangible(this);
        }
        x = this.position.getX();
        y = this.position.getY();
        area[x][y].addTangible(this);
        for (int i=0; i < area[x][y].getListTangible().size();i++){
            if (area[x][y].getListTangible().get(i) instanceof Acid)
                area[x][y].getListTangible().get(i).action(this);
            else if (area[x][y].getListTangible().get(i) instanceof HolyWater)
                area[x][y].getListTangible().get(i).action(this);
            else if (area[x][y].getListTangible().get(i) instanceof Chest){
                area[x][y].getListTangible().get(i).action(this);
            }
            else if (area[x][y].getListTangible().get(i) instanceof Object)
                area[x][y].removeTangible(area[x][y].getListTangible().get(i));
        }
        if (area[x][y].getListReaction().size() > 0){
            for (int i=0; i<area[x][y].getListReaction().size(); i++){
                if(area[x][y].getListReaction().get(i) instanceof ActionChangeMap){
                    area[x][y].removeTangible(this);
                    this.position = area[x][y].getListReaction().get(i).getPosition();
                    Cell[][] area2 = world.getAreaByName(area[x][y].getListReaction().get(i).getPosition().getCurrentMap()).getArea();
                    area2[area[x][y].getListReaction().get(i).getPosition().getX()][area[x][y].getListReaction().get(i).getPosition().getY()].addTangible(this);
                }
                else if (area[x][y].getListReaction().get(i) instanceof ActionDrop){
                    area[x][y].getListReaction().get(i).action(this);
                    area[x][y].removeReaction(area[x][y].getListReaction().get(i));
                }
                else                                               
                    area[x][y].getListReaction().get(i).action(this);
            }
        }
    }

    public char getSymbol(){
        return symbol;
    }

    public void setSymbol(char c){
        this.symbol = c;
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public char showAs(){
        return this.symbol;
    }

    @Override
    public void action(Player player){
    }

    public void startGame(int nb){
        if (nb == 1){
            Game g1 = new Hangman("Hangman", k1, k2);

            GameRunner gr1 = new GameRunner(kPlayer, "Indice : c'est un multiple de 5.");
            boolean result1 = gr1.playGame(g1);
            
            if (g1.reward(result1) != null)
                kPlayer = g1.reward(result1);
        }
        else if (nb == 2){
            Game g2 = new PlusMinusGame("PlusMinusGame", k2, k3, 42);

            GameRunner gr2 = new GameRunner(kPlayer, "Indice : c'est le chiffre des informaticiens.");

            boolean result2 = gr2.playGame(g2);

            if (g2.reward(result2) != null)
                kPlayer = g2.reward(result2);
        }
        else if (nb == 3){
            List<Question> listQuestion = new ArrayList<Question>();
            listQuestion.add(new Question("1+1", "1", "2", "3", "4", "2"));
            listQuestion.add(new Question("2+2", "1", "2", "3", "4", "4"));
            listQuestion.add(new Question("1+2", "1", "2", "3", "4", "3"));
            listQuestion.add(new Question("1+0", "1", "2", "3", "4", "1"));

            Game g3 = new Quiz("Question", k3, kWin, listQuestion);

            GameRunner gr3 = new GameRunner(kPlayer, "2 3 30 59");

            boolean result3 = gr3.playGame(g3);

            if (g3.reward(result3) != null)
                kPlayer = g3.reward(result3);
        }
    }
}
