package test;


import java.util.LinkedList;
/*
 * 動態頁面 class   內容為推薦商品
 * 這個class函數應該不太會直接用到 
 */
public class dynamic {

	LinkedList<String> dynamicitem;//存被推薦的商品
	/*
	 * 設定該推薦的清單 
	 * 傳入值linkedlist<string> t為指定清單
	 */
	cart cart;
	public void set(LinkedList<String> t){
		dynamicitem=t;
	}
	/*
	 * 取得推薦清單 
	 * 回傳值linkedlist<string>即清單
	 */
	public LinkedList<String> getdynamic(){
		return dynamicitem;
	}
	/*
	 * 藉由index取得推薦清單中某一商品
	 */
	public String getbyindex(int t){
		return dynamicitem.get(t);
	}
}
