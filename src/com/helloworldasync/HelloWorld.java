package com.helloworldasync;

import com.helloworldasync.Main;

public class HelloWorld {
	public void printHello(){
        System.out.print("Hello ");
        Main.count1++;
        
    }
    
    public void printWorld(){
        System.out.print("World ");
        Main.count2++;
    }
}
