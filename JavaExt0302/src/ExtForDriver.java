import java.util.ArrayList;
import java.util.List;

/**
 * 拡張forループ利用サンプル
 * @author M.Takahashi
 */
public class ExtForDriver {

	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {

		// 配列宣言＆要素の初期化
		String[] memberArr = {
			"速水剛留", "佐藤三郎", "山本誠"
		};

		// 配列の全件表示
		System.out.println();
		for (String member : memberArr) {
			System.out.println(member);
		}
		
		// Listオブジェクト作成
		List<Product> prodList = new ArrayList<Product>();

		// 要素の追加
//		Product prod1 = new Product("マウス", 2000);
//		prodList.add(prod1);
		prodList.add(new Product("マウス", 2000));
		prodList.add(new Product("キーボード", 3600));
		prodList.add(new Product("Webカメラ", 2900));
		prodList.add(new Product("LED照明", 4200));

			// リスト全件表示
		System.out.println();
		for (Product prod : prodList) {
			System.out.println(prod);
		}

	}

}
