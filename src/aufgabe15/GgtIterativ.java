package aufgabe15;

import java.util.ArrayList;
import java.util.List;

public class GgtIterativ implements GgT {

	@Override
	public long berechneGgt(long a, long b) {
		List<Long> maxlist = new ArrayList<Long>();
		if(a == b)
			return a;
		
		
		if (a > b) {
			for (long i = 1; i < b; i++) {
				if (a % i == 0 && b % i == 0) {
					maxlist.add(i);
				}
			}
			if(maxlist.size()>1)
				return maxlist.get(maxlist.size()-1);
			else
				return 1;


		} 
		else {
			for (long i = 1; i < a; i++) {
				if (a % i == 0 && b % i == 0) {
					maxlist.add(i);
				}
			}
			if(maxlist.size()>1)
				return maxlist.get(maxlist.size()-1);	
			else
				return 1;
			
		}

	}

}
