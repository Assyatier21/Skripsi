import java.util.*;
public class SatuC {

	public static void main(String[] args) {
		try {
			int n = 0;
			Scanner s = new Scanner(System.in);
			while (n <= 0) {
				System.out.print("Masukkan nilai N: ");
				n = s.nextInt();
				if (n <= 0)
					System.out.println("Nilai invalid!");
			}
			int[][] arr = new int[n][n];
			for (int i = 0; i < arr.length; i++) {
				arr[i][0] = i;
				for (int j = 0; j < arr[i].length; j++) {
					arr[0][j] = j;
					if (i > 0 && j > 0)
						arr[i][j] = arr[i - 1][j] + arr[i][j - 1];

				}
			}
			for (int[] num : arr) {
				for (int number : num) {
					System.out.printf(number + "\t");
				}
				System.out.println();
			}
			s.close();
		} catch (Exception ex) {
			System.out.println("Terjadi kesalahan: " + ex);
			System.out.println("Tolong masukkan angka yang benar!");
		}
	}
}
