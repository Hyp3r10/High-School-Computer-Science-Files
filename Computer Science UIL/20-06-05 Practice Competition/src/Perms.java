import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author MatthewSheldon
 */
public class Perms {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String target = scan.nextLine().replace(" ", "");
		char[] characters = target.toCharArray();
		
		ArrayList<String> permutations = new ArrayList<String>();
		Permutation permute = new Permutation();
		permutations = permute.permute(new ArrayList<String>(), String.valueOf(characters), 0, characters.length-1);
		Collections.sort(permutations);
		
		for(int i = 0; i < permutations.size(); i++) {
			if(permutations.get(i).equals(target)) {
				System.out.println(i + 1);
				i = permutations.size();
			}
		}
		
	}
}
class Permutation { 
    public ArrayList<String> permute(ArrayList<String> list, String str, int l, int r)  { 
        if (l == r) {
            list.add(str); 
            return list;
        }
        else { 
            for(int i = l; i <= r; i++) { 
                str = swap(str,l,i); 
                list = permute(list, str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
        return list;
    } 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 

