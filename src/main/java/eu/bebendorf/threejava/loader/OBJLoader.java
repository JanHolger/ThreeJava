package eu.bebendorf.threejava.loader;

import eu.bebendorf.threejava.objects.Object3D;

public interface OBJLoader extends Loader {

    void load(String url, LoaderLoadCallback<Object3D> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<Object3D> onSuccess);

}
