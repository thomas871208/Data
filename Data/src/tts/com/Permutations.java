package tts.com;

public class Permutations {

	public static void main(String[] args) {
		char[] words = {'A','B','C','D'}; 
		perm(words, 0, words.length); 
		} 
		public static void perm(char[] words, int k, int len){ 
		if(k == len-1){ 
		for(int i=0; i<words.length;i++) { 
		System.out.print(words[i]); 
		}
		System.out.println(); 
		return; 
		}else { 
		for(int i=k; i<len; i++){ 
		char temp = words[k]; 
		words[k] = words[i]; 
		words[i] = temp; 
		perm(words, k+1, len); 
		temp = words[k]; 
		words[k] = words[i]; 
		words[i] = temp; 
		} 
		}

	}

}
