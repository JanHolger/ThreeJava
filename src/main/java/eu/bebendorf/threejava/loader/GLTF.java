package eu.bebendorf.threejava.loader;

import eu.bebendorf.threejava.camera.Camera;
import eu.bebendorf.threejava.objects.Group;
import eu.bebendorf.threejava.animation.AnimationClip;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface GLTF extends JSObject {

    @JSProperty
    AnimationClip[] getAnimations();
    @JSProperty
    Group getScene();
    @JSProperty
    Group[] getScenes();
    @JSProperty
    Camera[] getCameras();

}
