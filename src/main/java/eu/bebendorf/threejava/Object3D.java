package eu.bebendorf.threejava;

import eu.bebendorf.threejava.math.Euler;
import eu.bebendorf.threejava.math.Vector3;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Object3D extends JSObject {

    @JSProperty("uuid")
    String getUUID();
    @JSProperty
    Vector3 getPosition();
    @JSProperty
    void setPosition(Vector3 position);
    @JSProperty
    Euler getRotation();
    @JSProperty
    void setRotation(Euler rotation);
    @JSProperty
    Vector3 getScale();
    @JSProperty
    void setScale(Vector3 scale);
    @JSProperty
    boolean isVisible();
    @JSProperty
    void setVisible(boolean visible);
    @JSProperty
    Object3D getParent();
    @JSProperty
    Object3D[] getChildren();

}
