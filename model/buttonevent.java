package test;

/*
 * �Y�ӫ��s�Q���U��
 * �۰ʷs�W�ӫ~���ʪ���     
 */
public class buttonevent {

	public buttonevent(){
		
	}
	/*
	 * cart�Y���������ʪ������� rule,dynamic�P�z
	 * k���ӫ~key v���ӫ~value
	 */
	public void button(cart cart,rule rule,dynamic dynamic,String k,String v){
		cart.add(k, v,dynamic,rule);
		
	}
	
}
