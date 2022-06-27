
public class Task1 {

	public static void main(String[] args) {
		String sentance = "Are you as excited as I am?";
		String reverseSentance = "";
		
		System.out.println(sentance);
		
		String[] words = sentance.split(" ");
		
		for (int i = words.length - 1; i >= 0; i--) {
			reverseSentance = reverseSentance + words[i] + " ";
			
		}
		
		System.out.println(reverseSentance.trim());
		
		String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};
		String reversedWord = "";
		String holder = "";
		
		for (int j = 0; j < wordList.length; j++) {
			reversedWord = "";
			
			for (int k = wordList[j].length() - 1; k >= 0; k--) {
				holder = wordList[j];
				reversedWord = reversedWord + holder.charAt(k);
				
			}
			
			System.out.println(reversedWord);
			
		}

	}

}
