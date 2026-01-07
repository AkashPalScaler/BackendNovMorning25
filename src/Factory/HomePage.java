package Factory;

import Factory.UIComponents.Button;
import Factory.UIComponents.Checkbox;
import Factory.UIComponents.Div;

import java.util.Dictionary;

public class HomePage {
    Flutter f;

    public HomePage(Flutter f) {
        this.f = f;
    }

    void render(){
        UIFactory factory = f.createUIFactory();

        Button b = factory.createButton();
        Checkbox c = factory.createCheckbox();
        Div d = factory.createDiv();
        b.render();
        b.click();
        c.render();
        d.render();
    }
}
