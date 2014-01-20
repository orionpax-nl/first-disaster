
    public class player {
        private int Id;
        private String FirstName;
        private String LastName;
        private int Age;
        private int Value;

        public player (String name, String Familyname, int NewAge){
        Id = 1;
        FirstName = name;
        LastName  = Familyname;
        Age = NewAge;
        Value = 10;
        }

        public int getAge() {
            return Age;
        }

        public int getValue() {
            return Value;
        }

        public String getFirstName(){
            return FirstName;
        }

        public String getLastName () {
            return LastName;
        }
        public int getPlayerId () {
        return Id;
        }
        public void main(String[] args) {
        player player_rick=new player("Rick","Jansen",31);
        player_rick.getFirstName();
        player_rick.getLastName();
        player_rick.getValue();
        player_rick.getPlayerId();
        System.out.println(player_rick.getAge());
        }
    }






