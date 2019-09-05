import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;	//	return 3
		
//		int[] people = {70, 80, 50};
//		int limit = 100;	//	return 3

//		int[] people = {70, 80, 50,40, 20, 50};
//		int limit = 100;	//	return 3
		
		System.out.println(new Solution().solution(people, limit));
	}
}

// 구명보트의 무게 제한을 채워서 태우면 좋다.
class Solution {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people); // 무게에 따라 오름차 순
        int numOfBoat = 0;
        int heavyIndex = people.length - 1;
        for (int i = 0; i <= heavyIndex; i++, numOfBoat++) 
            while (heavyIndex > i && people[i] + people[heavyIndex--] > limit)
            	numOfBoat++;
 
        return numOfBoat;
    }
}
