import java.util.List;

class Solution {
    public boolean isPathCrossing(String path) {
        char[] directions = path.toCharArray();
        int x = 0;
        int y = 0;
        String list = "";
        int[] temp = {1};
        int len = temp.length;
        list += "(" + x + "," + y + ")";
        boolean found = false;
        for(char curr : directions) {
            if(!found) {
                switch(curr) {
                    case 'N': {
                        y++;
                        if(list.contains("(" + x + "," + y + ")")) {
                            found = true;
                        }
                        else {
                        	list += "(" + x + "," + y + ")";
                        }
                        break;
                    }
                    case 'S': {
                        y--;
                        if(list.contains("(" + x + "," + y + ")")) {
                            found = true;
                        }
                        else {
                        	list += "(" + x + "," + y + ")";
                        }
                        break;
                    }
                    case 'W': {
                        x--;
                        if(list.contains("(" + x + "," + y + ")")) {
                            found = true;
                        }
                        else {
                        	list += "(" + x + "," + y + ")";
                        }
                        break;
                    }
                    case 'E': {
                        x++;
                        if(list.contains("(" + x + "," + y + ")")) {
                            found = true;
                        }
                        else {
                        	list += "(" + x + "," + y + ")";
                        }
                        break;
                    }
                }
            }
        }
        return (found);
    }
}