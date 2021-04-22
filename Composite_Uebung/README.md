# Composite_Uebung

Stellen sie sich vor sie haben ein Unternehmen was Blätter verkauft (getrocknet und gefärbt).
Für die Logistik sollen Versandpakete auf das Gramm genau berechnet werden.

Jedes Paket kann einzelne Pakete beinhalten die entweder leer sind oder Blätter beinhalten.
Bitte beachten sie meine klare Illustration:

|---------------|
|      |---|    |
|      |*  |    |
|      |---|    |
|               |
|---------------|

Aufgabe:
Erstellen sie einen Container der 2 eigene Container beinhaltet. 
Diese beinhalten wiederum jeweils 2 Blätter(Leaf) mit unterschiedlichem Gewicht und einen weiteren Container mit 1 Blatt (Leaf).
Von dem großen Container soll das Gesamtgewicht berechnet werden.

Kurzform: Container(2 Container (2 Blatt + Container (1 Blatt)))

