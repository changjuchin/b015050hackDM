package hackDM;

import java.util.HashMap;
import java.util.Set;

/*
 * �����������ӫ~
 */

public class Item {
	
	HashMap<String,String> item;//�s�ӫ~id�W��
	
	/*
	 * ��l��       ����إߧYŪ��        file���|�n��
	 * �ܩ�p��B�ztxt�����e�٤��T�w �n�A�Q��
	 */
	public Item(){
		item=new  HashMap<String,String>();
		
		for(int i = 1; i <= 100; i++){
			item.put("t"+i, "type"+i);
		}
	}
	
	
	/*
	 * ���o�Ҧ��ӫ~��key�� �^�Ǥ@set���e���Ҧ��ӫ~key
	 */
	public Set<String> getitemk(){
		return item.keySet();
	}
	
	/*
	 * �P�W �u�Okey��value
	 */
	public String getitemv(String k){
		return item.get(k);
	}
	
	/*
	 * ���o����s�ӫ~�� hashmap
	 */
	public HashMap<String,String> GetItem(){
		return item;
	}
	
	/*
	 * �s�W�@�ӫ~ k��key�� �i��Oid v��value�i��O�W��
	 */
	public void add(String k,String v){
		item.put(k, v);
	}
	
	/*
	 * �����̰ӫ~ k��key v��value
	 */
	public void remove(String k,String v){
		item.remove(k, v);
	}
}
