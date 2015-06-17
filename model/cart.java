package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

/*
 * 購物車
 * 
 */
public class cart {

	HashMap<String,String> cart;//存購物車中有那些
	LinkedList<String> cartitemk;//跟cart很像不過用另一種方式存key  
	LinkedList<String> cartitemv;//同上 改成value
	String ktmp;
	public cart(){
		cart=new HashMap<String,String>();
		cartitemk=new LinkedList<String>();
		cartitemv=new LinkedList<String>();
	}
	/*
	 * 取得購物車中所有商品的key值 回傳一set內容為所有商品的key
	 */
	public Set<String> getcartk(String k){
		return cart.keySet();
	}
	/*
	 * 取得商品的value 藉由一key
	 */
	public String getcartv(String k){
		return cart.get(k);
	}
	/*
	 * 新增一商品至購物車中 k=商品key v=商品vlaue 
	 * 傳入購物規則rule 物件 
	 * 處理後取得應該推薦甚麼 在指定給 dynamic
	 * dynamic可作為存推薦商品的地方
	 * 買當按下按鈕時該函數被呼叫即同時教dynaimc重讀一次該推薦什麼
	 */
	public void add(String k,String v,dynamic dynamic,rule rule){
		cart.put(k, v);
		cartitemk.add(k);
		cartitemv.add(v);
		
		for(String t:cartitemk){
			ktmp=t+" "+ktmp;
		}
		LinkedList<String> tmp=rule.get(ktmp);
		dynamic.set(tmp);
	}
	public HashMap<String,String> getcartall(){
		return cart;
	}
	/*
	 * 取的購物車中所有商品 的key
	 */
	public LinkedList<String> getcartitemk(){
		return cartitemk;
	}
	/*
	 * 同上改成value
	 */
	public LinkedList<String> getcartitemv(){
		return cartitemv;
	}
	
}
