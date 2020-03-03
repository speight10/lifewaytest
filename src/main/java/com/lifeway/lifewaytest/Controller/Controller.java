package com.lifeway.lifewaytest.Controller;


import com.lifeway.lifewaytest.Impl.MessageImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lifeway.lifewaytest.Model.Count;
import org.springframework.boot.web.servlet.error.ErrorController;
import io.swagger.annotations.Api;

@org.springframework.stereotype.Controller
public class Controller implements ErrorController  {

@Autowired
MessageImpl messageImpl;

    @ApiOperation(value = "Takes an Id and Message and counts words in message", response = String.class, tags = "message")
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
