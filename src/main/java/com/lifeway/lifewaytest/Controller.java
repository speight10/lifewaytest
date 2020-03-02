package com.lifeway.lifewaytest;


import com.lifeway.lifewaytest.Impl.MessageImpl;
import com.lifeway.lifewaytest.Model.Message;
import com.sun.swing.internal.plaf.synth.resources.synth_sv;
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
    {

return messageImpl.count(id ,message);
    }


    @RequestMapping("/error")
    public String handleError(Exception test) {
        //do something like logging
        System.out.println("error calles");
        return "error";
    }


    @Override
    public String getErrorPath() {
        return "error";
    }

}
