package cn.tedu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//urlPatterns用来设置Servlet处理的请求路径
@WebServlet(name = "ServletHello",urlPatterns = "/hello")
public class
ServletHello extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到请求了!");
        //设置响应类型
        response.setContentType("text/html;charset=utf8");
        //获取输出对象
        PrintWriter pw = response.getWriter();
        //给浏览器输出数据
        pw.print("恭喜您访问成功!");
        //关闭资源
        pw.close();
    }
}
