package test;


import java.util.LinkedList;

/*
 * �ʪ���
 * 
 */
public class cart {


	LinkedList<String> cartitemk;//��cart�ܹ����L�Υt�@�ؤ覡�skey  
//	LinkedList<String> cartitemv;//�P�W �令value
	
	public cart(){

		cartitemk=new LinkedList<String>();
	//	cartitemv=new LinkedList<String>();
	}
	
	/*
	 * �s�W�@�ӫ~���ʪ����� k=�ӫ~key 
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
	 * �����ʪ������Ҧ��ӫ~ ��key
	 */
	public LinkedList<String> getcartitemk(){
		return cartitemk;
	}
	/*
	 * �����̰ӫ~key
	 */
	public void remove(String k){
		cartitemk.remove(k);
	}

	
}
