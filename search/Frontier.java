package search;

public interface Frontier {
	void addNode(Node node);
	boolean isEmpty();
	Node removeNode();
	void removeAll();
	int maxSize();
}
