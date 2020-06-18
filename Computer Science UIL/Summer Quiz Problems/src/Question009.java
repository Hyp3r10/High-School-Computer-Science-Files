import java.util.Scanner;

public class Question009 {
	public static void main(String[] args) {
		String m;
		m="J Cole Ken Drick Lam ar Logic";
		Scanner sc=new Scanner(m);
		while(sc.hasNext()) {
			if(sc.next().length()<4) 
				System.out.print(sc.next());
		}
		System.out.println();
	}
}