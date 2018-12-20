/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.Serializable;

/**
 *
 * @author ThuSinh
 */
public class xenoithanh extends xe implements Serializable{
    private final int sochuyen;
    private final float sokmdiduoc;

    xenoithanh() {
        super();
        this.sochuyen = 0;
        this.sokmdiduoc = 0.0f;
    }

    xenoithanh(String machuyen, String taixe, String soxe, double doanhthu,int sochuyen, float sokmdiduoc) {
        super(machuyen, taixe, soxe, doanhthu);
        this.sochuyen = sochuyen;
        this.sokmdiduoc = sokmdiduoc;
    }

    @Override
    public boolean equals(Object obj){
        return this.machuyen.equalsIgnoreCase(((xenoithanh)obj).machuyen);
    }
    public String toString() {
      
        String st = "";
        st+=super.toString();
        st+="so chuyen:\t" + this.sochuyen;
        st+="\t so km di duoc:\t" + this.sokmdiduoc ;
        return st;
    }
    
    
    
    
    
}
