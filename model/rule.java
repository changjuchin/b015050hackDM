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
	LinkedList<String> most;//�̱`�X�{�����~ 
	/*
	 * ��l�� ���� 
	 * 
	 */
	public rule() throws IOException   {
		//most=new LinkedList<String>();
		 rule=new HashMap<String,LinkedList<String>>();
		 most=new LinkedList<String>();
		 most.add("t");
		 LinkedList<String> k=new LinkedList<String>();
		 k.add("tt");
		 rule.put("t", k);// t/tt
	}
	/*
	 * ���o�b�Y�@�ʪ���   ���ʪ��W�h�W�w�i�઺�ʶR���~   
	 * �^�Ǥ@linkedlist<string> ���e�����ʪ��W�h�W�w���ӫ~  
	 */
	public LinkedList<String> get(String k){
		LinkedList<String> list;
		if(rule.containsKey(k)){
			list=rule.get(k);
			for(int i=0;list.size()<3;i++){
				list.add(most.get(i));
			}
		return list;
		}
		else{
			//LinkedList<String> most=new LinkedList<String>();
			//most.add("t");
			return most;
		}
	}
	
}
