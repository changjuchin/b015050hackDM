import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cart = new HashMap<String, Integer>();
	
	/*
	 * �s�W�@�ӫ~���ʪ����� k = �ӫ~key, num = �ӫ~�ƶq 
	 */
	public void Add(String k, int num){
		cart.put(k, num);
	}
	
	/*
	 * ���o�ʪ������Ҧ��ӫ~�� key ��ƶq
	 */
	public HashMap<String, Integer> GetCart(){
		return cart;
	}
	
	/*
	 * �����@�ӫ~
	 */
	public void remove(String k){
		cart.remove(k);
	}
	
}
