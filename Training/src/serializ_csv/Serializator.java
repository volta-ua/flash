package serializ_csv;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Serializator {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
	    productList.add(new Product(1, "Pen", 2.00, false));
	    productList.add(new Product(2, "TV", 300, true));
	    productList.add(new Product(3, "iPhone", 500, true));
	    writeToCSV(productList);

	}
	
	//European countries use ";" as 
    //CSV separator because "," is their digit separator
    private static final String CSV_SEPARATOR = ",";
    private static void writeToCSV(ArrayList<Product> productList)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("products.csv"), "UTF-8"));
            for (Product product : productList)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(product.getId() <=0 ? "" : product.getId());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(product.getName().trim().length() == 0? "" : product.getName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(product.getCostPrice() < 0 ? "" : product.getCostPrice());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(product.isVatApplicable() ? "Yes" : "No");
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
    
    public static final class Product{
    	private long id;
    	private String name;
    	private double costPrice;
    	private boolean vatApplicable;   	
    	
		public Product(long id, String name, double costPrice, boolean vatApplicable) {
			this.id = id;
			this.name = name;
			this.costPrice = costPrice;
			this.vatApplicable = vatApplicable;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getCostPrice() {
			return costPrice;
		}
		public void setCostPrice(double costPrice) {
			this.costPrice = costPrice;
		}
		public boolean isVatApplicable() {
			return vatApplicable;
		}
		public void setVatApplicable(boolean vatApplicable) {
			this.vatApplicable = vatApplicable;
		}    	 
    }

}
