package main;

import adapter.TigerAdapter;
import lion.Lion;
import lion.WhiteLion;
import tiger.BlackTiger;

public class mainClasss {

	public static void main(String[] args) {
		
        BlackTiger tiger = new BlackTiger();
        
        System.out.println("사자가....");
        tiger.fight();
        tiger.run();
        
        Lion lionAdapter = new TigerAdapter(tiger);
        
        WhiteLion lion = new WhiteLion(); 
        
        System.out.println("호랑이가...");
        testTiger(lion);

        System.out.println("아답타가....");
        testTiger(lionAdapter);
        
	}
	
	public static void testTiger(Lion lion){ 
		lion.fight();
		lion.run();
	}
}
