package eu.bebendorf.threejava.material;

import eu.bebendorf.threejava.math.Color;
import eu.bebendorf.threejava.texture.Texture;

public interface MeshStandardMaterial extends Material {

    Texture getAlphaMap();
    void setAlphaMap(Texture alphaMap);
    Color getColor();
    void setColor(Color color);
    Texture getMap();
    void setMap(Texture map);
    Texture getNormalMap();
    void setNormalMap(Texture normalMap);
    float getRoughness();
    void setRoughness(float roughness);
    Texture getRoughnessMap();
    void setRoughnessMap(Texture roughnessMap);
    float getMetalness();
    void setMetalness(float metalness);
    Texture getMetalnessMap();
    void setMetalnessMap(Texture metalnessMap);
    Color getEmissive();
    void setEmissive(Color color);
    Texture getEmissiveMap();
    void setEmissiveMap(Texture emissiveMap);
    float getEmissiveIntensity();
    void setEmissiveIntensity(float emissiveIntensity);

}
