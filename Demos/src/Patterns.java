public class Patterns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean placeHolder = true;
		String line, temp;
		line = "";
		for (int i = 0; i < 4; i++) {
			temp = placeHolder ? "1" : "0"; // basically if else, condition ? valueifTrue : valueifFalse;
			// alternative if placeHolder == true, return "1" else return "2"
			line = temp + line;
			placeHolder = !placeHolder;
			System.out.println("When i="+i+" placeHolder="+placeHolder+" temp="+temp+" line="+line);
		}
	}
}