import java.util.ArrayList;
 
public class Item 
{
    String na;
    int atk;
    String img;
    int def;
    String invImg;
    int count = 0;
     
    public Item()
    {
         
    }
     
     
    public Item(String n)
    {
        na = n;
        if(na.equalsIgnoreCase("Sword"))
        {
            img = "       ^\n"
                    + "      ^^^\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "      <#>\n"
                    + "     <<#>>\n"
                    + "    #######\n"
                    + "      {-}\n"
                    + "      {-}\n"
                    + "      {-}\n"
                    + "      {-}\n"
                    + "     ~~~~~\n"
                    + "      +++\n"
                    + "       +";
             
            atk = 8;
        }
         
        if(na.equalsIgnoreCase("Bow"))
        {
            img = "    _\n"
            + "   { \\\n"
            + "   }  \\\n"
            + "   {   |\n"
            + "   }  /\n"
            + "   {_/\n";
             
            atk = 7;
        }
        if(na.equalsIgnoreCase("Sheild"))
        {
            img = "  ____\n"
            +     " / @@ \\\n"
            +    " \\ @@ /\n"
            +    "  \\__/  ";
             
            def = 8;
        }
        if(na.equalsIgnoreCase("Helmet"))
        {
            img = " @@@@@@@@@@@\n"
                + " @   @@@   @\n"
                + " @    @    @\n"
                + " @         @";
            def = 10;
                     
        }
        if(na.equalsIgnoreCase("Chestplate"))
        {
            img = " %%     %% \n"
                + " %%%   %%% \n"
                + " %%%%%%%%% \n"
                + " %%%%%%%%% \n"
                + " %%%%%%%%% ";
             
            def = 10;
        }
        if(na.equalsIgnoreCase("Pants"))
        {
            img = " !!!!!!!!!!\n"
                + " !!!!  !!!!\n"
                + " !!!!  !!!!\n"
                + " !!!!  !!!!\n"
                + " !!!!  !!!!";
            def = 10;
        }
        if(na.equalsIgnoreCase("Boots"))
        {
            img = " ##     ##\n"
                + " ###    ###\n"
                + " #####  #####\n"
                + " #####  #####\n";
             
            def = 10;
        }
        if(na.equalsIgnoreCase("Set"))
        {
            img = " @@@@@@@@@@@@@\n"
                + " @    @@@    @\n"
                + " @     @     @\n"
                + " @           @"
                + "\n\n"
                + "  @@@     @@@ \n"
                + "  @@@@   @@@@ \n"
                + "  @@@@@@@@@@@ \n"
                + "  @@@@@@@@@@@ \n"
                + "  @@@@@@@@@@@ "
                + "\n\n"
                + "  @@@@@@@@@@\n"
                + "  @@@@  @@@@\n"
                + "  @@@@  @@@@\n"
                + "  @@@@  @@@@\n"
                + "  @@@@  @@@@"
                + "\n\n"
                + "  @@     @@\n"
                + "  @@@    @@@\n"
                + "  @@@@@  @@@@@\n"
                + "  @@@@@  @@@@@\n";
             
            def = 40;
        }
        if(na.equalsIgnoreCase("Pendant"))
        {
            img = "\t\\       /\n"
                + "\t \\     /\n"
                + "\t  \\   /\n"
                + "\t   \\O/\n"
                + "\t   / \\\n"
                + "\t  / # \\\n"
                + "\t / ### \\\n"
                + "\t/ ##### \\\n"
                + "       / ###O### \\\n"
                + "       \\  #####  /\n"
                + "        \\  ###  /\n"
                + "         \\  #  /\n"
                + "          \\   /\n"
                + "           \\_/\n";
        }
        if(na.equalsIgnoreCase("Lamp"))
        {
            img = "\t_\n"
                + "       | |\n"
                + "       | |\n"
                + "      (   )\n"
                + "     (  !  )\n"
                + "      (!!!)\n"
                + "      |---|     +\n"
                + "      |===|---+ + +\n"
                + "   ___|---|___  +\n"
                + "  [    &&&    ]\n"
                + "  [___________]\n";
        }
        if(na.equalsIgnoreCase("bread"))
        {
            img = "____";
        }
        if(na.equalsIgnoreCase("pot"))
        {
            img = "____";
        }
    }
     
    public String getItemName()
    {
        return na;
    }
     
     
    public String toString()
    {
        if(def == 0 && atk > 0)
            return na + "\n\n" + img + "\n\n" + "Attack : " + atk + "\n";
        if(atk == 0 && def > 0)
            return na + "\n\n" + img + "\n\n" + "Deffence : " + def + "\n";
        return  na + "\n\n" + img + "\n";
    }
}
