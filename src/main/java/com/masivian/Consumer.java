package com.masivian;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.User;

public class Consumer {

	public Consumer() {
	}
	
	
	public void consumirccm() {	
//		Client client = ClientBuilder.newClient().register(new JacksonFeature());
//		User user = new User();
//		user.setUsername("");
//		Persona persona = client
//		.target("http://localhost:3000/persona/pepe")
//		.request(MediaType.APPLICATION_JSON).get(Persona.class);
//		 
//		System.out.println(persona.getNombre());
//		System.out.println(persona.getApellidos());
//		System.out.println(persona.getEdad());
	}
	
    private static final String REST_URI 
    = "https://jsonplaceholder.typicode.com/users";

  private Client client = ClientBuilder.newClient();

  public User getJsonUser(int id) {
      return client
        .target(REST_URI)
        .path(String.valueOf(id))
        .request(MediaType.APPLICATION_JSON)
        .get(User.class);
  }
  
	public Response createJsonUser(User user) {
      return client.target(REST_URI)
    		  .request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(user, MediaType.APPLICATION_JSON));
  }
}
