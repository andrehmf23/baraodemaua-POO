package Filter;

import java.util.ArrayList;
import java.util.List;


public class Filter {
	
	public class State {
		private List<Connect> list_connect = new ArrayList<>();
		
		public void setConnect(State next_state, char[] list_accept) {
			this.list_connect.add(new Connect(next_state, list_accept));
		}
		
		public boolean process(String data) {
			boolean verify = false;
			
			if (data.length() > 0) {
				for (Connect connect : this.list_connect) {
					System.out.println(data);
					if (connect.accept(data.charAt(0))) {
						verify = verify || connect.getNext_state().
								process(data.substring(1));
					}
				}
			}
			
			return verify;
		}
	}
	
	
	public class EndState extends State{
		private List<Connect> list_connect = new ArrayList<>();
		
		public void setConnect(State next_state, char[] list_accept) {
			this.list_connect.add(new Connect(next_state, list_accept));
		}
		
		public boolean process(String data) {
			boolean verify = false;
			
			if (data.length() > 0) {
				for (Connect connect : this.list_connect) {
					if (connect.accept(data.charAt(0))) {
						verify = verify || connect.getNext_state().
								process(data.substring(1));
					}
				}
			}
			else {
				verify = true;
			}
			
			return verify;
		}
	}
	
	public boolean run(String data) {
		char[] numbers = {'0', '1', '2', '3', 
				'4', '5', '6', '7', '8', '9'};
		char[] pnt = {'.'};
		char[] sub = {'-'};
		
		State q0 = new State();
		State q1 = new State();
		State q2 = new State();
		
		State q3 = new State();
		
		State q4 = new State();
		State q5 = new State();
		State q6 = new State();
		
		State q7 = new State();
		
		State q8 = new State();
		State q9 = new State();
		State q10 = new State();

		State q11 = new State();

		State q12 = new State();
		State q13 = new State();
		
		EndState qe = new EndState();
		
		q0.setConnect(q1, numbers);
		q1.setConnect(q2, numbers);
		q2.setConnect(q3, numbers);
		
		q3.setConnect(q4, pnt);
		
		q4.setConnect(q5, numbers);
		q5.setConnect(q6, numbers);
		q6.setConnect(q7, numbers);
		
		q7.setConnect(q8, pnt);
		
		q8.setConnect(q9, numbers);
		q9.setConnect(q10, numbers);
		q10.setConnect(q11, numbers);
		
		q11.setConnect(q12, sub);
		
		q12.setConnect(q13, numbers);
		q13.setConnect(qe, numbers);
		
		
		return q0.process(data);
	}
}

// Qn -> Qn -> Qn -> Qn -> Qn -> Qn -> Qn -> Qn -> Qn -> Qn -> Qn -> null

/*
public class Filter {
	
	String mask;
	
	public Filter(String mask) {
		this.mask = mask;
	}
	
	public boolean process(String data) {
		
		if (this.mask.length() != data.length()) {
			return false;
		}
		
		for (int i = 0; i < data.length(); i++) {
			if (!(this.mask.charAt(i) == 'n' && Character.isDigit(data.charAt(i)) || this.mask.charAt(i) == data.charAt(i))) {
				System.out.println("Valor número [" + (i+1) + "] inválido em: '" + data.charAt(i) + "' ");
				return false;
			}
		}
		return true;
	}
}
*/


