package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

/*
 * �ʪ���
 * 
 */
public class cart {

	HashMap<String,String> cart;//�s�ʪ�����������
	LinkedList<String> cartitemk;//��cart�ܹ����L�Υt�@�ؤ覡�skey  
	LinkedList<String> cartitemv;//�P�W �令value
	String ktmp;
	public cart(){
		cart=new HashMap<String,String>();
		cartitemk=new LinkedList<String>();
		cartitemv=new LinkedList<String>();
	}
	/*
	 * ���o�ʪ������Ҧ��ӫ~��key�� �^�Ǥ@set���e���Ҧ��ӫ~��key
	 */
	public Set<String> getcartk(String k){
		return cart.keySet();
	}
	/*
	 * ���o�ӫ~��value �ǥѤ@key
	 */
	public String getcartv(String k){
		return cart.get(k);
	}
	/*
	 * �s�W�@�ӫ~���ʪ����� k=�ӫ~key v=�ӫ~vlaue 
	 * �ǤJ�ʪ��W�hrule ���� 
	 * �B�z����o���ӱ��ˬƻ� �b���w�� dynamic
	 * dynamic�i�@���s���˰ӫ~���a��
	 * �R����U���s�ɸӨ�ƳQ�I�s�Y�P�ɱ�dynaimc��Ū�@���ӱ��ˤ���
	 */
	public void add(String k,String v,dynamic dynamic,rule rule){
		cart.put(k, v);
		cartitemk.add(k);
		cartitemv.add(v);
		
		for(String t:cartitemk){
			ktmp=t+" "+ktmp;
		}
		LinkedList<String> tmp=rule.get(ktmp);
		dynamic.set(tmp);
	}
	public HashMap<String,String> getcartall(){
		return cart;
	}
	/*
	 * �����ʪ������Ҧ��ӫ~ ��key
	 */
	public LinkedList<String> getcartitemk(){
		return cartitemk;
	}
	/*
	 * �P�W�令value
	 */
	public LinkedList<String> getcartitemv(){
		return cartitemv;
	}
	
}
