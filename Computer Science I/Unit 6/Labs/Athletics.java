public class Athletics
{
    public Athletics()
    {
        Football football = new Football("Cowboys", 10, 8, 2, 20, 2);
        Baseball baseball = new Baseball("Rangers", 20, 12, 8, 25, 65, 5);

        System.out.println(football);
        System.out.println();
        System.out.println(baseball);
    }
    public static void main(String[] args)
    {
        Athletics app = new Athletics();
    }
}