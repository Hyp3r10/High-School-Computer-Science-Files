public class Contact
{
   private String name;
   private String phone;
	
   public Contact(String n, String p)
   {
      name = n;
      phone = p;	
   }
	
   public String getName()
   {
      return name;
   }
	
   public String getPhone()
   {
      return phone;
   }
   @Override
   public String toString() {
	   return getName() + " :: " + getPhone();
   }
}
