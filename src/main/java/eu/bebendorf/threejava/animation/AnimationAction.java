package eu.bebendorf.threejava.animation;

import eu.bebendorf.threejava.objects.Object3D;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface AnimationAction extends JSObject {

    @JSProperty
    boolean isClampWhenFinished();
    @JSProperty
    void setClampWhenFinished(boolean clampWhenFinished);
    @JSProperty
    boolean isEnabled();
    @JSProperty
    void setEnabled(boolean enabled);
    @JSProperty
    boolean isPaused();
    @JSProperty
    void setPaused(boolean paused);

    AnimationClip getClip();
    AnimationMixer getMixer();
    Object3D getRoot();
    AnimationAction play();
    AnimationAction stop();
    AnimationAction reset();
    AnimationAction halt(float durationInSeconds);
    AnimationAction setLoop(int mode, int repetitions);
    AnimationAction setDuration(float durationInSeconds);


}
