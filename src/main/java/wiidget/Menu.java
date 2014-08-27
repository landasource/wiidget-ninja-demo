package wiidget;

import com.landasource.wiidget.commons.Raw;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Menu extends Raw {

    @Override
    public void init() {
        super.init();
        setAttribute("class", "list-group");
    }

    @Override
    public String getRawTagName() {
        return "div";
    }

}
