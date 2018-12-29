
public class BrutePass {
	
	private static char[] alphabet = "1234567890abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ".toCharArray();
	private static String password = "1D";
	
	

	private static void bruteRecursive(char [] set, int length, String prefix) {
		
		
		
		
		if(prefix.length() == length) {
			System.out.println("Trying: " + prefix);
			return;
			
		}
		
		
		if(!prefix.contentEquals(password)) {
			for(int i =0; i < set.length; i++) {
				bruteRecursive(set, length, prefix+set[i]);
				
				
				}
			}
			
		}
		
		
	
	

	public static void main(String[] args) {
		bruteRecursive(alphabet, 2, "");

	}

}
