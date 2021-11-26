
public class Exam04 {

	public static void main(String[] args) {
		// 여러가지 자료형
		// Java에서 자료형은 크게 두가지로 나뉜다
		// 1. 기본자료형 2. 레퍼런스 자료형
		// - 기본자료형
		// 1. 정수형 (byte, short, int, long)
		// byte - 1byte(-128~127인 정수)
		byte num1 = 127;
		// short - 2byte
		short num2 = 5000;
		// int - 4byte
		int num3 =20000000;
		// long - 8byte
		long num4 = 222222222;
		
		// 2. 실수형(float, double)
		// float - 4byte
		// Java에서 실수형은 기본적으로 Double로 인식한다
		float num5 = 103.44f;
		// float num5 = (float)10.4;
		
		// double - 8byte;
		double num7 = 2257.1235;
		
		// 3. 논리형 (boolean)
		// boolean - 1byte
		boolean isCheck = true;
		isCheck = false;
		
		// 4. 문자형 (char)
		// char - 2byte
		char text = 'A';
		text = '가';
		
		char test = 'A';
		int num10 = test;
		System.out.println(num10);


	}

}
