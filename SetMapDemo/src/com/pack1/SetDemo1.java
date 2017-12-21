package com.pack1;

import java.util.*;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("ram");
		set.add("tom");
		set.add("peter");
		
		for(String s : set){
			System.out.println(s);
		}

	}

}
