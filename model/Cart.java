import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cart = new HashMap<String, Integer>();
	
	/*
	 * 新增一商品至購物車中 k = 商品key, num = 商品數量 
	 */
	public void Add(String k, int num){
		cart.put(k, num);
	}
	
	/*
	 * 取得購物車中所有商品的 key 跟數量
	 */
	public HashMap<String, Integer> GetCart(){
		return cart;
	}
	
	/*
	 * 移除一商品
	 */
	public void remove(String k){
		cart.remove(k);
	}
	
}
