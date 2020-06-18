import java.util.ArrayList;

class BrowserHistory {
    public String homepage;
    public ArrayList<String> history;
    public int currentIndex;
    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        this.history = new ArrayList<String>();
        this.history.add(this.homepage);
        this.currentIndex = 0;
    }
    
    public void visit(String url) {
    	for(int i = history.size()-1; i > currentIndex; i--) {
    		history.remove(i);
    	}
    	history.add(url);
    	currentIndex = history.size()-1;
    }
    
    public String back(int steps) {
        if((currentIndex - steps) < 0) {
        	currentIndex = 0;
        	return history.get(currentIndex);
        } 
        else {
        	currentIndex -= steps;
        	return history.get(currentIndex);
        }
    }
    
    public String forward(int steps) {
    	if((currentIndex + steps) >= history.size()) {
        	currentIndex = history.size()-1;
        	return history.get(currentIndex);
        } 
        else {
        	currentIndex += steps;
        	return history.get(currentIndex);
        }
    }
}