import java.util.Arrays;

public class teset2 {
	
	

	public static void main(String args[]){
		
		System.out.println(isGoofy(12));
		System.out.println(isGoofy(15));
		System.out.println(isGoofy(26));
		System.out.println(isGoofy(8));
		System.out.println(isGoofy(1234));
		System.out.println(Arrays.toString(getSomeGoofyNumbers(3)));
		System.out.println(Arrays.toString(getSomeGoofyNumbers(15)));
		
	}
	//
	public static boolean isGoofy(int num) {
		
		int sum = 0;
		String str = "" + num;
		for(int i = 0; i<str.length(); i++){
			int character = Character.getNumericValue(str.charAt(i));
			if(character != 0 && num%character == 0){
				sum += character;
			}
		}
		if(sum%2 ==0){
			return false;
		}
		else{
			return true;
		}
	}

	public static int[] getSomeGoofyNumbers(int count){
		
		int[] result = new int[count];
        int i = 0;
        int j = 0;
        while(j < count) {
            if(isGoofy(i)) {
                result[j] = i;
                j++;
            }
            i++;
        }

        return result;
	}
	
}