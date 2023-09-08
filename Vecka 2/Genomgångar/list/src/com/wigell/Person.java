package com.wigell;

import java.util.ArrayList;
import java.util.List;

public class Person {
  // var
  private String name;
  public List<Cat> cats = new ArrayList<>(); // personen har en lista av katter

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Cat> getCats() {
    return cats;
  }

  public void setCats(List<Cat> cats) {
    this.cats = cats;
  }
}
