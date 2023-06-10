package org.example.respositories;

import org.example.models.BlackColor;
import org.example.models.BlueColor;
import org.example.models.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static
    {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }
}
