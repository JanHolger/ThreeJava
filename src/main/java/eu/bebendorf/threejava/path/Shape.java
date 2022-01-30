package eu.bebendorf.threejava.path;

import eu.bebendorf.threejava.math.Vector3;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSArray;

public interface Shape extends JSObject {

    /**
     * Connects a LineCurve from .currentPoint to x, y onto the path.
     *
     * @param x
     * @param y
     */
    void lineTo(float x, float y);

    /**
     * Move the .currentPoint to x, y.
     *
     * @param x
     * @param y
     */
    void moveTo(float x, float y);
    
    /**
     * Returns an array of points representing a sequence of curves. The division parameter defines the number of pieces each curve is divided into. However, for optimization and quality purposes, the actual sampling resolution for each curve depends on its type. For example, for a LineCurve, the returned number of points is always just 2. 
     * 
     * divisions -- number of pieces to divide the curve into. Default is 5.
     * 
     * @param divisions
     * @return 
     */
    JSArray<Vector3> getPoints ( int divisions );
}
