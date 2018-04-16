/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc.finalproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author damanglez
 * @param <T>
 */
public abstract class Manager<T> {
    private final List<T> objects;
    
    public Manager() {
        objects = new ArrayList<>();
    }
    
    public void add(T object) {
        objects.add(object);
    }
    
    public T remove(int atIndex) {
        return objects.remove(atIndex);
    }
    
    public List<T> list() {
        return objects;
    }
}
