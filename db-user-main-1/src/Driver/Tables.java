package Driver;

enum Table{
        LOCATION ("location", 3), 
        PILOT ("pilot", 3),
        ROUTE ("route", 3),
        SCHEDULE ("schedule", 7),
        PLANES ("planes", 4),
        STATUS ("status", 2),
        BOOKING ("booking", 4),
        PASSENGERS ("passengers", 3);   

        private String name;
        private int size;

        Table(String name, int size){
            this.name = name;
            this.size = size;
        }

        public String getName(){
            return this.name;
        }

        public int getSize(){
            return this.size;
        }
}
