		
class DecimalToBinary {
	
	public void decToBin(int n)
	{
		for (int i = 31; i >= 0; i--) {
			int k = n >> i;
			if ((k & 1) > 0)
				System.out.print("1");
		}
	}
}

class driver {
	public static void main(String[] args)
	{
		DecimalToBinary d2b = new DecimalToBinary();
		int n = 34;
		System.out.println("Decimal Number - " + n);
		System.out.print("Binary Number - ");
		d2b.decToBin(n);
	}
}


