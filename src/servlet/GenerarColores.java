package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerarColores
 */

public class GenerarColores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String[] respuesta = new String[] { "Enhorabuena campeón",
			"Perfecto", "De p.m.", "Sigue así" };
	public String[] colores = new String[] { "red", "blue", "green", "black",
			"yellow", "lime", "fuchsia", "lightgreen", "orange", "teal" };
	static public Integer contred = 2;
	static public Integer contblue = 2;
	static public Integer contgreen = 2;
	static public Integer contblack = 2;
	static public Integer contyellow = 2;
	static public Integer contlime = 2;
	static public Integer contfuchsia = 2;
	static public Integer contorange = 2;
	static public Integer contlightgreen = 2;
	static public Integer contteal = 2;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GenerarColores() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		generarColores(request, response);

	}

	private void generarColores(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		int numCeldas = 20;

		boolean colorValido = false;
		PrintWriter out = null;
		response.setContentType("text/xml");
		response.setCharacterEncoding("UTF-8");

		String color = "";

		out = response.getWriter();

		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

		out.println("<tablatotal>");

		for (int i = 0; i < numCeldas; i++) // para generar el xml con distintos
											// colores
		// 4 repeticiones de cada color

		{

			while (!colorValido) // valido los colores
			{
				color = colores[new Random().nextInt(colores.length)]; // genero
																		// uno
																		// aleatorio
				colorValido = comprobarColor(color);
			}
			colorValido = false;

			// String colorValido = contarColores (color);
			out.println("<celda>");
			out.println("<color>" + color + "</color>");
			// out.println("<nombreemp>"+ rs.getString(2)+"</nombreemp>");
			out.println("</celda>");
		}
		out.println("</tablatotal>");

		// inicializo las variables una vez que se rellena
		contred = 2;
		contblue = 2;
		contgreen = 2;
		contblack = 2;
		contyellow = 2;
		contlime = 2;
		contfuchsia = 2;
		contorange = 2;
		contlightgreen = 2;
		contteal = 2;

	}

	private boolean comprobarColor(String color) {

		boolean valido = false;

		// compruebo el color y voy descontando del total de 4 que puedo de cada
		// uno
		switch (color) {
		case "red":
			if (contred == 0) {
				System.out.println("ya no quedan rojos");
			} else {
				valido = true;
				contred--;
			}

			break;
		case "orange":
			if (contorange == 0) {
				System.out.println("ya no quedan azules");
			} else {
				valido = true;
				contorange--;
			}

			break;
		case "green":
			if (contgreen == 0) {
				System.out.println("ya no quedan verdes");
			} else {
				valido = true;
				contgreen--;
			}

			break;
		case "lightgreen":
			if (contlightgreen == 0) {
				System.out.println("ya no quedan negros");
			} else {
				valido = true;
				contlightgreen--;
			}

			break;
		case "teal":
			if (contteal == 0) {
				System.out.println("ya no quedan amarillos");
			} else {
				valido = true;
				contteal--;
			}

			break;

		case "lime":
			if (contlime == 0) {
				System.out.println("ya no quedan lime");
			} else {
				valido = true;
				contlime--;
			}

			break;
		case "blue":
			if (contblue == 0) {
				System.out.println("ya no quedan azules");
			} else {
				valido = true;
				contblue--;
			}

			break;
		case "fuchsia":
			if (contfuchsia == 0) {
				System.out.println("ya no quedan verdes");
			} else {
				valido = true;
				contfuchsia--;
			}

			break;
		case "black":
			if (contblack == 0) {
				System.out.println("ya no quedan negros");
			} else {
				valido = true;
				contblack--;
			}

			break;
		case "yellow":
			if (contyellow == 0) {
				System.out.println("ya no quedan amarillos");
			} else {
				valido = true;
				contyellow--;
			}

			break;

		default:
			break;
		}

		return valido;
	}

}
