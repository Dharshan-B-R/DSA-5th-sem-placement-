package com.graphs;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
public class BFS {

	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
		graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
		graph.put("B", new ArrayList<String>(Arrays.asList("A")));
		graph.put("C", new ArrayList<String>(Arrays.asList("A", "D")));
		graph.put("D", new ArrayList<String>(Arrays.asList("C", "E","F")));
		graph. put("E", new ArrayList<String>(Arrays.asList("D")));
		graph.put("F", new ArrayList<String>(Arrays.asList("D","G")));
		graph.put("G", new ArrayList<String>(Arrays.asList("F")));

		System.out.println("MAP = "+graph.entrySet());
		
		//System.out.println("MAP = "+graph.entrySet());

		System.out.println("MAP = "+graph.entrySet());
		Queue<String> q = new LinkedList<String>();
		LinkedHashSet<String> visited=new LinkedHashSet<String>();
		String start ="A";
		q.offer(start);
		String node;
		while(q.isEmpty() == false)
		{

		node=q.poll();
		visited.add(node);
		for(String neighbor: graph.get(node))
		{

		if(!visited.contains(neighbor))
		{
		q.add(neighbor);
		}
	}
		
}
		System.out.println("DFS = "+visited);
	}

}
