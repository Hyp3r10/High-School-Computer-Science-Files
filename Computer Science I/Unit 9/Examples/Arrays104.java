public class Arrays104 {
    public static void main(String[] args) {
        String[] names = new String[5];
        int len = names.length;
        for(int i = 0; i < len; i++) {
            System.out.print(names[i] + " ");
        }
        names[0] = "Ladno Calrisian";
        names[1] = "Dylen the Hutt";
        names[2] = "Jermy Binks";
        names[3] = "Hass(an) Solo";
        names[4] = "Darth Tim";
        System.out.println();
        for(int i = 0; i < len; i++) {
            System.out.print(names[i] + ", ");
        }
    }
}