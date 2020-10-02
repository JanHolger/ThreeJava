package eu.bebendorf.threejava.loader;

import org.teavm.jso.dom.html.HTMLImageElement;

public interface ImageLoader extends Loader {

    void load(String url, LoaderLoadCallback<HTMLImageElement> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<HTMLImageElement> onSuccess);

}
