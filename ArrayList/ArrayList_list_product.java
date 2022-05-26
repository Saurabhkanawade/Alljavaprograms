package ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayList_list_product {

	public static void main(String[] args) {

		ArrayList_product a1 = new ArrayList_product(101, null       , "     DELL  ", 33000);
		ArrayList_product a2 = new ArrayList_product(102, "PAVELLION", "HP    ", 74000);
		ArrayList_product a3 = new ArrayList_product(103, "MACBOOK  ", "LENOVO", 69000);
		ArrayList_product a4 = new ArrayList_product(104, "VIVIBOOK ", "ACER  ", 39000);

		List<ArrayList_product> all = new ArrayList<ArrayList_product>();

		all.add(a1);
		all.add(a2);
		all.add(a3);
		all.add(a4);

		System.out.println(all.indexOf(a2));
		System.out.println(all.get(2));

//		System.out.println(all.contains(a1));

		Iterator i = all.iterator();

		while (i.hasNext()) {

			ArrayList_product arr = (ArrayList_product) i.next();

			System.out.println(arr.pno + " | " + arr.pname + " | " + arr.pcompany + " | " + arr.price);

		}

	}
}
