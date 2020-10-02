package eu.bebendorf.threejava.loader;

public interface GLTFLoader extends Loader {

    void load(String url, LoaderLoadCallback<GLTF> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    void load(String url, LoaderLoadCallback<GLTF> onSuccess);

}
