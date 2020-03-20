package com.osilva.dataBase.controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.osilva.dataBase.models.IM;
import com.osilva.dataBase.models.User;
import com.osilva.dataBase.services.ImService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImController {
  
  @Autowired ImService imService;

  @PostMapping("/createIM")
  public Long createIM(@RequestBody ObjectNode json){
    /*User user1 = searchUserById((Long) json.get("user1").asLong());
    User user2 = searchUserById((Long) json.get("user2").asLong());*/

    IM im = new IM();
    /*im.getUsers().add(Long.toString(user1.getId()));
    im.getUsers().add(Long.toString(user2.getId()));*/
    imService.saveIm(im);
    /*user1.getIms().add(Long.toString(im.getId()));
    user2.getIms().add(Long.toString(im.getId()));
    imService.saveUser(user1);
    imService.saveUser(user2);*/
    return im.getId();
  }

  @GetMapping("/getIms")
  public Iterable<IM> getIMs(Iterable<Long> ids) { return imService.getImsFromUser(ids); }

  @GetMapping("/getAllIms")
  public Iterable<IM> getAllIms() { return imService.getAllIms(); }
}
