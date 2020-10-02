package eu.bebendorf.threejava.loader;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.ajax.XMLHttpRequest;

public interface GLTFLoader extends JSObject {

    void load(String url, GLTFSuccessHandler onSuccess, GLTFProgressHandler onProgress, GLTFErrorHandler onError);
    void load(String url, GLTFSuccessHandler onSuccess);

    @JSFunctor
    interface GLTFSuccessHandler extends JSObject {
        void onSuccess(GLTF gltf);
    }

    @JSFunctor
    interface GLTFProgressHandler extends JSObject {
        void onProgress(XMLHttpRequest xhr);
    }

    @JSFunctor
    interface GLTFErrorHandler extends JSObject {
        void onError(String error);
    }

}
