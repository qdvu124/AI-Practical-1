package search;

public class BreadthFirstFrontier implements Frontier {

	@Override
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		frontier.addLast(node);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return frontier.isEmpty();
	}

	@Override
	public Node removeNode() {
		// TODO Auto-generated method stub
		return frontier.removeFirst();
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return;
		while(!isEmpty())
			frontier.removeFirst();
	}

}
