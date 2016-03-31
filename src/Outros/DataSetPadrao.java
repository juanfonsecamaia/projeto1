/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import java.util.Vector;

/**
 *
 * @author Wagner Chaves
 */
public class DataSetPadrao {
    Vector<String> columnNames;
    Vector<Vector<Object>> data;
    
    public DataSetPadrao(){
        columnNames = new Vector<String>();
        data = new Vector<Vector<Object>>();
    }

    public Vector<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(Vector<String> columnNames) {
        this.columnNames = columnNames;
    }
    
    public void addColumnName(String columnName){
        this.columnNames.add(columnName);
    }

    public Vector<Vector<Object>> getData() {
        return data;
    }

    public void setData(Vector<Vector<Object>> data) {
        this.data = data;
    }
    
    public void addData(Vector<Object> data){
        this.data.add(data);
    }

}
