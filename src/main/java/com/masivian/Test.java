package com.masivian;

import javax.ws.rs.core.Response;

import entity.User;

public class Test {

	public static void main(String[] args) {
		System.out.println("Inicio aplicacion");
		
		System.out.println("GET");
		Consumer consumer = new Consumer();
		consumer.consumirccm();
		User user = consumer.getJsonUser(2);
		System.out.println(user.getEmail());
		System.out.println(user.getName());
		System.out.println(user.getAddress().getCity());
		
		System.out.println("POST");
		User user1 = new User();
		user1.setEmail("sergio.pina@masivian.com");
		user1.setId("12");
		user1.setName("sergio");
		Response response = consumer.createJsonUser(user);
		User readUser = response.readEntity(User.class);
		System.out.println(readUser.toString());
		System.out.println(response.getStatus());
	}

}
