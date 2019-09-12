package tts.com;

public class Homework2 {

	public static void main(String[] args) {
	int n = 5;
	int location = 1;
	int x = 29;
	int[] data = {240,1,520,29,106};
	
	while (location <= n && data[location -1 ] != x) 
		location++;
		
		if (location > n) {
			location = 0;
			System.out.println(location);
		}
		else {
	System.out.println("X位於第"+location+"個位置");
		}

	}

}
