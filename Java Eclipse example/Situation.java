import java.util.ArrayList;

public class Situation {

//==============fields

	ArrayList<Action> state; // actions/answers taken previously
	Case vcase;

//==========methods

	public String getcurrentState() {
		if (state.size() > 0) {
			return state.get(state.size() - 1).getState();
		}
		return "no state";
	}

	public Action getLastAction() {
		if (state.size() > 0) {
			return state.get(state.size() - 1);
		}
		return null;
	}

	public void addState(Action a) {
		state.add(a);
	}

	public boolean hasContinuation() { // checks if situation has more steps/answers for it to be solved/solvable
		Action a = this.getLastAction();
		if (a != null && a.getCotinuationList(vcase).size() > 0) {
			return true;
		}
		return false;
	}

//==========gettersetter

	public ArrayList<Action> getState() {
		return state;
	}

	public void setState(ArrayList<Action> state) {
		this.state = state;
	}

	public Case getVcase() {
		return vcase;
	}

	public void setVcase(Case vcase) {
		this.vcase = vcase;
	}

//=============to string

	@Override
	public String toString() {
		return "Situation [Case=" + vcase.getDescription() + ", current State=" + getcurrentState() + "]";
	}

//===============constr

	public Situation() {
		// TODO Auto-generated constructor stub
		state = new ArrayList<Action>();
	}

	public Situation(Case vcase) {
		this.vcase = vcase;
		state = new ArrayList<Action>();
		state.add(vcase.getResponses().get(0));
	}

}
