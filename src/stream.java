public class stream {

 	
	public static void main(String[] args){

		lfsr LFSR = new lfsr((short)0xFFF1);
		char[] send = {'a','b','c','d','e'};  
		System.out.println("LFSR initial state " + LFSR.tobits());		
		
		Integer x = 0;
		
		
		do{
		
		
			short bit = (short) (((((LFSR.register >> 0) ^ (LFSR.register >> 2))  ^ (LFSR.register >> 3)) ^ (LFSR.register >> 5)) & 1);
			System.out.println("before " + new lfsr((bit)).tobits() + " " + new lfsr(((short)(LFSR.register >> 1) & ~(1<< 15))).tobits());
			
			
			LFSR.register =  (short) (((short)(LFSR.register >> 1) & ~(1<< 16)) | ( bit << 16));
			
			
			
			System.out.println("line " + x.toString() + " " + LFSR.tobits());		
			
			System.out.println("after " + new lfsr((bit)).tobits() + " " + new lfsr(((short)(LFSR.register >> 1) & ~(1<< 15))).tobits() + "\n\n");
			
			
			x++;
		}while(x < 10);
		
		
		System.out.println("Andrew Attwood ");
	}
	
}
