package eu.bebendorf.threejava;

import eu.bebendorf.threejava.animation.AnimationMixer;
import eu.bebendorf.threejava.camera.Camera;
import eu.bebendorf.threejava.camera.PerspectiveCamera;
import eu.bebendorf.threejava.controls.OrbitControls;
import eu.bebendorf.threejava.geometry.BoxGeometry;
import eu.bebendorf.threejava.geometry.Geometry;
import eu.bebendorf.threejava.light.AmbientLight;
import eu.bebendorf.threejava.light.DirectionalLight;
import eu.bebendorf.threejava.loader.GLTFLoader;
import eu.bebendorf.threejava.material.Material;
import eu.bebendorf.threejava.material.MeshBasicMaterial;
import eu.bebendorf.threejava.math.Color;
import eu.bebendorf.threejava.math.Vector3;
import eu.bebendorf.threejava.renderer.WebGLRenderer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.xml.Node;

public class Three {

    @JSBody(script = "return new THREE.Scene()")
    public static native Scene Scene();

    @JSBody(script = "return new THREE.WebGLRenderer()")
    public static native WebGLRenderer WebGLRenderer();

    @JSBody(params = {"fov", "aspectRatio", "near", "far"}, script = "return new THREE.PerspectiveCamera(fov, aspectRatio, near, far)")
    public static native PerspectiveCamera PerspectiveCamera(float fov, float aspectRatio, float near, float far);

    @JSBody(script = "return new THREE.BoxGeometry()")
    public static native BoxGeometry BoxGeometry();

    @JSBody(params = {"parameters"}, script = "return new THREE.MeshBasicMaterial(parameters)")
    public static native MeshBasicMaterial MeshBasicMaterial(JSObject parameters);

    @JSBody(script = "return new THREE.MeshBasicMaterial()")
    public static native MeshBasicMaterial MeshBasicMaterial();

    @JSBody(params = {"geometry", "material"}, script = "return new THREE.Mesh(geometry, material)")
    public static native Mesh Mesh(Geometry geometry, Material material);

    @JSBody(script = "return new THREE.Vector3()")
    public static native Vector3 Vector3();

    @JSBody(params = {"x", "y", "z"}, script = "return new THREE.Vector3(x,y,z)")
    public static native Vector3 Vector3(float x, float y, float z);

    @JSBody(params = {"color"}, script = "return new THREE.Color(color)")
    public static native Color Color(int color);

    @JSBody(params = {"color"}, script = "return new THREE.Color(color)")
    public static native Color Color(String color);

    @JSBody(params = {"r", "g", "b"}, script = "return new THREE.Color(r, g, b)")
    public static native Color Color(float r, float g, float b);

    @JSBody(params = {"color", "intensity"}, script = "return new THREE.AmbientLight(color, intensity)")
    public static native AmbientLight AmbientLight(int color, float intensity);

    @JSBody(params = {"color", "intensity"}, script = "return new THREE.DirectionalLight(color, intensity)")
    public static native DirectionalLight DirectionalLight(int color, float intensity);

    @JSBody(params = {"camera", "node"}, script = "return new THREE.OrbitControls(camera,node)")
    public static native OrbitControls OrbitControls(Camera camera, Node node);

    @JSBody(script = "return new THREE.GLTFLoader()")
    public static native GLTFLoader GLTFLoader();

    @JSBody(params = {"mesh"}, script = "return new THREE.AnimationMixer(mesh)")
    public static native AnimationMixer AnimationMixer(Mesh mesh);

}
