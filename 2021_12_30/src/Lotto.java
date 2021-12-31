
public class Lotto {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int check = 0;
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			arr[i] = num;
//			if (k > 0 && arr[k- 1] >= arr[k]) {
//				arr[k] = arr[k - 1];
//				arr[k - 1] = num;
//			}
		}
		for (int i = 0; i <= 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] == arr[j]) {
					main(args);
					check += 1;
				}
			}
		}
		if (check == 0) {
			for (int i = 0; i < 6; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
