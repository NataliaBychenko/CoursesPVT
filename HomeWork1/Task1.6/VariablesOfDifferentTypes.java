public class VariablesOfDifferentTypes {
	public static void main(String[] args) {
		int i = 2000000000;
		short sh = 32120;
		long l = 2147483648l;
		double d = 3.141592;
		float f = 3.14f;
		char ch = 'c';
		boolean b = true;
		
		System.out.print(i+ " " + sh + " " + l + " " + d + " " + f + " " + ch+ " "+ b + "\n");
		System.out.println(i+ " " + sh + " " + l + " " + d + " " + f + " " + ch+ " "+ b);
		System.out.printf("int = %d,\nshort = %d,\nlong = %d,\ndouble = %f,\nfloat = %f,"
				+ "\nchar = %s,\nboolean = %s\n", i, sh, l, d, f, ch, b);
		System.out.println("----------------------------------------");
		
		int result1 = i+ sh; // ����� int � short
		double result2 = l - d;//�������� long � double
		double result3 = f * d ; //������������ float � double
		boolean result4 = l>d; //��������� long > double
		boolean result5 = f< i; // float < int
		boolean result6 = i==sh; //����� int � short
		boolean result7 = l!=d; // �� ����� long � double
		
		System.out.println(result1+ " " + result2 + " " + result3 + " " + result4 + " " + result5 + " " + result6+ " "+ result7);
				
	}
}
 