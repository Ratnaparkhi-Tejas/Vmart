package org.example;

import java.util.ArrayList;

public class Bins {
    float rowHeight;
    float rowLength;
    float rowWidth;
    int numberOfRows;
    String typeOfBin;
    float maxWeightPerRow;
    ArrayList<Item> vendorItems= new ArrayList<>();

    public float getMaxWeightPerRow() {
        return maxWeightPerRow;
    }

    public void setMaxWeightPerRow(float maxWeightPerRow) {
        this.maxWeightPerRow = maxWeightPerRow;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public float getRowHeight() {
        return rowHeight;
    }

    public void setRowHeight(float rowHeight) {
        this.rowHeight = rowHeight;
    }

    public float getRowLength() {
        return rowLength;
    }

    public void setRowLength(float rowLength) {
        this.rowLength = rowLength;
    }

    public float getRowWidth() {
        return rowWidth;
    }

    public void setRowWidth(float rowWidth) {
        this.rowWidth = rowWidth;
    }

    public String getTypeOfBin() {
        return typeOfBin;
    }

    public void setTypeOfBin(String typeOfBin) {
        this.typeOfBin = typeOfBin;
    }
    public void addRow(int count){
        this.numberOfRows=this.numberOfRows+count;
    }
    public void removeRow(int count){
        this.numberOfRows=this.numberOfRows-count;
    }
    //==================================Main Function========================================
    public void updateDimensions(float length,float width,float height){
        this.rowLength=length;
        this.rowWidth=width;
        this.rowHeight=height;      
    }
    public void addNewRow(){
        this.numberOfRows++;
    }
    public void removeRow(){
        this.numberOfRows--;
    }

}
