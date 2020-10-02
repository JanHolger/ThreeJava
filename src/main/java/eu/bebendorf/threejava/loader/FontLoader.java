package eu.bebendorf.threejava.loader;

import eu.bebendorf.threejava.path.Font;

public interface FontLoader {

    void load(String url, LoaderLoadCallback<Font> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<Font> onSuccess);

}
