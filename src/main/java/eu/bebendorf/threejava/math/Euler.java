package eu.bebendorf.threejava.math;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Euler extends JSObject {

    @JSProperty
    float getX();
    @JSProperty
    void setX(float x);
    @JSProperty
    float getY();
    @JSProperty
    void setY(float y);
    @JSProperty
    float getZ();
    @JSProperty
    void setZ(float z);

}
