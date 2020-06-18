public class State
{
    // instance variables
    private String name;      // The state's name
    private String bird;      // The state's bird
    private String flower;    // The state's flower
    private String song;      // The state's song
    private String motto;     // The state's motto
    private String tree;      // The state's tree
    // constructors
    /**
     * @param name, bird, flower, song, motto, tree :: ask Stites for null v. ""
     */
    public State()
    {
       name = null;
       bird = null;
       flower = null;
       song = null;
       motto = null;
       tree = null;
    }
    public State(String n, String b, String f, String s, String m, String t)
    {
       name = n;
       bird = b;
       flower = f;
       song = s;
       motto = m;
       tree = t;
    }
    // toString method
    public String toString()
    {
       return "State Name   : " + name + "\n" +
              "State Bird   : " + bird + "\n" +
              "State Flower : " + flower + "\n" +
              "State Song   : " + song + "\n" +
              "State Motto  : " + motto + "\n" +
              "State Tree   : " + tree;
    }
}