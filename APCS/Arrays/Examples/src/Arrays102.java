public class Arrays102 {
	public static void main(String[] args) {
		String[] teenTitans = {"Cyborg", "Robin", "Starfire", "Raven"};
		System.out.println(teenTitans[0] + ", " + teenTitans[1] + ", " + teenTitans[2] + ", " + teenTitans[3]);	
		
		teenTitans[1] = "Beast Boy";
		System.out.println(teenTitans[0] + ", " + teenTitans[1] + ", " + teenTitans[2] + ", " + teenTitans[3]);	
		int len = teenTitans.length;
		
		System.out.println("The length of the array is :: " + len);
		
		System.out.println("The last element (member) of Teen Titans is :: " + teenTitans[len-1]);
		
	}
}
