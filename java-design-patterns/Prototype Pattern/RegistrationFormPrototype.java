// File: RegistrationFormPrototype.java
// Domain Prototype: clone registration template for new agents

class RegistrationForm implements Cloneable {
    String formTitle;
    String terms;
    boolean nomineeRequired;

    public RegistrationForm(String formTitle, String terms, boolean nomineeRequired) {
        this.formTitle = formTitle;
        this.terms = terms;
        this.nomineeRequired = nomineeRequired;
    }

    public RegistrationForm clone() {
        try { return (RegistrationForm) super.clone(); }
        catch (Exception e) { return null; }
    }

    public void show() {
        System.out.println(formTitle + " | NomineeRequired: " + nomineeRequired);
    }
}

public class RegistrationFormPrototype {
    public static void main(String[] args) {

        // Base template
        RegistrationForm baseForm =
                new RegistrationForm("Agent Registration", "Standard Terms", true);

        // Clone for special scheme
        RegistrationForm festivalForm = baseForm.clone();
        festivalForm.formTitle = "Festival Offer Registration";

        baseForm.show();
        festivalForm.show();
    }
}
