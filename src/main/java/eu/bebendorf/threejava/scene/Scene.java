package eu.bebendorf.threejava.scene;

import eu.bebendorf.threejava.objects.Object3D;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Scene extends Object3D {

    @JSProperty
    FogLike getFog();
    @JSProperty
    void setFog(FogLike fog);
    @JSProperty
    JSObject getBackground();
    @JSProperty
    void setBackground(JSObject background);

}
