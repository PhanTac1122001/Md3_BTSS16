package com.ss16b1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Controller
public class HelloServlet extends HttpServlet {
   @GetMapping("/hello")
    public  String greeting(@RequestParam String name, Model model){
       return "hello";
   }
}