package test;


import java.util.LinkedList;

/*
 * 購物車
 * 
 */
public class cart {


	LinkedList<String> cartitemk;//跟cart很像不過用另一種方式存key  
//	LinkedList<String> cartitemv;//同上 改成value
	
	public cart(){

		cartitemk=new LinkedList<String>();
	//	cartitemv=new LinkedList<String>();
	}
	
	/*
	 * 新增一商品至購物車中 k=商品key 
	 */
	public void add(String k){
		if(k!=null){
		cartitemk.add(k);
		}
		//cartitemv.add(v);
		
		
	//	LinkedList<String> tmp=rule.get(cartitemk);
		//dynamic.set(tmp);
	}
	/*
	 * 取的購物車中所有商品 的key
	 */
	public LinkedList<String> getcartitemk(){
		return cartitemk;
	}
	/*
	 * 移除依商品key
	 */
	public void remove(String k){
		cartitemk.remove(k);
	}

	
}
