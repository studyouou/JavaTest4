//package org.ougen.exam1.intercept;
//
//
//import org.ougen.exam1.model.Customer;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
///**
// * Author: OuGen
// * Discription:
// * Date: 10:11 2019/7/26
// */
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        Customer customer = (Customer) session.getAttribute("customer");
//        if (customer==null){
//            request.getD
//        }
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
//        System.out.println("请求controller结束后，就到这里处理，如果带有@ResponseBody的话，不会等待处理完再返回" +
//                "那怎么办呢？");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        System.out.println("请求结束后到这里"+Thread.currentThread().getId());
//    }
//}
