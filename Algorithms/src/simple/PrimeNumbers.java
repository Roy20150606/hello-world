package simple;

public class PrimeNumbers {

	public static void main(String [] args) throws Exception{

		int number = 0;
		
		for(number =0; number < 99999999; number++){
			boolean result = sosuCheck(number);
			
			if(result){
				System.out.println(number + "is prime number");
			}
		}
	}
	static boolean sosuCheck(int num){
		for(int i =2; i < num ; i++){
			if(num%i==0){
				return false; // ����� �����Ѵٸ� �Ҽ��� �ƴϴ�
			}
		}
		return true;
	}
	
	static class InnerClass{
		public String name = "Jungho";
	}
}
