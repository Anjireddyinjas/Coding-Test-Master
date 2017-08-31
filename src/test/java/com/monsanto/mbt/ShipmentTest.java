package com.monsanto.mbt;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.List;

public class ShipmentTest {
	Shipment shipment;
	 List<Widget> widgets;
	
	@Before
	public void init() {
		shipment = new Shipment();
		widgets = WidgetUtils.getSampleWidgets();
		
	}
	

    @Test
    public void testShipment_Sorted_By_Color(){
        shipment.sortShipmentByColor(widgets);
        int count = 0;
        String name = null;
        for(Widget widget : widgets){
        	if(name = null || !widget.getColor()){
        		
        	}
        	
        }

    }

//    @Test
//    public void testShipment_Sorted_By_Date() {
//        shipment.sortShipmentByDate(widgets);
//        assertTrue(widgets.get(1).getProductionDate().before(widgets.get(widgets.size()-1).getProductionDate()));
//     }


}
