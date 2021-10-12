/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package fr.ufrsciencestech.panier.Model;

import java.util.ArrayList;

/**
 *
 * @author qg983700
 */
public class Macedoine implements Fruit{
    
    private ArrayList<Fruit> al = new ArrayList();
    private int nbFruit=0;
    
    public int getNbFruit(){
        return this.nbFruit;
    }
    
    public void ajoutFruit(Fruit f){
        this.al.add(f);
        nbFruit+=1;
    }
    
    @Override
    public String toString(){
        String s="Macedoine de fruits : \n";
        for(int i=0; i<al.size(); i++)
        {
            s += al.get(i).toString();
            s += "\n";
        }
        return s;
    }
    
    @Override
    public boolean isSeedless() {
        boolean bool=false;
        for(int i=0; i<al.size(); i++)
        {
            if(al.get(i).isSeedless()==true)
            {
                bool=true;
            }
        }
        return bool;
    }

    @Override
    public double getPrix() {
        double db=0;
        for(int i=0; i<al.size(); i++)
        {
            db += al.get(i).getPrix();
        }
        return db;
    }

    @Override
    public String getOrigine() {
        String s="Origine : \n";
        for(int i=0; i<al.size(); i++)
        {
            s += al.get(i).getOrigine();
            s += "\n";
        }
        return s;
    }
    
    
    
}
