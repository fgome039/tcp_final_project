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
    private int id; // Unique number assigned by the system
    private Account account;
    private Date dueDate;
    private Machine machine;
    private WorkMethod workMethod;
    private Material substrate;
    private double width;
    private double height;
    private Employee producedBy; 
    private Employee revisedBy;

    /**
     * 
     * @param id
     * @param account
     * @param dueDate
     * @param machine
     * @param workMethod
     * @param substrate
     * @param width
     * @param height
     * @param producedBy
     * @param revisedBy 
     */
    public WorkOrder(int id, Account account, Date dueDate, Machine machine, WorkMethod workMethod, Material substrate, double width, double height, Employee producedBy, Employee revisedBy) {
        this.id = id;
        this.account = account;
        this.dueDate = dueDate;
        this.machine = machine;
        this.workMethod = workMethod;
        this.substrate = substrate;
        this.width = width;
        this.height = height;
        this.producedBy = producedBy;
        this.revisedBy = revisedBy;
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
    public Account getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
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
    public Material getSubstrate() {
        return substrate;
    }

    /**
     * @param substrate the substrate to set
     */
    public void setSubstrate(Material substrate) {
        this.substrate = substrate;
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
    public Employee getProducedBy() {
        return producedBy;
    }

    /**
     * @param producedBy the producedBy to set
     */
    public void setProducedBy(Employee producedBy) {
        this.producedBy = producedBy;
    }

    /**
     * @return the revisedBy
     */
    public Employee getRevisedBy() {
        return revisedBy;
    }

    /**
     * @param revisedBy the revisedBy to set
     */
    public void setRevisedBy(Employee revisedBy) {
        this.revisedBy = revisedBy;
    }
    
    @Override
    public String toString() {
        return id + ", " + account + ", " + dueDate + ", " + substrate + ", " +
                ". Produced by: " + producedBy + ". Revised by: " + revisedBy;
    }

}
