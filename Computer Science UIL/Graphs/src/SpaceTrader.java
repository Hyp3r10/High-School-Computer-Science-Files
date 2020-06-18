import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class SpaceTrader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Graph graph = new Graph();
        Character startNode = scan.nextLine().charAt(0);
        while(scan.hasNextLine()) {
            String temp = scan.nextLine();
            char start = temp.charAt(0);
            char end = temp.charAt(2);
            int weight = Integer.parseInt(temp.substring(6));
            graph.addNode(start);
            graph.addNode(end);
            graph.addEdge(start, weight, end);
        }
        PriorityQueue<Step> toSearch = new PriorityQueue<Step>(); // Step is on next slide
        int max = 0;
        toSearch.add(new Step(startNode));
        while (!toSearch.isEmpty()) {
            Step currentNode = toSearch.poll();
            if (currentNode.visited.contains(currentNode.node)) { // nodes can’t be out of bounds
                continue;
            } else if (currentNode.totalCost > 50) {
                continue;
            }
            else if(currentNode.visited.size() > max) {
                max = currentNode.visited.size();
            }
            // no more visited array
            // visited is handled by the neighbors function (slide after next)
            for(Step neighbor : currentNode.neighbors(graph)) {
                toSearch.add(neighbor);
            }
        }
        System.out.println(max);
    }
}
class Step implements Comparable<Step>{
    public Character node;
    public List<Character> visited;
    public int totalCost;
    
    public Step(Character node) {
        this.node = node;
        visited = new ArrayList<Character>();
    }
    public Step moveTo(Character node, Graph graph) {
        Step newStep = new Step(node);
        newStep.visited = new ArrayList<Character>(this.visited);
        newStep.visited.add(this.node);
        newStep.totalCost = this.totalCost + graph.edges.get(node).get(this.node);
        return newStep;
    }
    public List<Step> neighbors(Graph graph) {
        List<Step> neighbors = new ArrayList<Step>();
        for(Character neighbor : graph.edges.get(this.node).keySet()) {
            neighbors.add(this.moveTo(neighbor, graph));
        }
        return neighbors;    
    }
    public int compareTo(Step other) {
        return Integer.compare(this.visited.size(), other.visited.size());
    }
}
class Graph {
    public Set<Character> nodes;
    public Map<Character, Map<Character, Integer>> edges;
    public Graph() {
        nodes = new HashSet<Character>();
        edges = new HashMap<Character, Map<Character, Integer>>();
    }
    public void addNode(Character node) {
        nodes.add(node);
    }
    public void addEdge(Character nodeA, Integer weight, Character nodeB) {
        if(!edges.containsKey(nodeA)) {
            edges.put(nodeA, new HashMap<Character, Integer>());
        }
        edges.get(nodeA).put(nodeB, weight);
        if(!edges.containsKey(nodeB)) {
            edges.put(nodeB, new HashMap<Character, Integer>());
        }
        edges.get(nodeB).put(nodeA, weight);
    }
}
