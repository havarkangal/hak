# Übungen zu VSY - 03 - Java RMI

## 1. Lokales Mastermind

Beim Spiel Mastermind rät ein Spieler in möglichst wenigen Versuchen eine ihm verborgene Konfiguration vierer verborgener Farben (der Einfachheit halber verwenden wir Ziffern). Nach jedem Versuch erhält der ratende Spieler die Information, wie viele Positionen in Summe er genau richtig geraten hat und wie viele übereinstimmende Ziffern sich generell ohne Berücksichtigung der genauen Position zwischen seiner geratenen Konfiguration und der verborgenen ergeben haben. 

Die Regeln erfahren Sie unter https://de.wikipedia.org/wiki/Mastermind_(Spiel) und auf zahlreichen anderen Seiten im Internet. Sie können auch online selbst spielen unter http://www.steyrerbrains.at/spiele/Mastermind/

Sie finden im Verzeichnis uebung-03 die Interfaces und die Server-Implementierung. Erstellen Sie einen rudimentären Client in einer Klasse Client, die das Interface IClient implementiert und die Spielerinteraktion über die Kommandozeile abwickelt. Die heruntergeladenen Klassen bleiben in diesem Schritt unverändert.

Lernziel: Verständnis des Spiels MasterMind, Erstellen einer sauber modularisierten ersten Implementierung.

## 2. RMI Mastermind

Bauen Sie Ihr Programm so um, dass es als RMI-Applikation läuft, der Server also vom Client über RMI angesprochen wird. Welche Schritte benötigen Sie dazu minimal auf Server- bzw. auf Clientseite?

Lernziel: RMI ist – wie in der Vorlesung beschrieben – kanonisch zum klassischen Java hinzugefügt. Daher gelingt die Zerlegung eines bereits sauber modularisierten Programms wie des Ergebnisses aus Aufgabe 1 durch Verwendung der wenigen in der Vorlesung gezeigten Konstrukte mit geringem Aufwand.

## 3. RMI Multiple-Client-Mastermind
Nun treten bei uns mehrere Spieler direkt gegeneinander um die geringere Anzahl benötigte Versuche an, jeder rät für sich, sieht aber die Züge und Ergebnisse der jeweils anderen nicht. Erweitern Sie Ihren Server dafür dergestalt, dass er mit mehreren Clients zusammenspielt. 

Die erweiterten Interfaces finden Sie unter uebung-03-extended.

## 4. Kommunikation bei Multiple-Client-Mastermind
Wie kann der Server mit den daraus resultierenden längeren Timeouts in der Client- Kommunikation besser umgehen, als – wie in der Standardimplementierung – den Client aus dem Spiel zu entfernen? Welches Vorgehen erzwingt hier die synchrone Kommunikation bei RMI?

Lernziel: Für Server, die mehrere Clients bedienen, ist asynchrone Kommunikation bei Push- Nachrichten erforderlich, da sonst der Server auf einen einzelnen Client warten muss und für die anderen nicht erreichbar ist. Die Simulation asynchroner Kommunikation über eine an sich synchrone Kommunikation gelingt über die Abwicklung der Kommunikation in jeweils eigenen Threads pro Kommunikation.
