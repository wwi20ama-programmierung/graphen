package de.dhbw.graphen;

import java.util.List;
import java.util.ArrayList;

public class Graph implements GraphInterface {
  
  private List<Knoten> knoten;

  public Graph() {
    knoten = new ArrayList<Knoten>();
  }

  public void addKnoten(String label) {
    knoten.add(new Knoten(label));
  }

  public void addKante(String label1, String label2) {
    Knoten k1 = getKnoten(label1);
    Knoten k2 = getKnoten(label2);
    if (k1 != null && k2 != null) {
      k1.addNachbar(k2);
    }
  }

  public void removeKnoten(String label) {
    // Muss den angegebenen Knoten aus der Liste der Knoten entfernen.
    // Muss ihn außerdem bei allen Knoten als Nachbarn entfernen.
    Knoten toRemove = getKnoten(label);
    for (Knoten k : knoten) {
      k.removeNachbar(toRemove);
    }
    knoten.remove(toRemove);
  }

  public void removeKante(String label1, String label2) {
    // Muss den zweiten Knoten aus der Nachbarliste des ersten entfernen.
    getKnoten(label1).removeNachbar(getKnoten(label2));
  }

  /** Liefert eine für den Menschen lesbare String-Repräsentation des Graphen.
   *  Liefert zeilenweise eine Liste der Kanten in der Form:
   * 
   *  l1 -> l2
   *  l1 -> l3
   *  l2 -> l3
   *  ...
   * 
   *  (vgl. GraphViz: https://graphviz.org)
   **/
  public String toString() {
    String result = "";
    for (Knoten k : knoten) {
      for (String label : k.getNachbarLabels()) {
        result += (k.getLabel() + " -> " + label + "\n");
      }
    }
    return result;
  }
  
  /** Liefert eine Dot-Repräsentation des Graphen.
   *  
   *  - vgl. GraphViz: https://graphviz.org
   *  - Online- Anzeigetool: https://dreampuf.github.io/GraphvizOnline 
   **/
  public String getDotGraph() {
    return "digraph {\n" + toString() + "}\n";
  }
  
  /** Hilfsfunktion: Liefert einen Knoten mit dem angegebenen Label oder null. **/
  private Knoten getKnoten(String label) {
    for (Knoten k : knoten) {
      if (k.getLabel().equals(label)) { return k; }
    }
    return null;
  }

  // [TODO]
  // ... weitere Funktionen implementieren
}