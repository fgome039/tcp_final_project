/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc.finalproject;

import java.util.Date;

/**
 *
 * @author damanglez
 */
public class WorkOrder {

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
    private int id; // Unique number assigned by the system
    private int accountId;
    private Date dueDate;
    private Machine machine;
    private WorkMethod workMethod;
    private int materialId;
    private double width;
    private double height;
    private int producedById; 
    private int revisedById;
	private String notes;

    /**
     * 
     * @param id
	 * @param accountId
     * @param dueDate
     * @param machine
     * @param workMethod
     * @param materialId
     * @param width
	 * @param producedById
	 * @param revisedById
     * @param height
	 * @param notes
     */
    public WorkOrder(int id, int accountId, Date dueDate, Machine machine, 
			WorkMethod workMethod, int materialId, double width, double height, 
			int producedById, int revisedById, String notes) {
        this.id = id;
        this.accountId = accountId;
        this.dueDate = dueDate;
        this.machine = machine;
        this.workMethod = workMethod;
        this.materialId = materialId;
        this.width = width;
        this.height = height;
        this.producedById = producedById;
        this.revisedById = revisedById;
		this.notes = notes;
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
     * @return the account
     */
    public int getAccountId() {
        return accountId;
    }

    /**
	 * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the machine
     */
    public Machine getMachine() {
        return machine;
    }

    /**
     * @param machine the machine to set
     */
    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    /**
     * @return the workMethod
     */
    public WorkMethod getWorkMethod() {
        return workMethod;
    }

    /**
     * @param workMethod the workMethod to set
     */
    public void setWorkMethod(WorkMethod workMethod) {
        this.workMethod = workMethod;
    }

    /**
     * @return the substrate
     */
    public int getMaterialId() {
        return materialId;
    }

    /**
     * @param materialId the substrate to set
     */
    public void setMaterialId(int materialId) {
        this.materialId = materialId;
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
     * @return the producedBy
     */
    public int getProducedById() {
        return producedById;
    }

    /**
     * @param producedById the producedBy to set
     */
    public void setProducedById(int producedById) {
        this.producedById = producedById;
    }

    /**
     * @return the revisedBy
     */
    public int getRevisedById() {
        return revisedById;
    }

    /**
     * @param revisedById the revisedBy to set
     */
    public void setRevisedById(int revisedById) {
        this.revisedById = revisedById;
    }
    
    @Override
    public String toString() {
        return id + ", Account Id:" + accountId + ", " + 
				dueDate + ", Material Id: " + materialId + ", " +
                ". Produced by Id: " + producedById + ". Revised by Id: " + revisedById;
    }

}
