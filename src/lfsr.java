
public class lfsr {
	public short register;
	public short start;
	
	
	lfsr(short in){
		this.register = in;
	}
	lfsr(int in){
		this.register = (short)in;
	}

	
	public String tobits() {
		// TODO Auto-generated method stub
		StringBuffer temp = new StringBuffer();
		for(int i = 15; i >= 0;i--)
		{
			int shift = ((i / 8) * 8)  + (i % 8);
			if((Integer)((this.register >> shift) & 1) != 0)
			{
					temp.append("1");
		
			}
			else
			{
				temp.append("0");
			}
		}
		return temp.toString();
	}
}
