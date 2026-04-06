package sec03.exam06;

public class StringConcactExample {

	public static void main(String[] args) {
		
		int value1 = 10 + 2 + 8;
		System.out.println("value1: " + value1);
		
		// 앞은 합쳐지고 문자열인 부분부터는 문자열 취급
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		
		// 괄호가 있기 때문에 괄호 먼저 계산
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);

	}

}
