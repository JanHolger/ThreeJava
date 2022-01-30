package eu.bebendorf.threejava.loader;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.ajax.XMLHttpRequest;

@JSFunctor
@FunctionalInterface
public interface LoaderProgressCallback extends JSObject {

    // JSObject
    // XMLHttpRequest
    void onProgress(XMLHttpRequest xhr);

}
