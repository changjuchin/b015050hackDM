package test;


import java.util.LinkedList;
/*
 * �ʺA���� class   ���e�����˰ӫ~
 * �o��class������Ӥ��ӷ|�����Ψ� 
 */
public class dynamic {

	LinkedList<String> dynamicitem;//�s�Q���˪��ӫ~
	/*
	 * �]�w�ӱ��˪��M�� 
	 * �ǤJ��linkedlist<string> t�����w�M��
	 */
	cart cart;
	public void set(LinkedList<String> t){
		dynamicitem=t;
	}
	/*
	 * ���o���˲M�� 
	 * �^�ǭ�linkedlist<string>�Y�M��
	 */
	public LinkedList<String> getdynamic(){
		return dynamicitem;
	}
	/*
	 * �ǥ�index���o���˲M�椤�Y�@�ӫ~
	 */
	public String getbyindex(int t){
		return dynamicitem.get(t);
	}
}
