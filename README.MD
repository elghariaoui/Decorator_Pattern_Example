# Projet Java - Pattern Décorateur

Ce projet est développé en Java avec Maven. Il met en œuvre le **pattern décorateur** (Decorator Pattern).

## Description

Le pattern décorateur est un patron de conception structurel qui permet d’ajouter dynamiquement des fonctionnalités à un objet sans modifier son code source. Il repose sur la composition plutôt que sur l’héritage, en enveloppant l’objet original dans un ou plusieurs objets décorateurs.

### Avantages

- Ajout de fonctionnalités sans modifier la classe de base.
- Flexibilité accrue par rapport à l’héritage.
- Possibilité de combiner plusieurs décorateurs.

### Exemple d’utilisation

Supposons une interface `Boisson` avec une méthode `getDescription()` et `cout()`. On peut créer des décorateurs comme `Lait` ou `Chocolat` qui ajoutent des fonctionnalités à une boisson de base.

Autre exemple, dans InputStream en Java, où des décorateurs comme `BufferedInputStream` ajoutent des fonctionnalités de mise en cache à un flux d'entrée de base.

`InputStream is = new BufferedInputStream(new FileInputStream("file.txt"));`

ou encore

`InputStream is = new BuffredReader(new BufferedInputStream(new FileInputStream("file.txt"));`

## Résultat d'exécution

```bash
Sumatra
Description: Sumatra
Cout: 6.0
Espresso
Description: Espresso
Cout: 12.0
----- Avec Decorateur -----
Ajout de Chocolat
Description: Espresso + Chocolat
Cout: 12.5
Ajout de Caramel
Description: Espresso + Chocolat + Caramel
Cout: 13.25
Ajout de Chocolat
Description: Espresso + Chocolat + Caramel + Chocolat
Cout: 13.75
Ajout de Noisette
Description: Espresso + Chocolat + Caramel + Chocolat + Noisette
Cout: 14.75
-----exemple de composition -----
Espresso
Ajout de Noisette
Ajout de Chocolat
Ajout de Noisette
Ajout de Caramel
Description: Espresso + Noisette + Chocolat + Noisette + Caramel
Cout: 15.25
```
## Diagramme Decorateur

<img src="captures/Capture_diagram_decorateur.png" alt="Diagramme Decorateur"  width="700"/>
