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
	LinkedList<String> most;//最常出現的物品 
	/*
	 * 初始化 物件 
	 * 
	 */
	public rule() throws IOException   {
		//most=new LinkedList<String>();
		 rule=new HashMap<String,LinkedList<String>>();
		 most=new LinkedList<String>();
		 most.add("t");
		 LinkedList<String> k=new LinkedList<String>();
		 k.add("tt");
		 rule.put("t", k);// t/tt
	}
	/*
	 * 取得在某一購物後   由購物規則規定可能的購買物品   
	 * 回傳一linkedlist<string> 內容為由購物規則規定的商品  
	 */
	public LinkedList<String> get(String k){
		LinkedList<String> list;
		if(rule.containsKey(k)){
			list=rule.get(k);
			for(int i=0;list.size()<3;i++){
				list.add(most.get(i));
			}
		return list;
		}
		else{
			//LinkedList<String> most=new LinkedList<String>();
			//most.add("t");
			return most;
		}
	}
	
}
