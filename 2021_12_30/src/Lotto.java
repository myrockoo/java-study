
public class Lotto {

	public static void main(String[] args) {
		int k[] = null;
		int swap = 0;
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			k[i] = num;
			if (k[i - 1] >= k[i]) {
				k[i] = k[i - 1];
				k[i - 1] = num;
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				if (k[i] == k[j])
					main(args);
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(k[i]);
		}
	}
}
