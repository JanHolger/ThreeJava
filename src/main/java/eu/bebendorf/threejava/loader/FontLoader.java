package eu.bebendorf.threejava.loader;

import eu.bebendorf.threejava.path.Font;

import org.teavm.jso.JSObject;

public interface FontLoader extends JSObject {

    void load(String url, LoaderLoadCallback<Font> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<Font> onSuccess);

}
