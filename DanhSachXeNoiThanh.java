/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ThuSinh
 */
public class DanhSachXeNoiThanh implements Serializable{
    ArrayList<xenoithanh> listxenoi;

    DanhSachXeNoiThanh() {
        listxenoi = new ArrayList<>();
    }
  public  boolean themMotXeNoiThanh( xenoithanh xenoi){
        if(this.listxenoi.contains(xenoi)){
            return false;
        }
        else{
            this.listxenoi.add(xenoi);
            return true;
        }
    }
  public  String toString(){
      String st ="";
      for( int i =0 ; i<this.listxenoi.size();i++){
          st+= this.listxenoi.get(i).toString()+"\n";
  }
      return st;
}
}
