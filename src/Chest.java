//
// ETNA PROJECT, 19/10/2018 by griol_s
// chest
// File description:
//      [...]
//

class Chest implements Tangible {

    public Chest(){
    }
    
    public void action(Player player){
        player.dropKey();
    }
    
    public char showAs(){
        return 'C';
    }
}
