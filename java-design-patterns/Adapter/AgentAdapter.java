// File: AgentAdapter.java
// Adapter converts external AgentAPI format into internal Agent object

// Internal model
class Agent {
    String id;
    String fullName;
    String mobile;

    public void display() {
        System.out.println(id + " | " + fullName + " | " + mobile);
    }
}

// External API JSON format
class ExternalAgentAPI {
    public String getData() {
        return "{id:'A101',name:'Ravi Kumar',phone:'99999XXXX'}";
    }
}

// Adapter: converts external → internal
class AgentAdapter {
    ExternalAgentAPI api = new ExternalAgentAPI();

    public Agent convert() {
        Agent a = new Agent();
        a.id = "A101";            // assume parsed
        a.fullName = "Ravi Kumar";
        a.mobile = "99999XXXX";
        return a;
    }
}

public class AgentAdapterDemo {
    public static void main(String[] args) {
        Agent agent = new AgentAdapter().convert();
        agent.display();
    }
}
