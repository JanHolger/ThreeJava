package eu.bebendorf.threejava.loader;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.ajax.XMLHttpRequest;

@JSFunctor
public interface LoaderProgressCallback {

    void onProgress(XMLHttpRequest xhr);

}
