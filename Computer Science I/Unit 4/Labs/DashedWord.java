public class DashedWord
{
    public void dashV (String word)
    {
        int len = word.length()-1;
        String dashedWord = "";
        for(int i = 0; i <= len; i++)
        {
          if(i < len)
          {
              dashedWord += (word.substring(i,(i+1)) + "-"); 
          }
          else if(i == len)
          {
              dashedWord += (word.substring(i,(i+1)));
          }
        }
        System.out.println("\nVoid Method :: ");
        System.out.println("Dashed word :: " + dashedWord);
    }
    public String dashR(String word)
    {
        int len = word.length()-1;
        String dashedWord = "";
        for(int i = 0; i <= len; i++)
        {
          if(i < len)
          {
              dashedWord += (word.substring(i,(i+1)) + "-"); 
          }
          else if(i == len)
          {
              dashedWord += (word.substring(i,(i+1)));
          }
        }
        System.out.println("\nReturn Method :: ");
        return dashedWord;
    }
}