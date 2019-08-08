package main;
import java.util.ArrayList;
import java.util.List;

import main.Bill;
import main.Item;

public class Cart extends Bill{
    //one cart one bill
	int j,p;
    public List<Item> inCart = new ArrayList<Item>();
    public List<Integer> quant = new ArrayList<Integer>();
    public int noOfItems=0;
    public void updateCart(Item a,int q ){
      //write your code here
    	noOfItems=noOfItems+1;
      //------------
      //------------
    	inCart.add(a);
    	quant.add(q);
   

    }
    
    public int totalAmt=0;
    public void finalizeCart(String name){
        super.getBill(name);//make it outside
        for(int i=0;i<noOfItems;i++){
            System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
       j=inCart.get(i).mrp;
       p=quant.get(i);
        
        totalAmt = calcBill();
        
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
        }
    }
    public int calcBill() {
    	int total=0;
//    	write your code here!!!
//    	----------------------
    	for(int i=0;i<noOfItems;i++)
    	{
    		int x=0;
    		for(int j=0;j<quant.get(i);j++)
    		{
    			x=x+inCart.get(i).mrp;
    			
    		}
    		total=total+x;
    	}
    	
    	return total;
    	
    }
}