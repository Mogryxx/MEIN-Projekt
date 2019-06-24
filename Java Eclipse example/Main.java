

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//test data
		
		Action a0 = new Action("state0", "desc0");
		Action a1 = new Action("state1", "desc1");
		Action a2 = new Action("state2", "desc2");
		Action a3 = new Action("state3", "desc3");
		Action a4 = new Action("state4", "desc4");
		Action a5 = new Action("state5", "desc5");

		Case c0 = new Case("case0");
		Case c1 = new Case("case1");

		c0.addResponse(a0);
		c1.addResponse(a1);

		a0.putContinuation(c0, a2);
		a1.putContinuation(c1, a2);
		a2.putContinuation(c0, a3);
		a2.putContinuation(c1, a4);
		a0.putContinuation(c0, a5);
		a1.putContinuation(c1, a5);

		Situation s1 = new Situation(c0);	//situation as main class
		
		//test
		
		System.out.println(s1);
		System.out.println(s1.getLastAction());	//first state 
		System.out.println(s1.getLastAction().getCotinuationList(s1.getVcase()));	//answers
		//add answer after choosing - get more options via hash map.values
		s1.addState(s1.getLastAction().getCotinuationList(s1.getVcase()).get(0));
		System.out.println(s1);
		
		//default out with 
		System.out.println(s1.getcurrentState());
		System.out.println(s1.hasContinuation());	//check if more steps else done 
	}

}
