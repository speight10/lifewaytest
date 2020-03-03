package com.lifeway.lifewaytest.Impl;

import com.lifeway.lifewaytest.Interface.MessageService;
import com.lifeway.lifewaytest.Model.Count;
import com.lifeway.lifewaytest.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.StringTokenizer;

@Component
public class MessageImpl implements MessageService {

    @Autowired
    private Message messagebean;

    @Autowired
    private Count count;


    @Override
    public Count count(String id, String message) {


        StringTokenizer st = new StringTokenizer(message);
        int length=st.countTokens();
        System.out.println("token count "+st.countTokens());
        HashMap <String,String> map= new HashMap();


        if (messagebean.getMap()!=null )
        {
            map=messagebean.getMap();
            if (map.containsKey(id)){
                throw new IllegalStateException("Map already contains key "+id);}
            return mapCount(map,id,message,length);

        }
        return mapCount(map,id,message,length);
    }


public Count mapCount (HashMap <String,String> map, String id, String message,int length )
    {
        map.put(id,message);
        messagebean.setMap(map);
        int number=length+count.getCount();
        count.setCount(number);
        return count;
    }


}
