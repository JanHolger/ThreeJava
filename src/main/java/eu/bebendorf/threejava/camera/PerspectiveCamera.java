package eu.bebendorf.threejava.camera;

import org.teavm.jso.JSProperty;

public interface PerspectiveCamera extends Camera {

    /**
     * Camera frustum aspect ratio, usually the canvas width / canvas height. Default is 1 (square canvas).
     * @return 
     */
    @JSProperty
    float getAspect();
    @JSProperty
    void setAspect(float aspect);

    /**
     * Updates the camera projection matrix. Must be called after any change of parameters. 
     */
    void updateProjectionMatrix();

}
