/**
 * Created by orionpax on 25-02-14.
 */
public class playerid {
    public int id  ;
    private static int lastId        ;

    public playerid(){
        id = lastId + 1    ;
        lastId = 0;
    }

    public static int getPlayerId() {
        int pid = lastId + 1;
        lastId += 1;
        return pid;
    }

}
