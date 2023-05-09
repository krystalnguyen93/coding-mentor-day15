package findIndexArray;

import java.util.Arrays;

public class minGap {
	public static void main(String args[]) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		System.out.println(minDistance(arr));
	}

	static int minDistance(int[] array) {
		int minGap = 0;
		int[] arrayDoiChieu = new int[100000];

		Arrays.setAll(arrayDoiChieu, i -> -1);

		for (int i = 0; i < array.length; i++) {
			int valueTheoArrayBanDau = array[i];
			
			if (arrayDoiChieu[valueTheoArrayBanDau] != -1) {
				int indexTheoArrayDoiChieu = arrayDoiChieu[valueTheoArrayBanDau];
				int gap = i - indexTheoArrayDoiChieu;
				
				if (minGap == 0 || gap < minGap) {
					minGap = gap;
				}
			}
			arrayDoiChieu[valueTheoArrayBanDau] = i;
		}
		return minGap;
	}
}