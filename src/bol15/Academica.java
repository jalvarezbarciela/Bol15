/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol15;
import personal.*;
import nota1aval.Calculo;
/**
 *
 * @author jalvarezbarciela
 */
public class Academica {
    static int numReferencia=2020;
    private String nome;
    private int nota;
    private int referencia;
    Calculo nota1=new Calculo();
    private Persoal alum=new Persoal();

    public Academica(String nome, int nota,String telefono,String correo) {
        referencia=numReferencia;
        this.nome = nome;
        this.nota = nota;
        alum.setTeléfono(telefono);
        alum.setCorreo(correo);
        numReferencia++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + ", referencia=" + referencia +" "+ alum.toString();
    }
    
    

    


   
    
   
}
