package com.monsanto.mbt;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shipment {
	
	public void sortShipmentByDate(List<Widget> widgetList) {
		
		 Comparator<Widget> dateComparator = new Comparator<Widget>() {

			 public int compare(Widget obj1, Widget obj2) {
				 
			        if (obj1.getProductionDate().before(obj2.getProductionDate())) {
			            return -1;
			        } else if (obj1.getProductionDate().after(obj2.getProductionDate())) {
			            return 1;
			        } else {
			            return 0;
			        }        
			    }
		    };
		Collections.sort(widgetList,dateComparator);
	}
	
	public void sortShipmentByColor(List<Widget> widgetList) {
		Comparator<Widget> colorComparator = new Comparator<Widget>() {

			 public int compare(Widget obj1, Widget obj2) {
				 
			        if (obj1 == null || obj1.getColor() == null) {
			            return -1;
			        }
			        
			        if(obj2 == null || obj2.getColor() == null){
			        	return 1;
			        }
			        
			        if(obj1.getColor().equals(obj2.getColor())){
			        	return 0;
			        }
			        
			       return obj1.getColor().compareTo(obj2.getColor());    
			    }
		    };
		Collections.sort(widgetList, colorComparator);
		
	}





}
