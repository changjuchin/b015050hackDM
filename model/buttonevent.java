package test;

/*
 * 某個按鈕被按下後
 * 自動新增商品至購物車     
 */
public class buttonevent {

	public buttonevent(){
		
	}
	/*
	 * cart即頁面中的購物車物件 rule,dynamic同理
	 * k為商品key v為商品value
	 */
	public void button(cart cart,rule rule,dynamic dynamic,String k,String v){
		cart.add(k, v,dynamic,rule);
		
	}
	
}
