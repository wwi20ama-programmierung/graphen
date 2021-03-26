package de.dhbw.graphen;

import java.util.List;

public class Graph implements GraphInterface {
  
  private List<Knoten> knoten;

  public Graph() {
    // [TODO]
  }

  public void addKnoten(String label) {
    // [TODO]
    // Muss einen neuen Knoten erzeugen und zur Knotenliste hinzufügen.
  }

  public void addKante(String label1, String label2) {
    // [TODO]
    // Muss die beiden Knoten mit den angegebenen Labels suchen und den zweiten beim ersten hinzufügen.
  }

  public void removeKnoten(String label) {
    // [TODO]
    // Muss den angegebenen Knoten aus der Liste der Knoten entfernen.
  }

  public void removeKante(String label1, String label2) {
    // [TODO]
    // Muss den zweiten Knoten aus der Nachbarliste des ersten entfernen.
  } 
  
  /* Nützliche Hilfsfunktionen:
   * - get(): Sucht Knoten mit Label, liefert ein Knotenobjekt.
   * - to_string(): Liefert eine für den Menschen lesbare String-Repräsentation des Graphen. Nützlich zur Überprüfung der anderen Funktionen.
   * - isNachbar() o.Ä., kann auch nützlich sein, um die Korrektheit zu testen.
   */

  // [TODO]
  // ... weitere Funktionen implementieren
}