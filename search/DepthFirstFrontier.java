package search;

public class DepthFirstFrontier implements Frontier {
	
	int maxSize = Integer.MIN_VALUE;

	@Override
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		frontier.addLast(node);
		if(frontier.size() > maxSize)
			maxSize = frontier.size();
	}

	@Override
	public Node removeNode() {
		// TODO Auto-generated method stub
		// DepthFirstSearch using a stack, last in first out principle
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
		while(!isEmpty()) 
			frontier.removeLast();
	}

	@Override
	public int maxSize() {
		// TODO Auto-generated method stub
		return maxSize;
	}
}
