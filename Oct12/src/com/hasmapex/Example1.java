package com. hasmapex;

import java.util. HashMap;

public class Example1 {

public static void main(String[] args) {

HashMap<Integer,String> map=new HashMap<Integer, String>();

map.put(11, "Alex");
map.put (12, "Danny");
map.put (13, "Maya");
map.put (14, "Suri");
map.putIfAbsent(20, "Shreya");

System.out.println(map.entrySet());

System.out.println("key = "+map.keySet());
System.out.println("values = "+map.values());
System.out.println("is shreya present = "+map.containsValue(""
		+ "shrey"));
System.out.println("is 14 key exist = "+map.containsKey(14));

}
}