import java.util.ArrayList;
import java.util.Scanner;

public class DaisyChains {
	public static double[] p;
	public static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		p = new double[N];
		for(int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}
		int numP = 0;
		for(int i = 0; i < N-1; i++) {
			numP += function(i);
		}
		numP++;
		System.out.println(numP);
	}
	public static int function(int i) {
		ArrayList<Photo> photosForI = getPhotosForI(0, i, new ArrayList<Double>(), new ArrayList<Photo>());
		int count = 0;
		for(int index = 0; index < photosForI.size(); index++) {
			Photo currPhoto = photosForI.get(index);
			count = currPhoto.contains() ? count+1 : count;
		}
		return count;	
	}
	public static ArrayList<Photo> getPhotosForI(int curr, int base, ArrayList<Double> dp, ArrayList<Photo> photosForI) {
		if(curr+base == N-1) {
			dp.add(p[curr+base]);
			Photo currPhoto = new Photo(base, base+curr, dp);
			photosForI.add(currPhoto);
			return photosForI;
		}
		else if(curr == 0) {
			dp.add(p[curr+base]);
			Photo currPhoto = new Photo(base, curr+base, dp);
			photosForI.add(currPhoto);
			return getPhotosForI(curr+1, base, copy(dp), photosForI);
		}
		else {
			dp.add(p[curr+base]);
			Photo currPhoto = new Photo(base, base+curr, dp);
			photosForI.add(currPhoto);
			return getPhotosForI(curr+1, base, copy(dp), photosForI);
		}
	}
	public static ArrayList<Double> copy(ArrayList<Double> original) {
		ArrayList<Double> copy = new ArrayList<Double>();
		for(Double temp : original) {
			copy.add(temp);
		}
		return copy;
	}
}
class Photo {
	public int i, j;
	public ArrayList<Double> flowersInPhoto;
	public double P;
	public Photo(int i, int j, ArrayList<Double> flowersInPhoto) {
		this.i = i;
		this.j = j;
		this.flowersInPhoto = flowersInPhoto;
		double total = 0.0;
		for(double temp : flowersInPhoto) {
			total += temp;
		}
		this.P = total / flowersInPhoto.size();
	}
	public boolean contains() {
		for(double pi : flowersInPhoto) {
			if(pi == P) {
				return true;
			}
		}
		return false;
	}
}