import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static boolean diagonal1(int[] pos, boolean[][] queens) {
        int r = pos[0]; int c = pos[1]; int j = c;
        for(int i = r-1; i >= 0; i--) {
            if(j-1 >= 0) {
                j--;
            }
            else {
                break;
            }
            if(queens[i][j]) {
                return true;
            }
        }
        j = c;
        for(int i = r+1; i < queens.length; i++) {
            if(j+1 < queens.length) {
                j++;
            }
            else {
                break;
            }
            if(queens[i][j]) {
                return true;
            }
        }
        return false;
    }
    public static boolean diagonal2(int[] pos, boolean[][] queens) {
        int r = pos[0]; int c = pos[1]; int j = c;
        for(int i = r+1; i < queens.length; i++) {
            if(j-1 >= 0) {
                j--;
            }
            else {
                break;
            }
            if(queens[i][j]) {
                return true;
            }
        }
        j = c;
        for(int i = r-1; i >= 0; i--) {
            if(j+1 < queens.length) {
                j++;
            }
            else {
                break;
            }
            if(queens[i][j]) {
                return true;
            }
        }
        return false;
    }
    public static boolean horizontal(int[] pos, boolean[][] queens) {
        int r = pos[0]; int c = pos[1];
        for(int i = 0; i < queens.length; i++) {
            if(queens[r][i] && i != c) {
                return true;
            }
        }
        return false;
    }
    public static boolean vertical(int[] pos, boolean[][] queens) {
        int r = pos[0]; int c = pos[1];
        for(int i = 0; i < queens.length; i++) {
            if(i != r && queens[i][c]) {
                return true;
            }
        }
        return false;
    }
    public static boolean method(ArrayList<int[]> list, boolean[][] queens) {
        for(int i = 0; i < list.size(); i++) {
            int[] curr = list.get(i);
            if(horizontal(curr, queens)) {
                return false;
            }
            if(vertical(curr, queens)) {
                return false;
            }
            if(diagonal1(curr, queens)) {
                return false;
            }
            if(diagonal2(curr, queens)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTimes = scan.nextInt();
        for(int i = 0; i < numTimes; i++) {
            ArrayList<int[]> list = new ArrayList<int[]>();
            int size = scan.nextInt(); scan.nextLine();
            boolean[][] queens = new boolean[size][size];
            for(int k = 0; k < size; k++) {
                scan.nextLine();
                String real = scan.nextLine().replaceAll("(\\| )|( \\| )|( \\|)", "");
                for(int j = 0; j < size; j++) {
                    if(real.charAt(j) == 'Q') {
                        queens[k][j] = true;
                        list.add(new int[] {k,j});
                    }
                }
            }
            scan.nextLine();
            scan.nextLine();
            if(list.size() == size && method(list, queens)) {
                System.out.println("valid solution");
            }
            else {
                System.out.println("incorrect attempt");
            }
        }
    }
}
