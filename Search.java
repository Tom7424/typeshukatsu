public class Search {

		  public static void main(String args[]) {
		    // 昇順にソートされた配列
		    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
		    // 探索対象の番号
		    int targetNumber = 7890;
		    // 探索実行
		    int targetIndex = new Search().serchIndex(sortedArray, targetNumber);
		    // 結果出力
		    System.out.println(targetIndex);
		  }

		  private int serchIndex(int[] sortedArray, int targetNumber) {

		    // ここから記入
				int left = 0;
				int right = sortedArray.length - 1;
				while (left <= right) {
					int mid = (left + right) / 2;
					
					if (sortedArray[mid] == targetNumber) {
						return sortedArray[mid - 1];
					} else if (targetNumber < sortedArray[mid]) {
						right = mid - 1;
					} else {
						left = mid + 1;
					}
				}
		    // ここまで記述

		    // 探索対象が存在しない場合、-1を返却
		    return -1;
		  }
		}

