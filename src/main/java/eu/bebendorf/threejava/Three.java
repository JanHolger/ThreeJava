package eu.bebendorf.threejava;

import eu.bebendorf.threejava.animation.AnimationAction;
import eu.bebendorf.threejava.animation.AnimationClip;
import eu.bebendorf.threejava.animation.AnimationMixer;
import eu.bebendorf.threejava.animation.tracks.*;
import eu.bebendorf.threejava.camera.Camera;
import eu.bebendorf.threejava.camera.CubeCamera;
import eu.bebendorf.threejava.camera.OrthographicCamera;
import eu.bebendorf.threejava.camera.PerspectiveCamera;
import eu.bebendorf.threejava.controls.*;
import eu.bebendorf.threejava.geometry.*;
import eu.bebendorf.threejava.helper.AxesHelper;
import eu.bebendorf.threejava.helper.CameraHelper;
import eu.bebendorf.threejava.helper.GridHelper;
import eu.bebendorf.threejava.light.*;
import eu.bebendorf.threejava.loader.*;
import eu.bebendorf.threejava.material.*;
import eu.bebendorf.threejava.math.*;
import eu.bebendorf.threejava.objects.*;
import eu.bebendorf.threejava.path.Shape;
import eu.bebendorf.threejava.renderer.WebGLCubeRenderTarget;
import eu.bebendorf.threejava.renderer.WebGLRenderer;
import eu.bebendorf.threejava.scene.Scene;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.xml.Node;

public class Three {

    // =========================================================
    // Constants
    // =========================================================

    public static final int CullFaceNone = 0;
    public static final int CullFaceBack = 2;
    public static final int CullFaceFront = 3;
    public static final int CullFaceFrontBack = 4;

    // =========================================================
    // Scene
    // =========================================================

    @JSBody(script = "return new THREE.Scene()")
    public static native Scene Scene();

    // =========================================================
    // Renderers
    // =========================================================

    @JSBody(script = "return new THREE.WebGLRenderer()")
    public static native WebGLRenderer WebGLRenderer();

    // =========================================================
    // Cameras
    // =========================================================

    @JSBody(params = {"fov", "aspectRatio", "near", "far"}, script = "return new THREE.PerspectiveCamera(fov,aspectRatio,near,far)")
    public static native PerspectiveCamera PerspectiveCamera(float fov, float aspectRatio, float near, float far);

    @JSBody(params = {"left", "right", "top", "bottom", "near", "far"}, script = "return new THREE.OrthographicCamera(left,right,top,bottom,near,far)")
    public static native OrthographicCamera OrthographicCamera(float left, float right, float top, float bottom, float near, float far);

    @JSBody(params = {"near", "far", "target"}, script = "return new THREE.PerspectiveCamera(near,far,target)")
    public static native CubeCamera CubeCamera(float near, float far, WebGLCubeRenderTarget target);

    // =========================================================
    // Geometries
    // =========================================================

    @JSBody(script = "return new THREE.PlaneGeometry()")
    public static native PlaneGeometry PlaneGeometry();

    @JSBody(params = {"width", "height" }, script = "return new THREE.PlaneGeometry(width,height)")
    public static native PlaneGeometry PlaneGeometry(float width, float height);

    @JSBody(script = "return new THREE.BufferGeometry()")
    public static native BufferGeometry BufferGeometry();

    /**
     * geometry — Any geometry object.
     * thresholdAngle — An edge is only rendered if the angle (in degrees) between the face normals of the adjoining faces exceeds this value. default = 1 degree. 
     */
    @JSBody(params = {"geometry", "thresholdAngle" }, script = "return new THREE.EdgesGeometry(geometry,thresholdAngle)")
    public static native EdgesGeometry EdgesGeometry(BufferGeometry geometry, int thresholdAngle);
    
    @JSBody(script = "return new THREE.BoxGeometry()")
    public static native BoxGeometry BoxGeometry();

    @JSBody(params = {"width", "height", "depth"}, script = "return new THREE.BoxGeometry(width,height,depth)")
    public static native BoxGeometry BoxGeometry(float width, float height, float depth);

