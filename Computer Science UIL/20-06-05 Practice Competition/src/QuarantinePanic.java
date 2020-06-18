import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class QuarantinePanic {
    public static char[][] maze;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTimes = scan.nextInt();
        for(int i = 0; i < numTimes; i++) {
            int x1 = scan.nextInt(); int y1 = scan.nextInt();
            int x2 = scan.nextInt(); int y2 = scan.nextInt();
            scan.nextLine();
            maze = new char[11][11];
            
            //instantiate the maze and walkable grid
            for(int outer = 0; outer < 11; outer++) {
                String[] line = scan.nextLine().split("");
                for(int inner = 0; inner < 11; inner++) {
                    maze[outer][inner] = line[inner].charAt(0);
                }
            }
            
            Queue<Path> queue = new LinkedList<>();
            queue.offer(new Path(maze, new boolean[maze.length][maze.length],  x1, y1));

            boolean found = false;
            boolean[][] shortest = null;

            while(!found) {

                if(queue.size() == 0) {
                    break;
                }

                Path curr = queue.poll();
                int r = curr.currR;
                int c = curr.currC;
                boolean[][] previous = curr.previous;

                if(c == x2 && r == y2) {
                    found = true;
                    curr.previous[r][c] = true;
                    shortest = curr.previous;
                }

                if(c > -1 && r > -1 && r < maze.length && c < maze.length && maze[r][c] == ' ') {
                    if(r > 0 && !previous[r][c]) {
                        queue.offer(curr.move(r-1, c));
                    }
                    if(c > 0 && !previous[r][c]) {
                        queue.offer(curr.move(r, c-1));
                    }
                    if(r < maze.length-1 && !previous[r][c]) {
                        queue.offer(curr.move(r+1, c));
                    }
                    if(c < maze[r].length-1 && !previous[r][c]) {
                        queue.offer(curr.move(r, c+1));
                    }
                }
            }

            if(found) {
                int num = 0;
                for(int j = 0; j < maze.length; j++) {
                    for(int k = 0; k < maze[j].length; k++) {
                        if(shortest[j][k] == true) {
                            System.out.print("V");
                            num++;
                        }
                        else {
                            System.out.print(maze[j][k]);
                        }
                    }
                    System.out.println();
                }
                
                System.out.println("path found -- " + num + " moves made\n");
            }
            else {
                for(int j = 0; j < maze.length; j++) {
                    for(int k = 0; k < maze[j].length; k++) {
                        System.out.print(maze[j][k]);
                    }
                    System.out.println();
                }
                System.out.println("path not found\n");
            } 
        }
    }
}
class Path {
    public boolean[][] previous; 
    public char[][] maze;
    public int currR;
    public int currC;

    public Path(char[][] maze, boolean[][] previous, int r, int c) {
        this.previous = previous;
        this.currR = r;
        this.currC = c;
        this.maze = maze;

    }
    public Path move(int r, int c) {
        boolean[][] newPrevious = clonePrevious();
        newPrevious[currR][currC] = true;
        return new Path(maze, newPrevious, r, c);
    }
    
    public boolean[][] clonePrevious() {
        boolean[][] newA = new boolean[previous.length][previous.length];
        
        for(int o = 0; o < newA.length; o++) {
            for(int i = 0; i < previous[o].length; i++) {
                newA[o][i] = previous[o][i];
            }
        }
        
        return newA;
    }
}