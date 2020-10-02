package eu.bebendorf.threejava.animation;

import org.teavm.jso.JSObject;

public interface AnimationMixer extends JSObject {

    AnimationAction clipAction(AnimationClip clip);
    void update(float deltaSeconds);

}
