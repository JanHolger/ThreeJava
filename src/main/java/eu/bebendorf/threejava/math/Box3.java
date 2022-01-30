package eu.bebendorf.threejava.math;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Box3 extends JSObject {
    
    @JSProperty
    void setMin(Vector3 v);
    @JSProperty
    Vector3 getMin();

    @JSProperty
    void setMax(Vector3 v);
    @JSProperty
    Vector3 getMax();
}
