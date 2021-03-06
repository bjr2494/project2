package edu.acc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondSentence")
public class SecondSentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("Art1", Article.getRandomArt());
		request.setAttribute("Noun1", Noun.getRandomNoun());
		request.setAttribute("Verb", Verb.getRandomVerb());
		request.setAttribute("Art2", Article.getRandomArt());
		request.setAttribute("Noun2", Noun.getRandomNoun());

		getServletContext().getRequestDispatcher("/WEB-INF/secondSent.jsp").forward(request, response);
	}

}
