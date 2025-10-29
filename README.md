# 🧠 Projet SCALA1 — Apprentissage et Pratique du langage Scala

## 🧩 Description du projet

Le projet **SCALA1** est un ensemble d’exercices, de classes et de scripts conçus pour **apprendre et expérimenter les concepts fondamentaux du langage Scala**.
L’objectif est de comprendre la **programmation orientée objet et fonctionnelle** avec Scala, tout en explorant les notions d’**héritage, collections, objets, classes et fonctions**.

Ce projet constitue une **base pratique** pour développer des applications Scala exécutables aussi bien dans un environnement local que dans des outils comme **sbt** ou **VS Code**.

---

## 📁 Structure du projet

```
SCALA1/
│
├── demo1/
│   ├── .bloop/                 # Fichiers de configuration du build Scala (Bloop)
│   ├── project/                # Fichiers de configuration du projet
│   └── src/
│       └── main/scala/
│           ├── Animal.scala           # Exemple de classe et d’héritage
│           ├── Student.scala          # Exemple de classe avec attributs et méthodes
│           ├── Main.scala             # Point d’entrée principal du programme
│           ├── exemple2.sc            # Script d’exemple de syntaxe Scala
│           ├── exo1.sc                # Premier exercice Scala (bases du langage)
│           ├── exo_test1.sc           # Test d’exécution d’exemples simples
│           ├── exo_collection.sc      # Manipulation des collections Scala
│           ├── exo_class_objet.sc     # Définition de classes et d’objets
│           ├── heritage.sc            # Exemple d’héritage entre classes
│           ├── fichier.sc             # Lecture et écriture dans des fichiers
│           └── teste.sc               # Script de test libre
│
├── test/                       # Répertoire pour les tests unitaires (optionnel)
├── target/                     # Répertoire généré après compilation
├── .gitignore                  # Fichiers ignorés par Git
└── build.sbt                   # (À ajouter) Fichier de configuration sbt du projet
```

---

## 🎯 Objectifs pédagogiques

* Maîtriser les **bases de la syntaxe Scala** (val, var, def, if, match…).
* Comprendre les **concepts orientés objet** : classes, objets, héritage, polymorphisme.
* Manipuler les **collections** (List, Map, Set, etc.).
* Découvrir les **fonctions anonymes** et la **programmation fonctionnelle**.
* Exécuter des **scripts `.sc`** et compiler des **fichiers `.scala`**.

---

## ⚙️ Exécution des fichiers

### ▶️ Exécuter un script `.sc`

Les fichiers avec l’extension `.sc` sont des **scripts Scala**.
Pour les exécuter :

```bash
scala src/main/scala/exo1.sc
```

### 🏗️ Compiler et exécuter un fichier `.scala`

Les fichiers `.scala` doivent être compilés :

```bash
scalac src/main/scala/Main.scala
scala Main
```

---

## 💡 Exemple de script simple

```scala
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Bonjour, Scala ! C\' Ben. ")
  }
}
```

---

## 🧑‍💻 Auteur

**Ben10-data**
Projet d’initiation et de pratique du langage **Scala**, abordant les bases de la programmation orientée objet et fonctionnelle.
