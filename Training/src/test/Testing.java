package test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import text.Task;

public class Testing implements Comparable<Testing> {
	
	private String sss;
	
	@Override
	public String toString() {
		return sss;
	}

	private final static String stroka1="Get the latest BBC World News: :international, news, features and analysis from Africa!";
	private final static String stroka2="test1 test2 test3";
	private final static String stroka3="Get zzz zzzz the THE THE the latest BBC World News: international news, features and analysis from Africa!";

	public Testing(String sss) {
		this.setSss(sss);
	}

	public Testing() {		
	}

	public static void main(String[] args) {	
		System.out.println("task 1:\t\t\t\t\t"+getWordWithMaxLength(stroka1));
		System.out.println("task 2:\t\t\t\t\t"+changeWordsOrder(stroka2));
		System.out.println("task 3.1 own developed method:\t\t"+sortAlpabetically(stroka3));
		System.out.println("task 3.2 preset String comparator:\t"+sortAlpabetically2(stroka3));
		System.out.println("task 3.3 Comparator:\t\t\t"+new Testing().sortAlpabetically3(stroka3));
		System.out.println("task 3.4 Comparable:\t\t\t"+new Testing().sortAlpabetically4(stroka3));
	}
	
	static String getWordWithMaxLength(String s) {
		if (s==null)
				return null;
		String result="";
		String [] arr=s.split("[\\W]+");
		for(String word:arr) {
			if(word.length()>result.length())
				result=word;
		}
		return result;
	}
	
	static String changeWordsOrder(String s) {
		if (s==null)
			return null;
		StringBuffer buffResult=new StringBuffer();
		String [] arr=s.split("[\\W]+");
		for(int i=arr.length-1;i>=0;i--)		
				buffResult.append(arr[i]).append(" ");
		return buffResult.toString().trim();
	}
	
	static String sortAlpabetically(String s) {
		if (s==null)
			return null;
		String [] arr=s.split("[\\W]+");
		String [] arrNew=new String [arr.length];
		int counter=0;
		String initTargetValue=(String)getLexicographicObject(arr);
		for(int i=0;i<arr.length;i++) {
			String targetValue=initTargetValue;
			boolean isFound=false;
			for(int j=0;j<arr.length;j++) {				
				String actValue=arr[j];
				if (isUsed(arrNew,actValue))
					continue;				
				if(actValue.compareToIgnoreCase(targetValue)<=0) {
					targetValue=actValue;
					isFound=true;
				}
			}				
			if (isFound || i==0)
				arrNew[counter++]=targetValue;			
		}
		arrNew=Arrays.copyOf(arrNew, counter);
		return Arrays.toString(arrNew);		
	}
	
	private static boolean isUsed(Object [] objArr, Object obj) {
		if (objArr==null || obj==null)
			return false;		
		for (Object object : objArr) {
			if (object==null)
				continue;
			if (object.toString().compareToIgnoreCase(obj.toString())==0){
				return true;
			}
		}		
		return false;
	}
	
	private static Object getLexicographicObject(Object [] objArr) {
		if (objArr==null)
			return null;
		Object temp=objArr[0];
		for (Object object : objArr) {
			if (object==null)
				continue;
			if (object.toString().compareToIgnoreCase(temp.toString())>0)
				temp=object;
		}
		return temp;
	}
	
	private static String sortAlpabetically2(String s) {
		if (s==null)
			return null;
		String [] arr=s.split("[\\W]+");
		
		Set<String> list=new TreeSet(String.CASE_INSENSITIVE_ORDER); 
		
		for (String str : arr) {
			list.add(str);
		}
		return list.toString();
	}
	
	private String sortAlpabetically3(String s) {
		if (s==null)
			return null;
		String [] arr=s.split("[\\W]+");		
		Task comparator=new Task();
		Set<String> list=new TreeSet(comparator);
		for(String str: arr){
			list.add(str);
		}
		return list.toString();		
	}
	
	private String sortAlpabetically4(String s) {
		if (s==null)
			return null;
		String [] arr=s.split("[\\W]+");
		
		Set<Testing> set=new TreeSet();
		
		for (String str : arr) {
			set.add(new Testing(str));
		}
		
		
		
		return Arrays.toString(set.toArray());		
		
	}

	@Override
	public int compareTo(Testing o) {
		return this.getSss().compareToIgnoreCase(o.getSss());
	}

	public String getSss() {
		return sss;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}	
	
}
