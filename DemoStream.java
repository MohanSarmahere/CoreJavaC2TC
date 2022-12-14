package com.tns.lambdademo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DemoStream {

	public static void main(String[] args) {
		List<Item> ll=new ArrayList<Item>();
		
		ll.add(new Item(111,"Samsung TV",79000));
		ll.add(new Item(222,"Lenovo LP",65000));
		ll.add(new Item(333,"Tablet",25000));
		ll.add(new Item(444,"iPod",15000));
		ll.add(new Item(555,"xBox",50000));
		
	//	ArrayList<Double> IP=new ArrayList<Double>();
		
	//		for(Item item.IP) {
	//				if(item.getPrice()>30000) {
	//				IP.add(item.getPrice());
	//		}
	//	}
	//	for(Double ip:IP) {
	//	System.out.println(ip);
	//	}
			
		ArrayList<Double> IP=(ArrayList<Double>) ll.stream().filter((item)-> item.getPrice()>30000)
					.map((item)->item.getPrice()).collect(Collectors.toList());
			IP.forEach((item)->System.out.println(item));

	}

}
