/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc.finalproject;

/**
 *
 * @author damanglez
 */
public class Material {
    private int id; // Unique number assigned by the system
    private String name;
    private SubstrateType substrateType;
    private Color color;
    private double width;
    private double height;
    private double thickness;

    /**
     * 
     * @param id
     * @param name
     * @param substrateType
     * @param color
     * @param width
     * @param height
     * @param thickness 
     */
    public Material(int id, String name, SubstrateType substrateType, Color color, 
            double width, double height, double thickness) {
        this.id = id;
        this.name = name;
        this.substrateType = substrateType;
        this.color = color;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surfaceType
     */
    public SubstrateType getSubstrateType() {
        return substrateType;
    }

    /**
     * @param substrateType
     */
    public void setSubstrateType(SubstrateType substrateType) {
        this.substrateType = substrateType;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the thickness
     */
    public double getThickness() {
        return thickness;
    }

    /**
     * @param thickness the thickness to set
     */
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
    
    @Override
    public String toString() {
        return name + " (" + id + "), " + substrateType + ", " + color + ", " +
                width + "x" + height + "x" + thickness;
    }
}
