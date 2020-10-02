package eu.bebendorf.threejava.renderer;

import eu.bebendorf.threejava.Scene;
import eu.bebendorf.threejava.camera.Camera;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.dom.xml.Node;

public interface WebGLRenderer extends JSObject {

    void setSize(int width, int height);
    void render(Scene scene, Camera camera);
    @JSProperty
    Node getDomElement();

}
