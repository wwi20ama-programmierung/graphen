package de.dhbw.graphen;

import java.util.List;
import java.util.ArrayList;


public class Knoten {
  private String label;
  private List<Knoten> nachbarn;

  /** Konstruktor, erwartet ein Label. **/
  public Knoten(String label) {
    setLabel(label);
    this.nachbarn = new ArrayList<Knoten>();
  }

  /** Getter für das Label. **/
  public String getLabel() {
    return label;
  }

  /** Setter für das Label. **/
  public void setLabel(String label) {
    this.label = label;
  }

  /** Fügt einen Knoten als Nachbarn hinzu.
   * Der Knoten muss bereits existieren.
   **/
  public void addNachbar(Knoten n) {
    if (n != null && !nachbarn.contains(n)) {
      nachbarn.add(n);
    }
  }

  /** Liefert den Nachbarn mit dem gegebenen Label oder null falls keiner existiert. **/
  public Knoten getNachbar(String label) {
    for (Knoten k : nachbarn) {
      if (k.getLabel().equals(label)) { return k; }
    }
    return null;
  }

  /** Liefert True, falls ein Nachbar mit dem gegebenen Label existiert. **/
  public boolean hasNachbar(String label) {
    return getNachbar(label) != null;
  }

  /** Entfernt den Nachbarknoten, falls er existiert. **/
  public void removeNachbar(Knoten k) {
    nachbarn.remove(k);
  }

  /** Liefert eine Liste der Labels aller Nachbarknoten. **/
  public List<String> getNachbarLabels() {
    List<String> result = new ArrayList<String>();
    for (Knoten k : nachbarn) {
      result.add(k.getLabel());
    }
    return result;
  }

}