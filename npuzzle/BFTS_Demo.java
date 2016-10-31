package npuzzle;

//import search.BreadthFirstTreeSearch;
import search.TreeSearch;
import search.GraphSearch;
import search.BreadthFirstFrontier;
import search.DepthFirstFrontier;
import search.GoalTest;
import search.Node;

public class BFTS_Demo {
	public static void main(String[] args) {
		System.out.println("This is a demonstration of breadth-first tree search on 8-puzzle");
		System.out.println();
		
		Tiles sinitialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});
		
		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 0, 8 }
		});
		
		GoalTest goalTest = new TilesGoalTest();
		Node root = new Node(null, null, initialConfiguration);

		
		//Testing performances for TreeSearch
		TreeSearch BfsTreeSearch = new TreeSearch(new BreadthFirstFrontier());
		TreeSearch DfsTreeSearch = new TreeSearch(new DepthFirstFrontier());
		
		Node BfsTreeSolution = BfsTreeSearch.findSolution(root, goalTest);
		System.out.println("BfsTreeSearch generated " + BfsTreeSearch.nodeGenerated() + " nodes");
		System.out.println("Maximum frontier size: " + BfsTreeSearch.frontierMaxSize());
		new NPuzzlePrinting().printSolution(BfsTreeSolution);
		
		Node DfsTreeSolution = DfsTreeSearch.findSolution(root, goalTest);
		System.out.println("DfSTreeSearch generated " + DfsTreeSearch.nodeGenerated() + " nodes");
		System.out.println("Maximum frontier size: " + DfsTreeSearch.frontierMaxSize());
		new NPuzzlePrinting().printSolution(DfsTreeSolution);
		
		//Testing performances for GraphSearch
		GraphSearch BfsGraphSearch = new GraphSearch(new BreadthFirstFrontier());
		GraphSearch DfsGraphSearch = new GraphSearch(new DepthFirstFrontier());
		
		Node BfsGraphSolution = BfsGraphSearch.findSolution(root, goalTest);
		System.out.println("BfsGraphSearch generated " + BfsGraphSearch.nodeGenerated() + " nodes");
		System.out.println("Maximum frontier size: " + BfsGraphSearch.frontierMaxSize());
		new NPuzzlePrinting().printSolution(BfsGraphSolution);

		Node DfsGraphSolution = DfsGraphSearch.findSolution(root, goalTest);
		System.out.println("DfsGraphSearch generated " + DfsGraphSearch.nodeGenerated() + " nodes");
		System.out.println("Maximum frontier size: " + DfsGraphSearch.frontierMaxSize());
		new NPuzzlePrinting().printSolution(DfsGraphSolution);

	}
}
