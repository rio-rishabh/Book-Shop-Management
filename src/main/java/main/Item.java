package main;
public class Item{
    public String itemName;
    public int mrp;
    int i=0;
    public  void addItem(String itemName,int mrpItem){
        //write your code here
    	
    	this.itemName=itemName;
    	this.mrp=mrpItem;
    	i=i+1;
    	
    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
      
}
