package src.App.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Chat {
  private final String id = UUID.randomUUID().toString();
  private List<Message> messages = new ArrayList<>();

  public void addContent(String content){
    messages.add(new Message.Builder().setContent(content).build());
  }
}
