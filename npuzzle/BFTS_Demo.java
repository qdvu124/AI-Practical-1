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
		
		/*Tiles initialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});*/
		
		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 0, 8 }
		});
		
		GoalTest goalTest = new TilesGoalTest();
		
		//Testing performances for TreeSearch
		TreeSearch BfsTreeSearch = new TreeSearch(new BreadthFirstFrontier());
		TreeSearch DfsTreeSearch = new TreeSearch(new DepthFirstFrontier());
		
		Node root = new Node(null, null, initialConfiguration);
		Node BfsTreeSolution = BfsTreeSearch.findSolution(root, goalTest);
		Node DfsTreeSolution = DfsTreeSearch.findSolution(root, goalTest);
		
		System.out.println("BfsTreeSearch generated " + BfsTreeSearch.nodeGenerated() + " nodes");
		System.out.println("Maximum frontier size: " + BfsTreeSearch.frontierMaxSize());
		new NPuzzlePrinting().printSolution(BfsTreeSolution);
		new NPuzzlePrinting().printSolution(DfsTreeSolution);
		
		//Testing performances for GraphSearch
		GraphSearch BfsGraphSearch = new GraphSearch(new BreadthFirstFrontier());
		Node BfsGraphSolution = BfsGraphSearch.findSolution(root, goalTest);
		System.out.println("BfsGraphSearch generated " + BfsGraphSearch.nodeGenerated() + " nodes");
		System.out.println("Maximum frontier size: " + BfsGraphSearch.frontierMaxSize());
	}
}
