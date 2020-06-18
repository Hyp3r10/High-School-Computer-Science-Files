import java.util.Arrays;
public class Arrays105 {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Devon";
		names[1] = "Lukas";
		names[2] = "Sean";
		names[3] = "Teja";
		names[4] = "Rohit";
		
		for(String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		for(String x : names) {
			x = "Dorks";
		}
		
		for(String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			names[i] = "Dorks";
		} 
		
		for(String name : names) {
			System.out.print(name + " ");
		}
	}
}
