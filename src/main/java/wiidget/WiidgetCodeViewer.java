package wiidget;

import com.landasource.wiidget.ResourceWiidget;
import com.landasource.wiidget.Tag;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.parser.resource.FileWiidgetResource;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class WiidgetCodeViewer extends Wiidget {

    private final DataMap data = new DataMap();

    private FileWiidgetResource wiidgetResource;

    @Override
    public void run() {
        super.run();

        final String filePath = wiidgetResource.getCanonicalFileName();

        startBuffer();
        wiidget(ResourceWiidget.class, data().set("context", data).set("fileName", filePath));

        write(Tag.tag("p", endBuffer())); // put content into quote

        write(Tag.tag("h3", "Source code"));
        write("<hr />");

        final String content = getFileContent(filePath);
        write(Tag.tag("pre", content));
    }

    @Override
    public void setAttribute(final String name, final Object value) {
        data.set(name, value);
    }

    /**
     * @return the wiidgetResource
     */
    public FileWiidgetResource getWiidgetResource() {
        return wiidgetResource;
    }

    /**
     * @param wiidgetResource
     *            the wiidgetResource to set
     */
    public void setWiidgetResource(final FileWiidgetResource wiidgetResource) {
        this.wiidgetResource = wiidgetResource;
    }

}
