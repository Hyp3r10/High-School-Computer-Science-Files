public class MyArrayTester
{
    public static void main(String[] args)
    {
        // instantiate MyArray object
        MyArray list = new MyArray();

        printTitle("Test add method (append)");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        printTitle("Test add method (insert)");
        list.add(0, 40);
        list.add(2, 50);
        list.add(4, 60);
        System.out.println(list);

        printTitle("Test remove method");
        list.remove(0);
        System.out.println(list);
        printTitle("Test remove method");
        list.remove(4);
        System.out.println(list);

        printTitle("Test resize method");
        for(int i=1; i <= 10; i++)
        {
           list.add(i* 100);
        }
        System.out.println(list);

        printTitle("Test size and get methods");
        for(int i=0; i < list.size(); i++)
        {
           System.out.println(list.get(i));
        }
    }

    public static void printTitle(String message)
    {
        int len = 30 - message.length();
        int h = len/2;
        String sp = "";
        for(int i=0; i < h; i++)
        {
            sp += " ";
        }
        System.out.println("******************************");
        System.out.println(sp + message);
        System.out.println("******************************");
    }
}  
  