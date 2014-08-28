public class stream {

 	
	public static void main(String[] args){

		lfsr LFSR = new lfsr((short)0xA2AA);
		char[] send = {'a','b','c','d','e'};  
		
		
		Integer x = 0;
		
		
		do{
		
		
			short bit = (short) ((LFSR.register >> 0) ^ (LFSR.register >> 2)  ^ (LFSR.register >> 3) ^ (LFSR.register >> 5) & 1);
			LFSR.register =  (short) ((short)(LFSR.register >> 1) | bit << 15);
			System.out.println("line " + x.toString() + " " + LFSR.tobits());		
		}while(x < 10);
		
		System.out.println("Andrew Attwood");
	}
	
}
