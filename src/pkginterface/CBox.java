/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author CT7-PC47
 */
public class CBox implements IBox{
    private Object objeto;
    
    public CBox(){
        this.objeto=null;
        
    }
    // @Override
    public Object get(){
        Object  objetoNada = new Object();
     //   return objetivoNada;
        return this.objeto;
    }
    
    public void put(Object objetivo){
        this.objeto = objetivo;
    }

   // @Override
    public void obtenerClase(CBox cbox) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
