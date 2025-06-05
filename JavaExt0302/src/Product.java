/**
 * 商品を表すクラス
 * @author M.Takahashi
 *
 */
public class Product {
	/******** フィールド ******************************************/
	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private int price;

	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名初期値
	 * @param price 価格初期値
	 */
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/******** メソッド ******************************************/
	/**
	 * toString() オーバーライド
	 */
	@Override
	public String toString() {
		return name + "：" + price + "円";
	}

}
