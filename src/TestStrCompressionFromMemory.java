
public class TestStrCompressionFromMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strCompress("aabcca"));

	}
	
	
	

	public static String strCompress(String str){
		int count = 0;
		char f = str.charAt(0);
		String str2 = str + " ";
		String newStr = "";
		
		for(int i =0; i <str2.length(); i++){
			if (f == str2.charAt(i)){
				count++;
			}
			
			if(f !=str2.charAt(i)){
				newStr = newStr + f + count;
				f = str2.charAt(i);
				count = 1;
			}
		}
		
		return newStr;
		
	}
}
