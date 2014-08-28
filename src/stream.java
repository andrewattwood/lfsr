public class stream {

 	
	public static void main(String[] args){

		lfsr LFSR = new lfsr((short)0xA2AA);
		char[] send = {'a','b','c','d','e'};  
		
		
		short LFSR = start;
		Integer x = 0;
		
		
		do{
		
		
			short bit = (short) ((LFSR >> 0) ^ (LFSR >> 2)  ^ (LFSR >> 3) ^ (LFSR >> 5) & 1);
			LFSR =  (short) ((short)(LFSR >> 1) | bit << 15);
			System.out.println("line " + x.toString() + " " + LFSR);		
		}while(x < 10);
		
		System.out.println("Andrew Attwood");
	}
	
}
