package eu.bebendorf.threejava.material;

import eu.bebendorf.threejava.math.Color;
import eu.bebendorf.threejava.texture.Texture;

public interface MeshToonMaterial extends Material {

    Texture getAlphaMap();
    void setAlphaMap(Texture alphaMap);
    Color getColor();
    void setColor(Color color);
    Texture getMap();
    void setMap(Texture map);
    Texture getNormalMap();
    void setNormalMap(Texture normalMap);
    Color getEmissive();
    void setEmissive(Color color);
    Texture getEmissiveMap();
    void setEmissiveMap(Texture emissiveMap);
    float getEmissiveIntensity();
    void setEmissiveIntensity(float emissiveIntensity);

}
