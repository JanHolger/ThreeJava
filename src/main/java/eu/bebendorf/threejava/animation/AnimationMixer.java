package eu.bebendorf.threejava.animation;

import eu.bebendorf.threejava.objects.Object3D;
import org.teavm.jso.JSObject;

public interface AnimationMixer extends JSObject {

    AnimationAction clipAction(AnimationClip clip);
    AnimationAction existingAction(AnimationClip clip);
    void update(float deltaTimeInSeconds);
    Object3D getRoot();
    AnimationMixer stopAllAction();

}
