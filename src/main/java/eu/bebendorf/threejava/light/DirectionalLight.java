package eu.bebendorf.threejava.light;

import eu.bebendorf.threejava.math.Vector3;
import org.teavm.jso.JSProperty;

public interface DirectionalLight extends Light {

    @JSProperty
    Vector3 getPosition();

}
