import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;


public class Simulate {
	
	
	private int itemNum;//商品總數量
	private int dataNum;//模擬資料需求量
	private LinkedHashMap<String,Double> itemProbMap = new LinkedHashMap<String,Double> ();//(k,v)=(ID,prob)
	private ArrayList<Double> itemProb; 
	private ArrayList<Double> cdfProb = new ArrayList<Double>();
	private ArrayList<ArrayList<String>> simulateResult= new ArrayList<ArrayList<String>>();
	
	public Simulate(int number_of_data){
		dataNum = number_of_data;
	}
	
	public void toSimulate(HashMap<String,String> item ){
		// item(k,v)=( ID , name)
		
		itemNum=item.size();
		int pos; 
		// to locate the probability of the item  i which is the nearest(and larger) one to the randomP;
		//	and set pos =i;
		double randomP;
		double spaceNum;
		
		ArrayList<String> data= new ArrayList<String>();//container of a data
		
		
		/*
		 * 製作cdfProb
		 */
		itemProb = new ArrayList<Double>(itemProbMap.values());
		for( Double itemP :itemProb){
			if(cdfProb.size()==0){
				cdfProb.add(itemP);
				continue;
			}
			cdfProb.add(itemP + cdfProb.get(cdfProb.size()-1));
		}
		
		/*
		 * 開始生產模擬資料，共 dataNum 筆
		 * step 1.先隨機產生該筆資料的物品數 spaceNum
		 * 		PS: 購物車上限default 為 20個 商品 (非20 種)
		 *		TODO 可考慮寫一個函數設定更改購物車上限
		 *
		 * step 2.依照物品機率隨機放入足夠的物品至該筆資料
		 * step 3.該筆資料模擬完成，回到步驟一作下一筆模擬資料
		 */
		
		
		while(simulateResult.size()<dataNum){
			//step 1
			spaceNum = ((int)Math.random()*20) +1;
			//step 2
			for(int boughtCount=0 ; boughtCount < spaceNum ; boughtCount++){
				randomP = Math.random();//亂數選取介於[0,1)的數字
				for (pos=0; pos<itemNum;pos++){
					if (randomP <= cdfProb.get(pos))
						break;//pos founded! so jump out of the loop
				}
				//根據機率找出ID(that is,由value找key)，再加入data這個ArrayList中
				Set<String>keys=new HashSet<String>(itemProbMap.keySet());
				for(String k:keys){
				    if(item.get(pos).equals(itemProbMap.get(k))){
				    	data.add(k);
				    }
				}//已新放入一個物品，回到step 2 開頭繼續放入更多物品
				
			}
			//step 3
			simulateResult.add(data);//將模擬完成的data放入模擬資料集合simulateResult中
			data.clear();//把data清空，準備回到step 1 進行下一次模擬
		}
		
		
		
		
	}
}
