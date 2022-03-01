import java.util.Scanner;
public class SatuC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input N : ");
		int n = input.nextInt();
		int[][] arr = new int[n][n];
		
		for (int y = 0; y < n; y++) {
			for (int x = y; x < n; x++) {
				if (y == 0) {
					arr[y][x] = x;
				}
				else {
					arr[y][x] = arr[y][x-1] + arr[y-1][x];
				}
				arr[x][y] = arr[y][x];
			}
		}
		
		System.out.println();
		
		for (int y = n-1; 0 <= y; y--) {
			for (int x = 0; x < n; x++) {
				System.out.printf("%3d  ", arr[y][x]);
			}
			System.out.println('\n');
		}
	}

	}


