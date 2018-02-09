/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaabstract.entity;

/**
 *
 * @author student
 */
public class Rectangle extends Shape implements IScalable {
    
    public Point point;
    public int height;
    public int width;

    @Override
    public void scale(int _scale) {
        height *= _scale;
        width *= _scale;
    }
}
