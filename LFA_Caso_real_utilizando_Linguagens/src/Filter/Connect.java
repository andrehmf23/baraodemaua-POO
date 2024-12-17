package Filter;

import java.util.HashSet;

import Filter.Filter.State;

public class Connect {
	private HashSet<Character> list_accept = new HashSet<>();
	private State next_state = null;
	
	public Connect(State next_state, char[] list_accept){
		this.next_state = next_state;
		for (char accept : list_accept) {				
			this.list_accept.add(accept);
		}
	}
	
	public State getNext_state() {
		return next_state;
	}

	public boolean accept(char c) {
		return this.list_accept.contains(c);
	}
}
