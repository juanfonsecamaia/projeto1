/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

/**
 *
 * @author Wagner Chaves
 */
public class Triangulo {
    private int Vertice1;   
    private int Vertice2;
    private int Vertice3;
    
    public void Tringulo() {
        
    }
    
    public void Triangulo(int L1, int L2, int L3){
        this.setVertice1(L1);
        this.setVertice2(L2);
        this.setVertice3(L3);
    }
    
    public int ValidaTriangulo(int a, int b, int c){
        int Result;
        if ((c < a+b) && (b < c+a) && (a < c+b)){
            if ((a == b) && (b == c)){
                Result = 1;
            }
            else if ((a != b) && (b != c) && (c != a)){
                Result = 2;
            }
            else Result = 3;
        }else
            Result = 0;
        
        return Result;
    } 

    /**
     * @return the Vertice1
     */
    public int getVertice1() {
        return Vertice1;
    }

    /**
     * @param Vertice1 the Vertice1 to set
     */
    public void setVertice1(int Vertice1) {
        this.Vertice1 = Vertice1;
    }

    /**
     * @return the Vertice2
     */
    public int getVertice2() {
        return Vertice2;
    }

    /**
     * @param Vertice2 the Vertice2 to set
     */
    public void setVertice2(int Vertice2) {
        this.Vertice2 = Vertice2;
    }

    /**
     * @return the Vertice3
     */
    public int getVertice3() {
        return Vertice3;
    }

    /**
     * @param Vertice3 the Vertice3 to set
     */
    public void setVertice3(int Vertice3) {
        this.Vertice3 = Vertice3;
    }
    
}
