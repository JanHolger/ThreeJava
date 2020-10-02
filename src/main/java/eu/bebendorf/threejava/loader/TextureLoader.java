package eu.bebendorf.threejava.loader;

import eu.bebendorf.threejava.texture.Texture;

public interface TextureLoader extends Loader {

    void load(String url, LoaderLoadCallback<Texture> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<Texture> onSuccess);

}