    @JSBody(params = {"width", "height", "depth", "widthSegments", "heightSegments", "depthSegments"}, script = "return new THREE.BoxGeometry(width,height,depth,widthSegments,heightSegments,depthSegments)")
    public static native BoxGeometry BoxGeometry(float width, float height, float depth, int widthSegments, int heightSegments, int depthSegments);

    @JSBody(script = "return new THREE.CircleGeometry()")
    public static native CircleGeometry CircleGeometry();

    @JSBody(params = {"radius"}, script = "return new THREE.CircleGeometry(radius)")
    public static native CircleGeometry CircleGeometry(float radius);

    @JSBody(params = {"radius", "segments"}, script = "return new THREE.CircleGeometry(radius,segments)")
    public static native CircleGeometry CircleGeometry(float radius, int segments);

    @JSBody(params = {"radius", "segments", "thetaStart", "thetaEnd"}, script = "return new THREE.CircleGeometry(radius,segments,thetaStart,thetaEnd)")
    public static native CircleGeometry CircleGeometry(float radius, int segments, float thetaStart, float thetaEnd);

    @JSBody(script = "return new THREE.ConeGeometry()")
    public static native ConeGeometry ConeGeometry();

    @JSBody(params = {"radius", "height"}, script = "return new THREE.ConeGeometry(radius,height)")
    public static native ConeGeometry ConeGeometry(float radius, float height);

    @JSBody(params = {"radius", "height", "radialSegments"}, script = "return new THREE.ConeGeometry(radius,height,radialSegments)")
    public static native ConeGeometry ConeGeometry(float radius, float height, int radialSegments);

    @JSBody(params = {"radius", "height", "radialSegments", "openEnded"}, script = "return new THREE.ConeGeometry(radius,height,radialSegments,openEnded)")
    public static native ConeGeometry ConeGeometry(float radius, float height, int radialSegments, boolean openEnded);

    @JSBody(params = {"radius", "height", "radialSegments", "openEnded", "thetaStart", "thetaEnd"}, script = "return new THREE.ConeGeometry(radius,height,radialSegments,openEnded,thetaStart,thetaEnd)")
    public static native ConeGeometry ConeGeometry(float radius, float height, int radialSegments, boolean openEnded, float thetaStart, float thetaEnd);

    @JSBody(script = "return new THREE.CylinderGeometry()")
    public static native CylinderGeometry CylinderGeometry();

    @JSBody(params = {"radiusTop", "radiusBottom", "height"}, script = "return new THREE.CylinderGeometry(radiusTop,radiusBottom,height)")
    public static native CylinderGeometry CylinderGeometry(float radiusTop, float radiusBottom, float height);

    @JSBody(params = {"radiusTop", "radiusBottom", "height", "radialSegments"}, script = "return new THREE.CylinderGeometry(radiusTop,radiusBottom,height,radialSegments)")
    public static native CylinderGeometry CylinderGeometry(float radiusTop, float radiusBottom, float height, int radialSegments);

    @JSBody(params = {"radiusTop", "radiusBottom", "height", "radialSegments", "heightSegments"}, script = "return new THREE.CylinderGeometry(radiusTop,radiusBottom,height,radialSegments,heightSegments)")
    public static native CylinderGeometry CylinderGeometry(float radiusTop, float radiusBottom, float height, int radialSegments, int heightSegments);

    @JSBody(params = {"radiusTop", "radiusBottom", "height", "radialSegments", "heightSegments", "openEnded"}, script = "return new THREE.CylinderGeometry(radiusTop,radiusBottom,height,radialSegments,heightSegments,openEnded)")
    public static native CylinderGeometry CylinderGeometry(float radiusTop, float radiusBottom, float height, int radialSegments, int heightSegments, boolean openEnded);

    @JSBody(params = {"radiusTop", "radiusBottom", "height", "radialSegments", "heightSegments", "openEnded", "thetaStart", "thetaEnd"}, script = "return new THREE.CylinderGeometry(radiusTop,radiusBottom,height,radialSegments,heightSegments,openEnded,thetaStart,thetaEnd)")
    public static native CylinderGeometry CylinderGeometry(float radiusTop, float radiusBottom, float height, int radialSegments, int heightSegments, boolean openEnded, float thetaStart, float thetaEnd);

