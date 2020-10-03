package eu.bebendorf.threejava.material;

import eu.bebendorf.threejava.math.Color;
import eu.bebendorf.threejava.texture.Texture;

public interface SpriteMaterial extends Material {

    Texture getAlphaMap();
    void setAlphaMap(Texture alphaMap);
    Color getColor();
    void setColor(Color color);
    Texture getMap();
    void setMap(Texture map);

}
