package eu.bebendorf.threejava.math;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Triangle extends JSObject {
    @JSProperty
    Vector3 getA();
    @JSProperty
    void setA(Vector3 a);
    
    @JSProperty
    Vector3 getB();
    @JSProperty
    void setB(Vector3 y);
    
    @JSProperty
    Vector3 getC();
    @JSProperty
    void setC(Vector3 z);
}
