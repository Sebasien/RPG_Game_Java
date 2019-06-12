//
// ETNA PROJECT, 25/10/2018 by griol_s
// convertisseur
// File description:
//      [...]
//

import java.util.*;

class Trade {

    private static Scanner s = new Scanner(System.in);
    
    public static Direction move(){
        String entre;
        entre = s.nextLine();
        if (entre.equals("z")){
            return Direction.NORTH;
        }
        else if (entre.equals("s")){
                return Direction.SOUTH;
        }
        else if (entre.equals("q")){
            return Direction.WEST;
            }
        else if (entre.equals("d")){
            return Direction.EAST;
        }
        return null;
    }

    public static void closeScanner(){
        s.close();
    }
}
