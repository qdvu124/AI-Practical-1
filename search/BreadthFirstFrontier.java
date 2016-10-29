package search;

public class BreadthFirstFrontier implements Frontier {
	
	int maxSize = Integer.MIN_VALUE;

	@Override
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		frontier.addLast(node);
		if(frontier.size() > maxSize)
			maxSize = frontier.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return frontier.isEmpty();
	}

	@Override
	public Node removeNode() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		// BreadthFirstSearch using a queue, first in first out principle
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

	@Override
	public int maxSize() {
		// TODO Auto-generated method stub
		return maxSize;
	}

}
