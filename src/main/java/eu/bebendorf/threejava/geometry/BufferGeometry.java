package eu.bebendorf.threejava.geometry;

import eu.bebendorf.threejava.math.Box3;
import eu.bebendorf.threejava.math.Vector3;
import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSArray;

public interface BufferGeometry extends Geometry {
    @JSProperty
    Box3 getBoundingBox();

    
    void computeBoundingBox();
    
    /**
     * Merge in another BufferGeometry with an optional offset of where to start merging in.
     * 
     * This fails to merge properly, use BufferGeometryUtils.merge instead
     */
    void merge ( BufferGeometry bufferGeometry, int offset);

    /**
     * Rotate the geometry about the X axis. This is typically done as a one time operation, and not during a loop. Use Object3D.rotation for typical real-time mesh rotation.
     * 
     * @param radians 
     */    
    void rotateX ( float radians );

    /**
     * Rotate the geometry about the Y axis. This is typically done as a one time operation, and not during a loop. Use Object3D.rotation for typical real-time mesh rotation.
     * 
     * @param radians 
     */    
    void rotateY ( float radians );
    
    /**
     * Rotate the geometry about the Z axis. This is typically done as a one time operation, and not during a loop. Use Object3D.rotation for typical real-time mesh rotation. 
     * 
     * @param radians 
     */    
    void rotateZ ( float radians );


    /**
     * Translate the geometry. This is typically done as a one time operation, and not during a loop. Use Object3D.position for typical real-time mesh translation. 
     */
    void translate ( float x, float y, float z);

    /**
     * Sets the attributes for this BufferGeometry from an array of points.
     * @param points 
     */    
    void setFromPoints ( JSArray<Vector3> points);

}
