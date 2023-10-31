package com.example.study_survlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloWorldServlet")
public class HelloWorldServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("HelloWorldSurvlet - doGet()");
    try {
        String firstName = "valuable";
        String secondName= "named";
        PrintWriter printWriter = resp.getWriter();
        String contents = "<!DOCTYPE html>\r\n" + //
                "<html lang=\"en\">\r\n" + //
                "<head>\r\n" + //
                "    <meta charset=\"UTF-8\">\r\n" + //
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                "    <title>Hello World *^^*</title>\r\n" + //
                "</head>\r\n" + //
                "<body>\r\n" + //
                "    <div>first Name : "+firstName+" </div>\r\n" + //
                "    <div> Second Name :"+secondName+"</div>\r\n" + //
                "</body>\r\n" + //
                "</html>";
        printWriter.println(contents);
        printWriter.close();

        
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
    }
    System.out.println("HelloWorldServlet - doGet() done.");

    }
    
}