    @JSBody(script = "return new THREE.SphereGeometry()")
    public static native SphereGeometry SphereGeometry();

    @JSBody(params = {"radius"}, script = "return new THREE.SphereGeometry(radius)")
    public static native SphereGeometry SphereGeometry(float radius);

    @JSBody(params = {"radius", "widthSegments", "heightSegments"}, script = "return new THREE.SphereGeometry(radius,widthSegments,heightSegments)")
    public static native SphereGeometry SphereGeometry(float radius, int widthSegments, int heightSegments);

    @JSBody(params = {"radius", "widthSegments", "heightSegments", "phiStart", "phiEnd", "thetaStart", "thetaEnd"}, script = "return new THREE.SphereGeometry(radius,widthSegments,heightSegments,phiStart,phiEnd,thetaStart,thetaEnd)")
    public static native SphereGeometry SphereGeometry(float radius, int widthSegments, int heightSegments, float phiStart, float phiEnd, float thetaStart, float thetaEnd);

    @JSBody(params = {"text", "parameters"}, script = "return new TextGeometry(text,parameters)")
    public static native TextGeometry TextGeometry(String text, JSObject parameters);

    // =========================================================
    // Materials
    // =========================================================

    public static final int FrontSide = 0;
    public static final int BackSide = 1;
    public static final int DoubleSide = 2;
    
    @JSBody(params = {"parameters"}, script = "return new THREE.SpriteMaterial(parameters)")
    public static native SpriteMaterial SpriteMaterial(JSObject parameters);

    @JSBody(script = "return new THREE.SpriteMaterial()")
    public static native SpriteMaterial SpriteMaterial();

    @JSBody(params = {"parameters"}, script = "return new THREE.MeshBasicMaterial(parameters)")
    public static native MeshBasicMaterial MeshBasicMaterial(JSObject parameters);

    @JSBody(script = "return new THREE.MeshBasicMaterial()")
    public static native MeshBasicMaterial MeshBasicMaterial();

    @JSBody(params = {"parameters"}, script = "return new THREE.MeshStandardMaterial(parameters)")
    public static native MeshStandardMaterial MeshStandardMaterial(JSObject parameters);

    @JSBody(script = "return new THREE.MeshStandardMaterial()")
    public static native MeshStandardMaterial MeshStandardMaterial();

    @JSBody(params = {"parameters"}, script = "return new THREE.MeshPhongMaterial(parameters)")
    public static native MeshPhongMaterial MeshPhongMaterial(JSObject parameters);

    @JSBody(script = "return new THREE.MeshPhongMaterial()")
    public static native MeshPhongMaterial MeshPhongMaterial();

    @JSBody(params = {"parameters"}, script = "return new THREE.MeshToonMaterial(parameters)")
    public static native MeshToonMaterial MeshToonMaterial(JSObject parameters);

    @JSBody(script = "return new THREE.MeshToonMaterial()")
    public static native MeshToonMaterial MeshToonMaterial();

    @JSBody(params = {"parameters"}, script = "return new THREE.LineBasicMaterial(parameters)")
    public static native LineBasicMaterial LineBasicMaterial(JSObject parameters);
    
    // =========================================================
    // Objects
    // =========================================================

    @JSBody(params = {"material"}, script = "return new THREE.Sprite(material)")
    public static native Sprite Sprite(Material material);

    @JSBody(script = "return new THREE.Sprite()")
    public static native Sprite Sprite();

    @JSBody(params = {"geometry", "material"}, script = "return new THREE.Mesh(geometry, material)")
    public static native Mesh Mesh(Geometry geometry, Material material);

    @JSBody(params = {"geometry"}, script = "return new THREE.Mesh(geometry)")
    public static native Mesh Mesh(Geometry geometry);

    @JSBody(script = "return new THREE.Mesh()")
    public static native Mesh Mesh();

    @JSBody(params = {"geometry", "material"}, script = "return new THREE.Line(geometry, material)")
    public static native Line Line(BufferGeometry geometry, Material material);

    @JSBody(script = "return new THREE.Group()")
    public static native Group Group();

    @JSBody(params = {"geometry", "material", "count"}, script = "return new THREE.InstancedMesh(geometry,material,count)")
    public static native InstancedMesh InstancedMesh(Geometry geometry, Material material, int count);

