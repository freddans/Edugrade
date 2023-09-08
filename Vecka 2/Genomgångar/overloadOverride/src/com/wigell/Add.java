package com.wigell;

public class Add {
  // var
  private int a = 3;
  private int b = 4;
  private int c = 5;

  // constructors
  public Add(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  // empty constructor
  public Add() {
  }

  // getter and setters
  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  // methods
  //+++ overloaded method
  public int add(int a, int b) {
    return (a + b);
  }

  public int add(int a, int b, int c) {
    return (a+b+c);
  }
  //--- overloaded method


  //+++ Override
  @Override
  public String toString() {
    return "Add{" +
        "Value of A is " + a +
        ", Value of B is " + b +
        ", Value of C is " + c +
        '}';
  }
  //--- Override
}
