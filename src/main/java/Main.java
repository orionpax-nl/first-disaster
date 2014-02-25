
public class Main {


    public static void main(String[] args) {
        /*playerid playerid = new playerid();*/
        player player1 = new player();
        player player2 = new player("Joris","de Crom", 29);
        player player3 = new player("Sander","de Crom", 20);
        System.out.println("Hello World!");
        System.out.println(player1.getPlayer());
        System.out.println(player2.getPlayer());
        System.out.println(player3.getPlayer());
    }



}