    @JSBody(script = "return new THREE.Shape()")
    public static native Shape Shape();

    // =========================================================
    // Math
    // =========================================================

    @JSBody(script = "return new THREE.Vector3()")
    public static native Vector3 Vector3();

    @JSBody(params = {"x", "y", "z"}, script = "return new THREE.Vector3(x,y,z)")
    public static native Vector3 Vector3(float x, float y, float z);

    @JSBody(script = "return new THREE.Vector2()")
    public static native Vector2 Vector2();

    @JSBody(params = {"x", "y"}, script = "return new THREE.Vector2(x,y)")
    public static native Vector2 Vector2(float x, float y);

    @JSBody(script = "return new THREE.Euler()")
    public static native Euler Euler();

    @JSBody(params = {"x", "y", "z"}, script = "return new THREE.Euler(x,y,z)")
    public static native Euler Euler(float x, float y, float z);

    @JSBody(script = "return new THREE.Sphere()")
    public static native Sphere Sphere();

    @JSBody(params = {"center", "radius"}, script = "return new THREE.Sphere(center,radius)")
    public static native Sphere Sphere(Vector3 center, float radius);

    @JSBody(script = "return new THREE.Box3()")
    public static native Box3 Box3();

    @JSBody(params = {"min", "max"}, script = "return new THREE.Box3(min,max)")
    public static native Box3 Box3(Vector3 min, Vector3 max);

    @JSBody(params = {"color"}, script = "return new THREE.Color(color)")
    public static native Color Color(int color);

    @JSBody(params = {"color"}, script = "return new THREE.Color(color)")
    public static native Color Color(String color);

    @JSBody(params = {"r", "g", "b"}, script = "return new THREE.Color(r, g, b)")
    public static native Color Color(float r, float g, float b);

    @JSBody(params = {"a", "b", "c"}, script = "return new THREE.Triangle(a,b,c)")
    public static native Triangle Triangle(Vector3 a, Vector3 b, Vector3 c);

    // =========================================================
    // Lights
    // =========================================================

    @JSBody(params = {"color", "intensity"}, script = "return new THREE.AmbientLight(color,intensity)")
    public static native AmbientLight AmbientLight(int color, float intensity);

    @JSBody(params = {"color", "intensity"}, script = "return new THREE.DirectionalLight(color,intensity)")
    public static native DirectionalLight DirectionalLight(int color, float intensity);

    @JSBody(params = {"skyColor", "groundColor", "intensity"}, script = "return new THREE.HemisphereLight(skyColor,groundColor,intensity)")
    public static native HemisphereLight HemisphereLight(int skyColor, int groundColor, float intensity);

    @JSBody(params = {"color", "intensity"}, script = "return new THREE.PointLight(color,intensity)")
    public static native PointLight PointLight(int color, float intensity);

    @JSBody(params = {"color", "intensity", "distance"}, script = "return new THREE.PointLight(color,intensity,distance)")
    public static native PointLight PointLight(int color, float intensity, float distance);

    @JSBody(params = {"color", "intensity", "distance", "decay"}, script = "return new THREE.PointLight(color,intensity,distance,decay)")
    public static native PointLight PointLight(int color, float intensity, float distance, float decay);

    @JSBody(params = {"color", "intensity", "width", "height"}, script = "return new THREE.RectAreaLight(color,intensity,width,height)")
    public static native RectAreaLight RectAreaLight(int color, float intensity, float width, float height);

    @JSBody(params = {"color", "intensity"}, script = "return new THREE.SpotLight(color,intensity)")
    public static native SpotLight SpotLight(int color, float intensity);

    @JSBody(params = {"color", "intensity", "distance"}, script = "return new THREE.SpotLight(color,intensity,distance)")
    public static native SpotLight SpotLight(int color, float intensity, float distance);

    @JSBody(params = {"color", "intensity", "distance", "angle"}, script = "return new THREE.SpotLight(color,intensity,distance,angle)")
    public static native SpotLight SpotLight(int color, float intensity, float distance, float angle);

