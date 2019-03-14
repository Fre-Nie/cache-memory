package cache;

import java.util.HashMap;

public class Model {

	private HashMap<Integer, Long> minne = new HashMap<Integer, Long>(); 
	
	
	private Long getValueFromMemory(Integer value) {
		if (minne.containsKey(value)) {
			return minne.get(value);
		}
		return null;
}

	private void addValueToMemory(Integer value, Long result) {
		minne.put(value, result); 
		
	}
	
	public void clearMemory() {
		minne.clear(); 
		System.out.println("Memory Cleared.");
	}
	
	private long computePower(int power) {
		 if ( power == 0 ) {
		        return 1;
		    }
		    return ( 2 * computePower(power-1));
		
	}
	
	public long compute2Power(int power) {
		long result; 
		if (power < 0) {
			throw new IllegalArgumentException(); 
		}
		if (getValueFromMemory(power) != null) {
			result = getValueFromMemory(power); 
			return result;
		}
		else{
			result = computePower(power); 
			addValueToMemory(power, result); 
			return result;
		}
	
		
	}
}