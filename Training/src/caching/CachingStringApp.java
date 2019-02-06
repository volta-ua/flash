package caching;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class CachingStringApp {
	
	
	
	public static void main(String[] args) {
		
		String req=null,res;
		Map<String, String> base=new HashMap();
				
		while (!"8888".equals(req)) {
			try {
				req=JOptionPane.showInputDialog("Enter the value");
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
				req="";
			}
			System.out.print(req+"\t");
			
			if (base.containsKey(req))
				res=base.get(req);
			else {
				res=doSearch(req);
				base.put(req, res);
			}
			System.out.println(res);
		}
		
	}
	
	static String doSearch(final String searchReq) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "https://google.com.ua/search?find="+searchReq+"/";
	}

}
