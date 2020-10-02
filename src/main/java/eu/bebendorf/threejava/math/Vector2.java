package eu.bebendorf.threejava.math;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface Vector2 extends JSObject {

    @JSProperty
    float getX();
    @JSProperty
    void setX(float x);
    @JSProperty
    float getY();
    @JSProperty
    void setY(float y);

    Vector2 add(Vector2 v);
    Vector2 clone();
    Vector2 copy(Vector2 v);
    Vector2 ceil();
    Vector2 clamp(Vector2 min, Vector2 max);
    Vector2 clampLength(float min, float max);
    float angle();
    Vector2 applyMatrix3(Matrix3 m);
    Vector2 addVectors(Vector2 a, Vector2 b);
    Vector2 addScalar(float s);
    Vector2 addScaledVector(Vector2 v, float s);
    Vector2 clampScalar(float min, float max);
    Vector2 cross(Vector2 v);
    float distanceTo(Vector2 v);
    float manhattanDistanceTo(Vector2 v);
    float distanceToSquared(Vector2 v);
    Vector2 divide(Vector2 v);
    Vector2 divideScalar(float s);
    float dot(Vector2 v);
    Vector2 floor();
    float getComponent(int index);
    float length();
    Vector2 multiply(Vector2 v);
    Vector2 multiplyScalar(float s);
    Vector2 multiplyVectors(Vector2 a, Vector2 b);
    Vector2 negate();
    Vector2 normalize();

}
