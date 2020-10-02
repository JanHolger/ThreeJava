package eu.bebendorf.threejava;

import eu.bebendorf.threejava.objects.Object3D;
import org.teavm.jso.JSObject;

public interface Raycaster extends JSObject {

    Object3D[] intersectObject(Object3D object, boolean recursive);
    Object3D[] intersectObjects(Object3D[] object, boolean recursive);

}
