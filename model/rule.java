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

	HashMap<String,LinkedList<String>> rule;//�s�ʪ��W�h
	/*
	 * ��l�� ����@���إߧYŪ�� file ���|�n�� ���Ū�٭n�Q�� 
	 * �i��i�H�B�z�ʶR2�إH�W�ӫ~�ӱ��ˤ��� �H�ʶR�F 1 ,2 ,3����
	 * key�i�H��  "1 2 3" 
	 */
	public rule() throws IOException   {
		
		 rule=new HashMap<String,LinkedList<String>>();
		 File d=new File("C:\\Users\\taoyi99\\Desktop\\eclipse\\list.txt");
			InputStreamReader reader = new InputStreamReader(  
	                new FileInputStream(d)); 
			BufferedReader t=new BufferedReader(reader);
			String tmp=t.readLine();
			for(;tmp!=null;){
			
				tmp=t.readLine();
			}
			t.close();
	}
	/*
	 * ���o�b�Y�@�ʪ���   ���ʪ��W�h�W�w�i�઺�ʶR���~   
	 * �^�Ǥ@linkedlist<string> ���e�����ʪ��W�h�W�w���ӫ~ 
	 */
	public LinkedList<String> get(String k){
		return rule.get(k);
	}
}
