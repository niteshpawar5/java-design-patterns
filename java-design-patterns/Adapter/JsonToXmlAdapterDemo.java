// File: JsonToXmlAdapterDemo.java
// Adapter converts JSON input to XML format

interface XmlService {
    void sendXml(String xml);
}

// Adaptee: gives JSON output
class JsonService {
    public String getJson() {
        return "{name:'Nitesh', age:25}";
    }
}

// Adapter converts JSON → XML
class JsonToXmlAdapter implements XmlService {
    JsonService jsonService = new JsonService();

    public void sendXml(String xml) {
        System.out.println("Sending XML: " + xml);
    }

    public void sendXmlConverted() {
        String json = jsonService.getJson();
        String xml = "<data>" + json + "</data>";  // basic conversion   
        sendXml(xml);
    }
}

public class JsonToXmlAdapterDemo {
    public static void main(String[] args) {
        JsonToXmlAdapter adapter = new JsonToXmlAdapter();
        adapter.sendXmlConverted();
    }
}
