package eu.bebendorf.threejava;

import eu.bebendorf.threejava.geometry.BufferGeometry;
import org.teavm.jso.JSBody;
import org.teavm.jso.core.JSArray;

public class BufferGeometryUtils {

    @JSBody(params = {"geometries", "useGroups"}, 
            script = "return BufferGeometryUtils.mergeBufferGeometries(geometries,useGroups)")
    public static native BufferGeometry mergeBufferGeometries ( JSArray<BufferGeometry> geometries, boolean useGroups);
}
