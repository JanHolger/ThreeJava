package eu.bebendorf.threejava.loader;

import org.teavm.jso.webaudio.AudioBuffer;

public interface AudioLoader extends Loader {

    void load(String url, LoaderLoadCallback<AudioBuffer> onLoad, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<AudioBuffer> onLoad);

}
