package test1;

import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cart = new HashMap<String, Integer>();
	
	/**
	 * 新增一商品至購物車中
	 * @param k = 商品key
	 * @param num = 商品數量
	 */
	public void Add(String k, int num){
		cart.put(k, num);
	}
	
	/**
	 * 取得購物車中所有商品的key跟數量
	 * @return cart
	 */
	public HashMap<String, Integer> GetCart(){
		return cart;
	}
	
	/**
	 * 移除購物車中的一商品
	 * @param k = 商品key
	 */
	public void Remove(String k){
		cart.remove(k);
	}
	
}
