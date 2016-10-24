package search;

public class DepthFirstFrontier implements Frontier {

	@Override
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		frontier.addLast(node);
	}

	@Override
	public Node removeNode() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		return frontier.removeLast();
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return frontier.isEmpty();
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return;
		while(isEmpty()) 
			frontier.removeFirst();
	}
}
