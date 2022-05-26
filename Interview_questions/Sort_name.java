package Interview_questions;

import java.util.*;

public class Sort_name implements Comparator<Sort>{

		

	public int compare(Sort p1, Sort p2) {
	
		Sort s=(Sort)p1;
		Sort s2=(Sort)p2;
	
		return s.name.compareTo(s2.name);
		
	}
}