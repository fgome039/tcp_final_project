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
	protected int nextId;
    
    public Manager() {
        objects = new ArrayList<>();
		nextId = 0;
		parse();
    }
	
	public T get(int index) {
        return objects.get(index);
    }
    
    public void add(T object) {
        objects.add(object);
		nextId++;
    }
    
    public T remove(int atIndex) {
        return objects.remove(atIndex);
    }
    
    public List<T> list() {
        return objects;
    }
	
	public int getNextId()  {
		return nextId;
	}
	
	protected abstract void parse();
	public abstract void save();
}
