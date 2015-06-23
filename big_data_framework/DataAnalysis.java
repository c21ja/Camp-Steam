public class DataAnalysis{

    public static void main(String [] args){
        ActorDatabase database = new ActorDatabase();



       /* int j=0;
       * while(j<database.length()-1){
       *     int i = 0;
       *     while(i<database.length()-1){
       *         
       *         Actor a1 = database.get(i);
       *         Actor a2 = database.get(i+1);
       *         long a1Average = a1.getAverage();
       *         long a2Average = a2.getAverage();
       *         
       *         if(a1Average<a2Average){
       *             Actor temp = database.get(i);
                    database.set(i,database.get(i+1));
                    database.set(i+1,temp);
                }
                i= i+1;
            }
            j=j+1;
        }


        /*
         *
         * ENTER YOUR CODE HERE
         * database.get(i) // returns the actor at the i-th position
         * actor.set(3, actor) // sets the actor at position 3 to actor
         * database.set(i,database.get(i+1)) // sets the actor at the i-th position to the actor at the (i+1) position
         *
         */
        database.print();

    }
}
