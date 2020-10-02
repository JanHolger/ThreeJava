package eu.bebendorf.threejava;

import eu.bebendorf.threejava.light.Light;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Scene extends JSObject {

    @JSProperty("uuid")
    String getUUID();

    void add(Mesh mesh);
    void add(Group group);
    void add(Light light);

}
