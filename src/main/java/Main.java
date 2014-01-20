
public class Main {


    public static void main(String[] args) {
        player Rick = new player();
        player player2 = new player("Joris","de Crom", 29);
        player player3 = new player("Sander","de Crom", 20);
        System.out.println("Hello World!");
        System.out.println(Rick.getFirstName() + " " + Rick.getLastName()+  " is " + Rick.getAge());
        System.out.println(player2.getFirstName() + " " + player2.getLastName() +  " is " + player2.getAge());
        System.out.println(player3.getFirstName() + " " + player3.getLastName() +  " is " + player3.getAge());
    }


}