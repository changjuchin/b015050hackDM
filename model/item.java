package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.HashMap;
import java.util.Set;
/*
 * 紀錄全部的商品
 */
public class item {

	HashMap<String,String> item;//存商品id名稱
	/*
	 * 初始化       當物件建立即讀檔        file路徑要對
	 * 至於如何處理txt的內容還不確定 要再討論
	 */
	public item() throws IOException {
		item=new  HashMap<String,String>();
		File d=new File("C:\\Users\\taoyi99\\Desktop\\eclipse\\list.txt");
		InputStreamReader reader = new InputStreamReader(  
                new FileInputStream(d));
		BufferedReader t=new BufferedReader(reader);
		String tmp=t.readLine();
		for(int i=0;tmp!=null;i++){
			//System.out.println(i);
			/*StringTokenizer k=new StringTokenizer(tmp," ");
			
				add(k.nextToken(), k.nextToken());
				//item.put(t, t);
			*/
			tmp=t.readLine();
		}
		t.close();
	}
	
	
	/*
	 * 取得所有商品的key值 回傳一set內容為所有商品key
	 */
	public Set<String> getitemk(String k){
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
	public HashMap<String,String> getitemall(){
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
