
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

        public player (){
            Id = 1;
            FirstName = "Rick";
            LastName  = "Jansen";
            Age = 31;
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

    }






