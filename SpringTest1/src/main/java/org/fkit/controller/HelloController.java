package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.*;
/**
 * Created by xufuxiu on 2017/7/7.
 */
public class HelloController implements Controller
{
    private static final Log logger= LogFactory.getLog(HelloController.class);//可以作用于包外的独一无二的对象logger
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        logger.info("handRequest被调用");
        //mv对象包含视图名、模型名称以及模型对象
        ModelAndView mv=new ModelAndView();
        //添加模型数据，可以是任意的POJO对象。模型包含名为message的对象
        mv.addObject("message","Hello World");
        //返回的视图名，请求被转发到welcome.jsp
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
