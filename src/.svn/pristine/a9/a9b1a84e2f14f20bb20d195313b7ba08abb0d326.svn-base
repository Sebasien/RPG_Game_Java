//
// ETNA PROJECT, 19/10/2018 by griol_s
// world
// File description:
//      [...]
//

import java.util.ArrayList;
import java.util.List;

class Area {

    private Cell[][] area;
    private String name;
    
    public Area(int width, int height, String name) {
        this.area = new Cell[width][height];
        this.name=name;
    }

    public Area(Cell[][] area, String name){
        this.area=area;
        this.name=name;
    }

    public void registerTangibleAt(int row, int column, Tangible tangible) {
        area[row][column].addTangible(tangible);
    }

    public void registerCellAt(int row, int column,Cell cell) {
        area[row][column] = cell;
    }

    public void registerReactionAt(int row, int column, Reaction reaction) {
        area[row][column].addReaction(reaction);
    }

    public void print(){
        for(int i=0; i<area.length; i++) {
            for(int j=0; j<area[i].length; j++){
                System.out.print(area[j][i].showAs());
                
            }
            System.out.println();
        }
    }

    public Cell[][] getArea(){
        return this.area;
    }

    public void setArea(Cell[][] area){
        this.area=area;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}
