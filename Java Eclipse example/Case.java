import java.util.ArrayList;

public class Case {

//==============fields

	String description; // the emergency situation
	ArrayList<Action> responses; // viable responses to situation

//==========gettersetter	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Action> getResponses() {
		return responses;
	}

	public void setResponses(ArrayList<Action> responses) {
		this.responses = responses;
	}

	public void addResponse(Action a) {
		responses.add(a);
	}

//===============constr	

	public Case() {
		// TODO Auto-generated constructor stub
		responses = new ArrayList<Action>();
	}

	public Case(String description) {
		this.description = description;
		responses = new ArrayList<Action>();
	}

}
