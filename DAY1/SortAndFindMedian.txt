import java.util.ArrayList;
import java.util.List;

public class findMedian {

	public static int median(List<Integer> arr) {

		int temp;
		int median =0;
		
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j) < arr.get(i)) {
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);

				}

			}
		}
		
		if(arr.size()%2 == 1) { //odd
			median = arr.get(arr.size()/2);
			
		}
		
		if(arr.size()%2 == 0) {
			median = (arr.get(arr.size()/2) + arr.get((arr.size()/2)-1))/2;
			
		}
		
		return median;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(6);
		arr.add(4);
		arr.add(5);
		arr.add(1);
		arr.add(3);
		arr.add(2);

		int solution = median(arr);
		System.out.println(solution);

	}

}
