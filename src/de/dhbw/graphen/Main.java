package de.dhbw.graphen;

public class Main {
  public static void main(String[] args) {
    Graph g1 = new Graph();
    g1.addKnoten("A");
    g1.addKnoten("B");
    g1.addKnoten("C");
    g1.addKnoten("D");
    g1.addKnoten("E");
    g1.addKnoten("F");

    g1.addKante("A", "B");
    g1.addKante("A", "C");
    g1.addKante("B", "D");
    g1.addKante("A", "D");
    g1.addKante("C", "B");
    g1.addKante("C", "F");
    g1.addKante("D", "D");
    g1.addKante("F", "C");
    g1.addKante("F", "E");

    System.out.println(g1);
    System.out.println(g1.getDotGraph());
  }
}