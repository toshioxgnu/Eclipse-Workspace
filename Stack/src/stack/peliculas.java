package stack;

import java.util.Stack;

public class peliculas {
	public static void main(String[] args) {
		Stack movies = new Stack();
		movies.push("Avengers: ENDGAME");
		movies.push("Captain Marvel");
		movies.push("The End Of Evangelion");
		
		while(!movies.isEmpty()) {
			System.out.println(movies);
			movies.pop();
			
		}
	}

}
