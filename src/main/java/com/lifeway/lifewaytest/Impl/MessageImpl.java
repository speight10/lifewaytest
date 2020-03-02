package com.lifeway.lifewaytest.Impl;

import com.lifeway.lifewaytest.Interface.MessageService;
import com.lifeway.lifewaytest.Model.Count;
import com.lifeway.lifewaytest.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MessageImpl implements MessageService {

    @Autowired
    Message messagebean;

    @Autowired
    Count count;


    @Override
    public Count count(String id, String message) {

        int length=message.split("\\w+").length;

        HashMap <String,String> map= new HashMap();



        if (messagebean.getMap()!=null )
        {
            map=messagebean.getMap();
            if (map.containsKey(id)){
                throw new IllegalStateException("Map already contains key 1");}
            map.put(id,message);
            messagebean.setMap(map);
            int number=length+count.getCount();
            count.setCount(number);

System.out.println("test");
        }
        map.put(id,message);
        messagebean.setMap(map);
        int number=length+count.getCount();
        count.setCount(number);


        return count;
    }
}