    @JSBody(params = {"color", "intensity", "distance", "angle", "penumbra"}, script = "return new THREE.SpotLight(color,intensity,distance,angle,penumbra)")
    public static native SpotLight SpotLight(int color, float intensity, float distance, float angle, float penumbra);

    @JSBody(params = {"color", "intensity", "distance", "angle", "penumbra", "decay"}, script = "return new THREE.SpotLight(color,intensity,distance,angle,penumbra,decay)")
    public static native SpotLight SpotLight(int color, float intensity, float distance, float angle, float penumbra, float decay);

    // =========================================================
    // Controls
    // =========================================================

    @JSBody(params = {"object", "node"}, script = "return new THREE.OrbitControls(object,node)")
    public static native OrbitControls OrbitControls(Object3D object, Node node);

    @JSBody(params = {"object", "node"}, script = "return new THREE.FlyControls(object,node)")
    public static native FlyControls FlyControls(Object3D object, Node node);

    @JSBody(params = {"object", "node"}, script = "return new THREE.DragControls(object,node)")
    public static native DragControls DragControls(Object3D object, Node node);

    @JSBody(params = {"object", "node"}, script = "return new THREE.FirstPersonControls(object,node)")
    public static native FirstPersonControls FirstPersonControls(Object3D object, Node node);

    // =========================================================
    // Loaders
    // =========================================================

    @JSBody(script = "return new THREE.GLTFLoader()")
    public static native GLTFLoader GLTFLoader();

    @JSBody(script = "return new THREE.OBJLoader()")
    public static native OBJLoader OBJLoader();

    @JSBody(script = "return new THREE.FileLoader()")
    public static native FileLoader FileLoader();

    @JSBody(script = "return new THREE.AudioLoader()")
    public static native AudioLoader AudioLoader();

    @JSBody(script = "return new FontLoader()")
    public static native FontLoader FontLoader();

    @JSBody(script = "return new THREE.ImageLoader()")
    public static native ImageLoader ImageLoader();

    @JSBody(script = "return new THREE.TextureLoader()")
    public static native TextureLoader TextureLoader();

    // =========================================================
    // Animations
    // =========================================================

    @JSBody(params = {"mesh"}, script = "return new THREE.AnimationMixer(mesh)")
    public static native AnimationMixer AnimationMixer(Mesh mesh);

    @JSBody(params = {"name", "times", "values"}, script = "return new THREE.BooleanKeyframeTrack(name,times,values)")
    public static native BooleanKeyframeTrack BooleanKeyframeTrack(String name, float[] times, Boolean[] values);

    @JSBody(params = {"name", "times", "values"}, script = "return new THREE.ColorKeyframeTrack(name,times,values)")
    public static native ColorKeyframeTrack ColorKeyframeTrack(String name, float[] times, Color[] values);

    @JSBody(params = {"name", "times", "values"}, script = "return new THREE.NumberKeyframeTrack(name,times,values)")
    public static native NumberKeyframeTrack NumberKeyframeTrack(String name, float[] times, Number[] values);

    @JSBody(params = {"name", "times", "values"}, script = "return new THREE.QuaternionKeyframeTrack(name,times,values)")
    public static native QuaternionKeyframeTrack QuaternionKeyframeTrack(String name, float[] times, Quaternion[] values);

    @JSBody(params = {"name", "times", "values"}, script = "return new THREE.StringKeyframeTrack(name,times,values)")
    public static native StringKeyframeTrack StringKeyframeTrack(String name, float[] times, String[] values);

    @JSBody(params = {"name", "times", "values"}, script = "return new THREE.VectorKeyframeTrack(name,times,values)")
    public static native VectorKeyframeTrack VectorKeyframeTrack(String name, float[] times, Vector3[] values);

    // =========================================================
    // Helpers
    // =========================================================

    @JSBody(params = {"size"}, script = "return new THREE.AxesHelper(size)")
    public static native AxesHelper AxesHelper(float size);

    @JSBody(params = {"size", "divisions"}, script = "return new THREE.GridHelper(size,divisions)")
    public static native GridHelper GridHelper(float size, int divisions);

    @JSBody(params = {"camera"}, script = "return new THREE.CameraHelper(camera)")
    public static native CameraHelper CameraHelper(Camera camera);
}
