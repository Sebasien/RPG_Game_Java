
//
// ETNA PROJECT, 23/10/2018 by griol_s
// world
// File description:
//      [...]
//

import java.util.List;
import java.util.ArrayList;

class World {

    private Key kWin = new Key("Victoire");

    private List<Area> areas;

    public World(Area area) {
        this.areas = new ArrayList<Area>();
        this.areas.add(area);
    }

    public World(List<Area> areas) {
        this.areas = areas;
    }

    public void addArea(Area area){
        this.areas.add(area);
    }

    public void print(){
        for(int i=0; i<areas.size(); i++){
            System.out.println(areas.get(i).getName());
            areas.get(i).print();
            System.out.println();
        }
    }

    public void playerMap(Player p){
        System.out.println(this.getAreaByName(p.getPosition().getCurrentMap()).getName());
        this.getAreaByName(p.getPosition().getCurrentMap()).print();
        System.out.println();
    }

    public Area getAreaByName(String name){
        for(int i=0; i<areas.size(); i++){
            if (areas.get(i).getName() == name)
                return areas.get(i);
        }
        return null;
    }

    public Area getCurrentArea(String name){
        return getAreaByName(name);
    }
    
}
