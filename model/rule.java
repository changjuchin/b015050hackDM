package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class rule {

	HashMap<String,LinkedList<String>> rule;//存購物規則
	/*
	 * 初始化 物件一輩建立即讀檔 file 路徑要對 怎麼讀還要討論 
	 * 可能可以處理購買2種以上商品該推薦什麼 以購買了 1 ,2 ,3為例
	 * key可以為  "1 2 3" 
	 */
	public rule() throws IOException   {
		
		 rule=new HashMap<String,LinkedList<String>>();
		 File d=new File("C:\\Users\\taoyi99\\Desktop\\eclipse\\list.txt");
			InputStreamReader reader = new InputStreamReader(  
	                new FileInputStream(d)); 
			BufferedReader t=new BufferedReader(reader);
			String tmp=t.readLine();
			for(;tmp!=null;){
			
				tmp=t.readLine();
			}
			t.close();
	}
	/*
	 * 取得在某一購物後   由購物規則規定可能的購買物品   
	 * 回傳一linkedlist<string> 內容為由購物規則規定的商品 
	 */
	public LinkedList<String> get(String k){
		return rule.get(k);
	}
}
