public class Arrays106 {
    public static void main(String[] args) { 
        String[] names = new String[5];
        
        names[0] = "Ladno Calrisian";
        names[1] = "Dylen the Hutt";
        names[2] = "Jermy Binks";
        names[3] = "Hass(an) Solo";
        names[4] = "Darth Tim";
        
        System.out.println("Enhanced 'for' loop Before");
        for(String name : names) {
            System.out.print(name + " "); // name == names[i];
        }
        System.out.println("\n");
        
        //Attempting to change the elements with enhanced for loop
        for(String x : names) {
            x = "Smelly";
        }
        
        System.out.println("\nEnhanced 'for' loop After");
        for(String name : names) {
            System.out.print(name + " "); // name == names[i];
        }
        System.out.println("\n");
        
        // Attempting to change the elements with basic for loop
        System.out.println("\nEnhanced 'for' loop After");
        for(int i = 0; i < names.length; i++) {
            names[i] = "Smelly";
        }
        
        for(String name : names) {
            System.out.print(name + " "); // name == names[i];
        }
        System.out.println("\n");
    }
}