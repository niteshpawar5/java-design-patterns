// File: TextDecoratorDemo.java
// Decorator adds behaviors to Text object dynamically

interface Text {
    String format();
}

// Base class
class PlainText implements Text {
    public String format() { return "Hello World"; }
}

// Base Decorator
abstract class TextDecorator implements Text {
    protected Text text;
    public TextDecorator(Text text) { this.text = text; }
}

// Concrete Decorators
class BoldText extends TextDecorator {
    public BoldText(Text text) { super(text); }
    public String format() { return "<b>" + text.format() + "</b>"; }
}

class ItalicText extends TextDecorator {
    public ItalicText(Text text) { super(text); }
    public String format() { return "<i>" + text.format() + "</i>"; }
}

public class TextDecoratorDemo {
    public static void main(String[] args) {
        Text msg = new BoldText(new ItalicText(new PlainText()));
        System.out.println(msg.format());
    }
}
