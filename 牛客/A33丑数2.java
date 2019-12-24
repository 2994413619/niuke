package 牛客;

public class A33丑数2 {

	public int GetUglyNumber_Solution(int index) {
		
		if(index == 0) {
			return 0;
		}
		
		int[] result = new int[index];
		result[0] = 1;
		
		int point2 = 0;
		int point3 = 0;
		int point5 = 0;
		
		for(int i = 1; i < index; i++) {
			result[i] = Math.min(result[point2] * 2, Math.min(result[point3] * 3, result[point5] * 5));
			
			if(result[i] == result[point2] * 2) {
				point2++;
			}
			if(result[i] == result[point3] * 3) {
				point3++;
			}
			if(result[i] == result[point5] * 5) {
				point5++;
			}
			
		}
		
		return result[index - 1];
    }
	
	public static void main(String[] args) {
		A33丑数 test = new A33丑数();
		int n = test.GetUglyNumber_Solution(1000);
		System.out.println(n);
	}
	
}
