package search;

public class Node {
	public final Node parent;
	public final Action action;
	public final State state;
	public final int depth;
	
	public Node(Node parent, Action action, State state) {
		this.parent = parent;
		if(this.parent == null)
			depth = 0;
		else
			depth = parent.depth + 1;
		this.action = action;
		this.state = state;
	}
}
