package hackDM;

import java.util.HashMap;

public class Cart {

	private HashMap<String, String> cart = new HashMap<String, String>();
	
	/**
	 * �s�W�@�ӫ~���ʪ�����
	 * @param k = �ӫ~key
	 * @param num = �ӫ~�ƶq
	 */
	public void Add(String k, String num){
		cart.put(k, num);
	}
	
	/**
	 * ���o�ʪ������Ҧ��ӫ~��key��ƶq
	 * @return cart
	 */
	public HashMap<String, String> GetCart(){
		return cart;
	}
	
	/**
	 * �����ʪ��������@�ӫ~
	 * @param k = �ӫ~key
	 */
	public void Remove(String k){
		cart.remove(k);
	}
	
}
