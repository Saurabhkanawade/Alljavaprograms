package Hashset;

import java.util.*;

public class Hashset_friends {

	public static void main(String[] args) {

		Set<String> h = new LinkedHashSet<String>();

		h.add("xeviar");
		h.add("Saurabh");
		h.add("xeviar");
		h.add(null);
		h.add(null);
		h.add("Sagar");
		h.add("Rushikesh");
		h.add("Zebra");
		for (String print : h) {

			System.out.println(print);
		}
	}
}