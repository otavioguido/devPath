package modules.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Chat {
  private final String id = UUID.randomUUID().toString();
  protected List<Message> messages = new ArrayList<Message>();

  public List<Message> getMessages() {
    return this.messages;
  }
}
