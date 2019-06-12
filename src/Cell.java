//
// ETNA PROJECT, 20/10/2018 by griol_s
// cell
// File description:
//      [...]
//

import java.util.ArrayList;
import java.util.List;

class Cell {
    private List<Tangible> tangibles;
    private List<Reaction> reactions;

    public Cell(Tangible tangible) {
        this.tangibles = new ArrayList<Tangible>();
        this.reactions = new ArrayList<Reaction>();
        this.tangibles.add(tangible);
    }

    public Cell(List<Tangible> listTangible){
        this.reactions = new ArrayList<Reaction>();
        this.tangibles = listTangible;
    }

    public void addTangible(Tangible tangible) {
        this.tangibles.add(tangible);
    }

    public void removeTangible(Tangible tangible) {
        this.tangibles.remove(tangible);
    }

    public void addReaction(Reaction reaction) {
        this.reactions.add(reaction);
    }

    public void removeReaction(Reaction reaction) {
        this.reactions.remove(reaction);
    }

    public boolean isEmptyReaction(){
        if (tangibles.size() == 0)
            return true;
        else 
            return false;
    }

    public boolean isEmpty() {
        if (tangibles.size() == 0)
            return true;
        else
            return false;
    }

    public boolean isEmptyTangible() {
        if (tangibles.size() == 0)
            return true;
        else
            return false;
    }

    public char showAs() {
        for(int i=0; i < tangibles.size(); i++) {
            if (tangibles.get(i) instanceof Player)
                return tangibles.get(i).showAs();
        }
        return tangibles.get(tangibles.size()-1).showAs();
    }

    public List<Tangible> getListTangible(){
        return this.tangibles;
    }

    public void setListTangible(List<Tangible> tangibles){
        this.tangibles=tangibles;
    }

    public List<Reaction> getListReaction(){
        return reactions;
    }

    public void setListReaction(List<Reaction> reactions){
        this.reactions=reactions;
    }
}
