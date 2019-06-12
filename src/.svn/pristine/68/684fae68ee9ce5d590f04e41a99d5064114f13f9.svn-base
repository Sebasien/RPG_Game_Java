import java.util.*;

class Main {
    public static void main(String[] args) {

        Key kWin = new Key("Victoire");

        //Blabla du debut de partie
        
        System.out.print("\033[H\033[2J");
        System.out.println("Bonjour et Bienvenue dans MinigameWorld !");
        System.out.println("Danse ce jeu, vous allez devoir vous déplacer pour trouver des mini-jeux. Si vous réussissez ces mini-jeux, vous obtiendrez des clefs qui vout permettrons d'accéder au jeu suivant.");
        System.out.println();
        System.out.println("Petit légende :");
        System.out.println(" J : le joueur,");
        System.out.println(" @ : les escaliers,");
        System.out.println(" ? : les mysterys sont les emplacements des mini-jeux,");
        System.out.println(" # : les murs,");
        System.out.println(" * : les objets,");
        System.out.println(" C : les coffres.");
        System.out.println();
        System.out.println("Les deplacements :");
        System.out.println(" z : Se deplacer vers le haut,");
        System.out.println(" s : Se deplacer vers le bas,");
        System.out.println(" q : Se deplacer vers la gauche,");
        System.out.println(" d : Se deplacer vers la droite.");
        System.out.println();
        System.out.println("Il est l'heure de commencer, comme dirait un grand sage...Have fun and good luck !");
        
        //Création des mapss
        
        Cell[][] cells = new Cell[5][5];
        Cell[][] cellsTwo = new Cell[5][5];
        Cell[][] cellsThree = new Cell[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cells[i][j] = new Cell(new Ground());
                cellsTwo[i][j] = new Cell(new Ground());
                cellsThree[i][j] = new Cell(new Ground());
            }
        }
        cells[4][4] = new Cell(new Wall());
        cells[1][3] = new Cell(new Chest());
        cellsTwo[0][4] = new Cell(new Wall());
        cellsThree[0][0] = new Cell(new Wall());

        Area areaOne = new Area(cells, "Area One");
        Area areaTwo = new Area(cellsTwo, "Area Two");
        Area areaThree = new Area(cellsThree, "Area Three");

        List<Area> areas = new ArrayList<Area>();

        areas.add(areaOne);
        areas.add(areaTwo);
        areas.add(areaThree);

        World world = new World(areas);

        //Création du Player
        
        Stats stats = new Stats(100, 100);
        HealthBar healthBar = new HealthBar("HealthBar", 100, 200);
        List<Item> bag = new ArrayList<Item>();
        Player player = new Player("PlayerOne", 100, stats, healthBar, bag, 'J', new Position(3, 3, "Area One"));

        //Creation des reaction
        
        Reaction r1 = new ActionChangeMap(new Position(2, 2, "Area Two"));
        world.getCurrentArea("Area One").getArea()[1][0].addReaction(r1);
        world.getCurrentArea("Area One").getArea()[1][0].addTangible(new Stair());
        
        Reaction r2 = new ActionChangeMap(new Position(1, 0, "Area One"));
        world.getCurrentArea("Area Two").getArea()[2][2].addReaction(r2);
        world.getCurrentArea("Area Two").getArea()[2][2].addTangible(new Stair());
        
        Reaction r3 = new ActionChangeMap(new Position(4, 4, "Area Three"));
        world.getCurrentArea("Area Two").getArea()[0][4].addReaction(r3);
        world.getCurrentArea("Area Two").getArea()[0][4].addTangible(new Stair());

        Reaction r4 = new ActionChangeMap(new Position(0, 4, "Area Two"));
        world.getCurrentArea("Area Three").getArea()[4][4].addReaction(r4);
        world.getCurrentArea("Area Three").getArea()[4][4].addTangible(new Stair());

        //Création des reaction de jeux
        
        Reaction rg1 = new ActionGoGame(new Position(4, 0, "Area One"));
        world.getCurrentArea("Area One").getArea()[4][0].addReaction(rg1);
        world.getCurrentArea("Area One").getArea()[4][0].addTangible(new Mystery());

        Reaction rg2 = new ActionGoGame(new Position(0, 0, "Area Two"));
        world.getCurrentArea("Area Two").getArea()[0][0].addReaction(rg2);
        world.getCurrentArea("Area Two").getArea()[0][0].addTangible(new Mystery());

        Reaction rg3 = new ActionGoGame(new Position(3, 3, "Area Three"));
        world.getCurrentArea("Area Three").getArea()[3][3].addReaction(rg3);
        world.getCurrentArea("Area Three").getArea()[3][3].addTangible(new Mystery());

        //Création des objets

        Reaction ro1 = new ActionDrop(new Position(0, 4, "Area One"), new Boots(50, 10, "les chaussure de Tonio"));
        world.getCurrentArea("Area One").getArea()[0][4].addReaction(ro1);
        world.getCurrentArea("Area One").getArea()[0][4].addTangible(new Object());

        Reaction ro2 = new ActionDrop(new Position(4, 1, "Area Two"), new Hat(50, "La casquette de Pierre"));
        world.getCurrentArea("Area Two").getArea()[4][1].addReaction(ro2);
        world.getCurrentArea("Area Two").getArea()[4][1].addTangible(new Object());

        Reaction ro3 = new ActionDrop(new Position(3, 4, "Area Two"), new Dress(50, 10, "Le manteau de Thomas"));
        world.getCurrentArea("Area Two").getArea()[3][4].addReaction(ro3);
        world.getCurrentArea("Area Two").getArea()[3][4].addTangible(new Object());

        Reaction ro4 = new ActionDrop(new Position(0, 4, "Area Three"), new Weapon(50, "La moulinette de norme"));
        world.getCurrentArea("Area Three").getArea()[0][4].addReaction(ro4);
        world.getCurrentArea("Area Three").getArea()[0][4].addTangible(new Object());
        
        //Pose le joueur sur la map
        
        world.getCurrentArea("Area One").getArea()[player.getPosition().getX()][player.getPosition().getY()].addTangible(player);
        world.playerMap(player);
        
        while(player.getKPlayer().getName().equals(kWin.getName()) == false){
            player.movePlayer(world, Trade.move());
            System.out.print("\033[H\033[2J");
            System.out.println("Petit légende :");
            System.out.println(" J : le joueur,");
            System.out.println(" @ : les escaliers,");
            System.out.println(" ? : les mysterys sont les emplacements des mini-jeux,");
            System.out.println(" # : les murs,");
            System.out.println(" * : les objets,");
            System.out.println(" C : les coffres.");
            System.out.println();
            System.out.println("Les deplacements :");
            System.out.println(" z : Se deplacer vers le haut,");
            System.out.println(" s : Se deplacer vers le bas,");
            System.out.println(" q : Se deplacer vers la gauche,");
            System.out.println(" d : Se deplacer vers la droite.");
            System.out.println();
            world.playerMap(player);
        }
        Trade.closeScanner();
        System.out.println("C'est gagner !");
    }
}
