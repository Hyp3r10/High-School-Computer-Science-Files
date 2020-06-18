public class Book implements Comparable
{
    private String title;  // title of book
    private String author; // author of book
    private int lowAge;    // lowest recommended age
    private int highAge;   // highest recommended age

    public Book(String t, String a, int l, int h)
    {
       title = t;
       author = a;
       lowAge = l;
       highAge = h;
    }

    public int compareTo(Object obj)
    {
        // postcondition: returns zero if lowAge is equal to bk.lowAge &&
        //                highAge is equal to bk.highAge;
        //                returns -1 if lowAge is less than bk.lowAge
        //                or lowAge is equal to bk.lowAge
        //                and highAge is less than bk.highAge;
        //                otherwise it returns a 1.
        Book bk = (Book)obj;
        if(lowAge == bk.lowAge && highAge == bk.highAge)
          return 0;
        else if(lowAge < bk.lowAge || lowAge == bk.lowAge && highAge < bk.highAge)
          return -1;
        else
          return 1;
    }

    public String toString()
    {
        return title + " " + author + " " + lowAge + " " + highAge;
    }
}