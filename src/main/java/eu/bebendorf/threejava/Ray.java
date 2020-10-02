package eu.bebendorf.threejava;

import eu.bebendorf.threejava.math.Box3;
import eu.bebendorf.threejava.math.Plane;
import eu.bebendorf.threejava.math.Sphere;
import eu.bebendorf.threejava.math.Vector3;
import org.teavm.jso.JSObject;

public interface Ray extends JSObject {

    Vector3 getOrigin();
    Vector3 getDirection();
    Ray clone();
    float distanceToPlane(Plane plane);
    float distanceToPoint(Vector3 point);
    Vector3 intersectBox(Box3 box);
    Vector3 intersectPlane(Plane plane);
    Vector3 intersectSphere(Sphere sphere);
    Vector3 intersectTriangle(Vector3 a, Vector3 b, Vector3 c, boolean backfaceCulling);
    boolean intersectsBox(Box3 box);
    boolean intersectsPlane(Plane plane);
    boolean intersectsSphere(Sphere sphere);

}
