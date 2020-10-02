package eu.bebendorf.threejava.loader;

import org.teavm.jso.ajax.XMLHttpRequest;

public interface FileLoader extends Loader {

    XMLHttpRequest load(String url, LoaderLoadCallback<String> onSuccess, LoaderProgressCallback onProgress, LoaderErrorCallback onError);
    XMLHttpRequest load(String url, LoaderLoadCallback<String> onSuccess);

}
