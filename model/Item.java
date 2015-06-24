package hackDM;

import java.util.HashMap;
import java.util.Set;

/*
 * 紀錄全部的商品
 */

public class Item {
	
	HashMap<String,String> item;//存商品id名稱
	
	/*
	 * 初始化       當物件建立即讀檔        file路徑要對
	 * 至於如何處理txt的內容還不確定 要再討論
	 */
	public Item(){
		item=new  HashMap<String,String>();
		
		for(int i = 1; i <= 100; i++){
			item.put("t"+i, "type"+i);
		}
	}
	
	
	/*
	 * 取得所有商品的key值 回傳一set內容為所有商品key
	 */
	public Set<String> getitemk(){
		return item.keySet();
	}
	
	/*
	 * 同上 只是key變value
	 */
	public String getitemv(String k){
		return item.get(k);
	}
	
	/*
	 * 取得物件存商品的 hashmap
	 */
	public HashMap<String,String> GetItem(){
		return item;
	}
	
	/*
	 * 新增一商品 k為key值 可能是id v為value可能是名稱
	 */
	public void add(String k,String v){
		item.put(k, v);
	}
	
	/*
	 * 移除依商品 k為key v為value
	 */
	public void remove(String k,String v){
		item.remove(k, v);
	}
}
