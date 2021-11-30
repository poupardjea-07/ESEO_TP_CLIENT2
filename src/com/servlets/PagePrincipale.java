package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PagePrincipale")
public class PagePrincipale extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public PagePrincipale() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServéletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String host = "https://restcountries.com/v2";

		String param = "name";
		String wanted = "France";
		
		HttpResponse<JsonNode> rep = null;
		try {
			rep = (HttpResponse<JsonNode>) Unirest.get(host + "/" + param + "/" + wanted).asJson();
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    JsonParser jp = new JsonParser();
	    JsonElement je = jp.parse(rep.body().toString());
	    String jsonString = gson.toJson(je);
	    JsonArray json = je.getAsJsonArray();
	    JsonObject jsonO = (JsonObject) json.get(0);
	    
	    System.out.println("capitale : "+jsonO.get("capital"));
	    System.out.println(jsonString);*/
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pagePrincipale.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pagePrincipale.jsp").forward(request, response);
	}

}
