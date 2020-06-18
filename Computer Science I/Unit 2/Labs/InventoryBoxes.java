import java.util.*;
 
public class InventoryBoxes extends Item
{
    String box = "";
    static int count = 1;
    String name;
    ArrayList<InventoryBoxes> vox2 = new ArrayList<InventoryBoxes>();
    Scanner scan = new Scanner(System.in);
    public InventoryBoxes()
    {
         
    }
    public InventoryBoxes(String item)
    {
        if(item.equalsIgnoreCase("Sword"))
        {
            box = swordBox();
            count++;
        }
        else if(item.equalsIgnoreCase("Sheild"))
        {
            box = sheildBox();
            count++;
        }
        else if(item.equalsIgnoreCase("Bow"))
        {
            box = bowBox();
            count++;
        }
        else if(item.equalsIgnoreCase("Pendant"))
        {
            box = pendantBox();
            count++;
        }
        else if(item.equalsIgnoreCase("Sword"))
        {
            box = lampBox();
            count++;
        }
        else
        {
            box = "\n  -----------------\n"
                    + " |                " + count + "|\n"
                    + " |                 |\n"
                    + " |                 |\n"
                    + " |                 |\n"
                    + " |                 |\n"
                    + "  -----------------\n";
            name = "Null";
        }
    }
     
    public String getBox()
    {
        return box;
    }
     
    public String swordBox()
    {
         
        box = "\n  -----------------\n"
                + " |                " + count + "|\n"
                + " |                 |\n"
                + " |     <--}>>>     |\n"
                + " |                 |\n"
                + " |                 |\n"
                + "  -----------------\n";
        name = "Sword";
        return box;
    }
     
    public String sheildBox()
    {
         
        box = "\n  -----------------\n"
                + " |      ____      " + count + "|\n"
                + " |     / @@ \\      |\n"
                + " |     \\ @@ /      |\n"
                + " |      \\__/       |\n"
                + " |                 |\n"
                + "  -----------------\n";
        name = "Sheild";
        return box;
         
    }
     
    public String bowBox()
    {
         
        box = "\n  -----------------\n"
                + " |                " + count + "|\n"
                + " |      }\\         |\n"
                + " |      { |        |\n"
                + " |      }/         |\n"
                + " |                 |\n"
                + "  -----------------\n";
        name = "Bow";
        return box;
    }
     
    public String pendantBox()
    {
         
        box = "\n  -----------------\n"
                + " |     \\  _  /    " + count + "|\n"
                + " |      \\/ \\/      |\n"
                + " |      / % \\      |\n"
                + " |      \\ % /      |\n"
                + " |       \\_/       |\n"
                + "  -----------------\n";
        name = "Pendant";
        return box;
    }
     
    public String lampBox()
    {
         
        box =  "\n  -----------------\n"
                + " |       _        " + count + "|\n"
                + " |      | |        |\n"
                + " |     ( ! )       |\n"
                + " |      |=|-+      |\n"
                + " |     [___]       |\n"
                + "  -----------------\n";
        name = "Lamp";
        return box;
    }
     
    public String wrenchBox()
    {
         
        box =  "\n  -----------------\n"
                + " |       ||----   " + count + "|\n"
                + " |      /||--      |\n"
                + " |     //||----    |\n"
                + " |    //           |\n"
                + " |   //            |\n"
                + "  -----------------\n";
        name = "Wrench";
        return box;
    }
     
    public String carrotBox()
    {
         
        box =  "\n  -----------------\n"
                + " |       vvv      " + count + "|\n"
                + " |       \\ /       |\n"
                + " |       { }       |\n"
                + " |       { }       |\n"
                + " |        v        |\n"
                + "  -----------------\n";
        name = "Carrot";
        return box;
    }
     
    public String breadBox()
    {
        box = "\n  -----------------\n"
                + " |       ,,,,,    " + count + "|\n"
                + " |     _(_  __)    |\n"
                + " |   _(_ __/       |\n"
                + " |  ( __/          |\n"
                + " |  |/             |\n"
                + "  -----------------\n";
        name = "Bread";
        return box;
    }
    public String potBox()
    {
        box = "\n  -----------------\n"
                + " |                " + count + "|\n"
                + " |                 |\n"
                + " |                 |\n"
                + " |                 |\n"
                + " |                 |\n"
                + "  -----------------\n";
        name = "Pot";
        return box;
    }
     
    public String getName()
    {
        return name;
    }
     
    public String g3tBox()
    {
        return box;
    }
     
    public Item getBoxItem(ArrayList<InventoryBoxes> sal, int x)
    {
        Item vox = new Item(sal.get(x).getName());
        return vox;
    }
     
    public void accessINV(ArrayList<InventoryBoxes> sal)
    {
        System.out.println(sal);
        System.out.println("To get a closer look at an object type the number you want!");
        System.out.print(">");
        String word = scan.nextLine();
        int z = Integer.parseInt(word);
        System.out.println(getBoxItem(sal, z-1));
         
    }
     
    public String toString()
    {
        return box;
    }
     
    public void setToNull()
    {
        box = "\n  -----------------\n"
                + " |                " + count + "|\n"
                + " |                 |\n"
                + " |                 |\n"
                + " |                 |\n"
                + " |                 |\n"
                + "  -----------------\n";
        name = "Null";
         
    }
 
 
}