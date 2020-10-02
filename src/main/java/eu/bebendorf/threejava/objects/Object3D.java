package eu.bebendorf.threejava.objects;

import eu.bebendorf.threejava.math.Euler;
import eu.bebendorf.threejava.math.Vector3;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Object3D extends JSObject {

    @JSProperty
    int getId();
    @JSProperty("uuid")
    String getUUID();
    @JSProperty
    String getName();
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
    @JSProperty("castShadow")
    boolean isCastingShadow();
    @JSProperty
    void setCastShadow(boolean castShadow);
    @JSProperty("receiveShadow")
    boolean isReceivingShadow();
    @JSProperty
    void setReceiveShadow(boolean receiveShadow);
    @JSProperty
    Object3D getParent();
    @JSProperty
    Object3D[] getChildren();
    void add(Object3D object);

}
