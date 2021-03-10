public class DataTypes {

	public static void main(String[] args) {
		//1. Byte:
		//Range = -128 to 127
		byte b = 10;
		b = 20;
		byte b1 = 0;
		byte b2 = -10;
		
		//2. Shorts:
		//Range = -32768 to 32767
		short s = 10;
		
		//3. Integer (Int):
		//Range = -2^31 to 2^31
		int i = 10;
		int i1 = 1000;
		int i2 = -10;
		int i3 = 0;
		
		//4. Long:
		//Range = -9 numbers to 9 numbers
		long l = 100202002;
		long l1 = 379874890;
		long l2 = -7676;
		long l3 = 0;
		
		//5. Float:
		//Range = after point any 7 digits you like
		float g = (float)12.33;//(float) always before floating number!
		float g1 = 12.33f; //The "f" is short for "float".
		//Both works. They are just using different syntax.
		
		//6. Double:
		//Range = after point any 15 digits you like
		double ggg = 12.3837848;
		double gg = -12.3445554;
		
		//7. Char:
		char gender = 'm';
		char gender1 = 'f';
		
		//8. Booleans
		boolean sleeping = false;
		boolean coding = true;
	}
}
