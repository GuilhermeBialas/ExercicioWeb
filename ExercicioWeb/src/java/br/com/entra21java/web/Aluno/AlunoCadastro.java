package br.com.entra21java.web.Aluno;

import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Bialas
 */
@WebServlet(urlPatterns = "/aluno/cadastro")
public class AlunoCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("	<title>Alunos - Cadastro</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("	<form>");
        out.println("    <div id='campo-nome'>");
        out.println("        <label for='campo-nome'>Nome</label>");
        out.println("  	    <input type='text' name='nome' id='campo-nome'>");
        out.println("  	</div>");
        out.println("  	");
        out.println("  	<div id='codigo_matricula'></div>");
        out.println("  	    <label>Codigo da Matricula</label>");
        out.println("        <input type='number' name='codigo_matricula'>");
        out.println("    </div>");
        out.println("");
        out.println("    <div id='nota_1'>");
        out.println("        <label>Nota 1</label>");
        out.println("        <input type='number' name='nota_1'>");
        out.println("    </div>");
        out.println("");
        out.println("    <div id='nota_2'>");
        out.println("        <label>Nota 2</label>");
        out.println("        <input type='number' name='nota_2'>");
        out.println("    </div>");
        out.println("");
        out.println("    <div id='nota_3'>");
        out.println("        <label>Nota 3</label>");
        out.println("        <input type='number' name='nota_3'>");
        out.println("    </div>");
        out.println("");
        out.println("    <div id='frequencia'>");
        out.println("        <label>Frequencia</label>");
        out.println("        <input type='number' name='frequencia'>");
        out.println("    </div>");
        out.println(" </form>");
        out.println(" </body>");
        out.println("</html>");
    }
    
   
}
