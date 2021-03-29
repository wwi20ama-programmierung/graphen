package de.dhbw.graphen;

public interface GraphInterface {
  
  // Zugriffsfunktionen

  /** Fügt einen Knoten mit dem angegebenen Label hinzu. **/
  public void addKnoten(String label);

  /** Fügt eine Kante zwischen den Knoten mit dem angegebenen Label hinzu. **/
  public void addKante(String label1, String label2);

  /** Entfernt den Knoten mit dem angegebenen Label. **/
  public void removeKnoten(String label);

  /** Entfernt die Kante zwischen den Knoten mit den angegebenen Labels. **/
  public void removeKante(String label1, String label2);

  // Funktionen zur Analyse des Graphen

  /** Listet die Nachbarn eines Knoten auf. **/
  public List<String> nachbarn(String label);

  /** Listet die Nachbarn eines Knoten Entfernung n auf.
   *  Also alle Knoten, die man in genau n Schritten erreichen kann.
   **/
  public List<String> nachbarn(String label, int n);

  /** Bestimmt die Entfernung zwischen 2 Knoten. **/
  public int entfernung(String label1, String label2);

  /** Liefert True, falls es einen Weg von A nach B gibt. **/
  public boolean erreichbar(String A, String B);

}