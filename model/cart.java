package test1;

import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cart = new HashMap<String, Integer>();
	
	/**
	 * �s�W�@�ӫ~���ʪ�����
	 * @param k = �ӫ~key
	 * @param num = �ӫ~�ƶq
	 */
	public void Add(String k, int num){
		cart.put(k, num);
	}
	
	/**
	 * ���o�ʪ������Ҧ��ӫ~��key��ƶq
	 * @return cart
	 */
	public HashMap<String, Integer> GetCart(){
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
