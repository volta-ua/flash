package processing;

import database.Connector;
import model.ItemHolder;

public class Updater {

    private static Updater INSTANCE = null;
    
    private Updater() {
    	ItemHolder itemHolder=new ItemHolder();
    	System.out.println("launching connector");
    	Connector.printAllData();
    }
    
    public static Updater getInstance() {
        if (INSTANCE == null) {
            synchronized (Updater.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Updater();
                }
            }
        }
        System.out.println(777);
        return INSTANCE;
    }

	
}
