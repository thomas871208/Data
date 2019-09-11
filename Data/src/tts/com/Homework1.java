package tts.com;



public class Homework1 {

	public static void main(String[] args) {
		int i;
		int j;
		int min;
		int temp;
		int[] data = {240,1,520,29,106};

		for (i=0; i<5; i++){
			min = i;
			for (j=i+1; j<5; j++) 
				if (data[j]<data[min]) 
					min = j;temp = data[i];
					data[i] = data[min];
					data[min] = temp;
					}
			
			
		for(int a = 0; a<5;a++) {
		System.out.print(data[a]+" ");
		}

	}

}
