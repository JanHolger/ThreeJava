package eu.bebendorf.threejava.animation.tracks;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface KeyframeTrack extends JSObject {

    @JSProperty
    String getName();
    @JSProperty
    float[] getTimes();

}
