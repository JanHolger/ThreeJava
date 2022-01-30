package eu.bebendorf.threejava.loader;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
@FunctionalInterface
public interface LoaderErrorCallback extends JSObject {

    void onError(String error);

}
