package com.book.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * This is service class holds the methods that has to be exposed
 * 
 * @author arifk2
 *
 */
@Path("/book")
public class BookService {

	/**
	 * This method is created to get the book information based on the isbn.
	 * 
	 * @param isbn
	 *            holds the information of the isbn
	 * @return
	 */
	@Path("/{isbn}")
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getBook(@PathParam("isbn") String isbn) {
		String output = null;
		if (isbn.equals("ISBN12")) {
			output = "Let us C";
		} else if (isbn.equals("ISBN123")) {
			output = "Java Programming";
		} else {
			output = "Invalid isbn ..!!";
		}
		return Response.status(200).entity(output).build();
	}
}
