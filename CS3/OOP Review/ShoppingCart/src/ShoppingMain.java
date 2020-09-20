public class ShoppingMain 
{
    public static void main(String[] args)
    {
        Catalog list = new Catalog("Awesome junk shop");

        list.add(new Item("Silly putty", 3.95, 10, 3.75));
        list.add(new Item("Sandwich", 3.50));
        list.add(new Item("Decent sandwich", 3.75));
        list.add(new Item("Really decent sandwich", 4.0, 10, 3.85));
        list.add(new Item("One dollar", 0.99));
        list.add(new Item("Answers to next test", 500));
        list.add(new Item("Used 2015 MacBook Pro", 1250));
        list.add(new Item("Used Surface Book", 5));
        list.add(new Item("Computer-sciencey pen", 3.40));
        list.add(new Item("Rubik's cube", 9.15));
        list.add(new Item("Life, the universe, everything", 42));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
