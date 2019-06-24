import java.util.ArrayList;
import java.util.HashMap;

public class Action {

//==============fields
	
	String state; // situation
	String description; // action taken
	HashMap<Case, ArrayList<Action>> continuation; // follow up actions

//==========methods
	
	public void putContinuation(Case c, Action a) {		//adds follow up action for specific case
		ArrayList<Action> ala = this.continuation.get(c);
		if (ala == null) {
			ala = new ArrayList<Action>();
			ala.add(a);
			this.continuation.put(c, ala);
		} else {
			ala.add(a);
		}
	}

	public ArrayList<Action> getCotinuationList(Case c) {
		return continuation.get(c);
	}
	// get next Answers/Options for Case

// ============getter setter

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HashMap<Case, ArrayList<Action>> getCotinuation() {
		return continuation;
	}

	public void setCotinuation(HashMap<Case, ArrayList<Action>> h) {
		this.continuation = h;
	}

//==============constr

	public Action() {
		// TODO Auto-generated constructor stub
		this.continuation = new HashMap<Case, ArrayList<Action>>();
	}

	public Action(String state, String description) {
		this.state = state;
		this.description = description;
		this.continuation = new HashMap<Case, ArrayList<Action>>();
	}

//==========tostring

	@Override
	public String toString() {
		return "Action [state=" + state + ", description=" + description + "]";
	}

}
