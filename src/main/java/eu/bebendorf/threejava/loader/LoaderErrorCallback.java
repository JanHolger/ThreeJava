package eu.bebendorf.threejava.loader;

import org.teavm.jso.JSFunctor;

@JSFunctor
public interface LoaderErrorCallback {

    void onError(String error);

}
