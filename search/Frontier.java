package search;

import java.util.LinkedList;

public interface Frontier {
	LinkedList<Node> frontier = new LinkedList<Node> ();
	void addNode(Node node);
	boolean isEmpty();
	Node removeNode();
	void removeAll();
	int maxSize();
}
