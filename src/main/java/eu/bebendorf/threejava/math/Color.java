package eu.bebendorf.threejava.math;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Color extends JSObject {

    @JSProperty("r")
    float getRed();
    @JSProperty("r")
    void setRed(float r);
    @JSProperty("g")
    float getGreen();
    @JSProperty("g")
    void setGreen(float g);
    @JSProperty("b")
    float getBlue();
    @JSProperty("b")
    void setBlue(float b);

}
