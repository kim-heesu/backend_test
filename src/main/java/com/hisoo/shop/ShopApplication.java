package com.hisoo.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
		String lover = "김말자";
		final int wifeCount = 1;
		lover = "김희수";
		System.out.println(lover);

		Friend test = new Friend("kim", 10);
		Friend test2 = new Friend("park", 100);

		System.out.println(test.name);
		System.out.println(test2.name);

	}

}


class Friend {
	String name = "";
	int age =11;
	Friend(String name, int age){
		this.name = name;
		this.age = age;
	}
}
