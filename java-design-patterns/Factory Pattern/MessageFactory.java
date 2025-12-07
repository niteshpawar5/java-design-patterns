// File: MessageFactory.java
// Program 2: Parameterized Factory Method

enum MessageType {
    TEXT, IMAGE, VIDEO
}

interface Message {
    void process();
}

class TextMessage implements Message {
    public void process() { System.out.println("Processing TEXT message"); }
}

class ImageMessage implements Message {
    public void process() { System.out.println("Processing IMAGE message"); }
}

class VideoMessage implements Message {
    public void process() { System.out.println("Processing VIDEO message"); }
}

class MessageFactory {
    /**
     * Factory method using Enum
     */
    public static Message getMessage(MessageType type) {
        switch (type) {
            case TEXT: return new TextMessage();
            case IMAGE: return new ImageMessage();
            case VIDEO: return new VideoMessage();
            default: throw new IllegalArgumentException("Invalid Type");
        }
    }
}

public class MessageDemo {
    public static void main(String[] args) {
        Message msg = MessageFactory.getMessage(MessageType.TEXT);
        msg.process();
    }
}
