package eu.bebendorf.threejava.math;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Vector3 extends JSObject {

    @JSProperty
    float getX();
    @JSProperty
    void setX(float x);
    @JSProperty
    float getY();
    @JSProperty
    void setY(float y);
    @JSProperty
    float getZ();
    @JSProperty
    void setZ(float z);

    Vector3 add(Vector3 v);
    Vector3 clone();
    Vector3 copy(Vector3 v);
    Vector3 ceil();
    Vector3 clamp(Vector3 min, Vector3 max);
    Vector3 clampLength(float min, float max);
    float angleTo(Vector3 v);
    Vector3 applyQuaternion(Quaternion quaternion);
    Vector3 applyEuler(Euler euler);
    Vector3 applyMatrix3(Matrix3 m);
    Vector3 applyMatrix4(Matrix4 m);
    Vector3 applyNormalMatrix(Matrix3 m);
    Vector3 applyAxisAngle(Vector3 axis, float angle);
    Vector3 addVectors(Vector3 a, Vector3 b);
    Vector3 addScalar(float s);
    Vector3 addScaledVector(Vector3 v, float s);
    Vector3 clampScalar(float min, float max);
    Vector3 cross(Vector3 v);
    Vector3 crossVectors(Vector3 a, Vector3 b);
    float distanceTo(Vector3 v);
    float manhattanDistanceTo(Vector3 v);
    float distanceToSquared(Vector3 v);
    Vector3 divide(Vector3 v);
    Vector3 divideScalar(float s);
    float dot(Vector3 v);
    Vector3 floor();
    float getComponent(int index);
    float length();
    Vector3 multiply(Vector3 v);
    Vector3 multiplyScalar(float s);
    Vector3 multiplyVectors(Vector3 a, Vector3 b);
    Vector3 negate();
    Vector3 normalize();

}
