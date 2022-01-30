package eu.bebendorf.threejava.renderer;

import eu.bebendorf.threejava.scene.Scene;
import eu.bebendorf.threejava.camera.Camera;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.dom.html.HTMLCanvasElement;

public interface WebGLRenderer extends JSObject {

    void setSize(int width, int height);
    void render(Scene scene, Camera camera);
    @JSProperty
    HTMLCanvasElement getDomElement();
    
    @JSProperty
    boolean getAntialias();
    @JSProperty
    void setAntialias(boolean antialias);

}
