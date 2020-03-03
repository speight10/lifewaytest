package com.lifeway.lifewaytest.Controller;


import com.lifeway.lifewaytest.Impl.MessageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lifeway.lifewaytest.Model.Count;
import org.springframework.boot.web.servlet.error.ErrorController;

@org.springframework.stereotype.Controller
public class Controller implements ErrorController  {

@Autowired
MessageImpl messageImpl;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    @ResponseBody
    public Count message ( @RequestParam("id") String id,@RequestParam("message") String message )
    { return messageImpl.count(id ,message);
    }


    @RequestMapping("/error")
    public String handleError(Exception test) {
        return "error";
    }


    @Override
    public String getErrorPath() {
        return "error";
    }

}
