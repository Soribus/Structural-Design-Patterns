# Bridge Pattern
Sie wollen das Couch-Potatoe-Dasein optimieren.
Aus diesem Grund entwickeln Sie neue ergonomische, benutzerfreundliche und
universelle Fernbedienung für diverse Geräte (Tv, Radio, etc.)

Sie führen zwei verschiedene Fernbedienungen:
* eine kleine mit Basisfunktionalitäten wie dem Ein-/Ausschalten von Geräten, dem Regulieren von Lautstärke sowie das Rauf-
und Runterschalten von Sendern (BasicRemoteControl)
* eine Pro-Fernbedienung mit Stummschalte-Funktion und Tasten mit Zahlen
  von 0-9, um direkt auf einen bestimmten Kanal zu wechseln (AdvancedRemoteControl)

Aufgaben:
* Erstellen Sie ein Referenzobjekt (Device) zur erfolgreichen Erstellung der Bridge
  in der BasicRemoteControl-Klasse
* Implementieren Sie die gewünschten Funktionalitäten des RemoteControl-Interfaces
  in der BasicRemoteControl-Klasse
* Leiten Sie die AdvancedRemoteControl-Klasse von BasicRemoteControl-Klasse ab und
  implementieren Sie die Methoden
* Testen Sie einen Radio und Fernseher in der Client-Klasse
