package algorithmes.hb.advanced.graphalgorithmscode.webcrawler;

public class App {

	public static void main(String[] args) {
		
		String root = "http://www.elte.hu";		
		BFS bfs = new BFS();	
		bfs.discoverWeb(root);
		
	}
}
