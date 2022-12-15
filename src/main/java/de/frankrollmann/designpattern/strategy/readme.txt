Strategy design pattern

Beschreibung:
Die Strategy im Strategy Design Pattern besteht dahin unterschiedliche Ausprägungen eines Verhaltens zu kapseln

Quellen:
https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=1

Implementierung:
1. Erzeuge ein IStrategy interface das eine do-Methode beinhaltet.
2. Erzeuge konkrete Strategy Klassen die das IStrategy interface implementieren (do-Methode).
3. Erzeuge eine Context Klasse, die IStrategy in Konstruktor besitzt und die execute-Methode implementiert.
Die execute Methode ruft die doMethode der Strategy-Klassen auf.
4. Erzeuge eine Demo Klasse, die den Context mit erzeugten Strategy Klassen aufruft

Beispiele:
Operation-Strategy= (AddOperation, SubOperation, MulOperation, DivOperation)
Flying-Strategy= (SimpleFlying, JetFlying, NoFlying))
Move-Strategy (go, walk, run, noMove(=stand))
...


