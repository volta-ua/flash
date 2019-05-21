package model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemHolder {
	
	private Map<String,Item> itemsMap;
	
	ItemHolder(){
		itemsMap=new HashMap<String,Item>();
	}
	
	public void putItem(Item item) {
		
		if (item==null)
			return;
		
		itemsMap.put(item.getId(), item);

	}
	
	public List<Item> getItemsByName(String name) {
		
		List<Item> items=new ArrayList<>();
		
		for(Item item : itemsMap.values()) {
			if (item.getName().equals(name)) {
				items.add(item);
			}
		}
		
		return items;
		
	}

	
}
