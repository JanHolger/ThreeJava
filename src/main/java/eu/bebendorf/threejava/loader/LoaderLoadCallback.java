package eu.bebendorf.threejava.loader;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
@FunctionalInterface
public interface LoaderLoadCallback<T extends JSObject> extends JSObject {

    void onLoad(T data);

}
