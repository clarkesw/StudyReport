/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.last.spring.studyreport.oops;

/**
 *
 * @author Clarke S.
 */
public class Dog extends Animal {
    public void display() {
        System.out.println( name + " is a Dog");
    }
}
  
class BullDog extends Dog{
    public void display() {
        System.out.println( name + " is a BullDog");
    } 
}