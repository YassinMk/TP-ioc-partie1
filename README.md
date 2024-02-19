# Injection des dépendences et inversion du  controle 

## Table des Matières
- [Introduction](#introduction)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Fonctionnalités](#fonctionnalités)
- [Dépendances](#dépendances)
- [Configuration](#configuration)
- [Exemples](#exemples)
- [Dépannage](#dépannage)

## Introduction
Ce projet vise à illustrer les principes de l'Injection de Dépendances (DI) et de l'Inversion de Contrôle (IoC) en utilisant Java et le framework Spring. Il propose des exemples d'implémentation de Data Access Objects (DAO), de logique métier de couche de service, ainsi que de couches de présentation avec et sans l'utilisation de Spring.

## Installation
Ce projet nécessite Java et Maven pour la gestion des dépendances. Pour l'installer, suivez ces étapes :
```bash
git clone  https://github.com/YassinMk/TP-ioc-partie1
cd ioc-partie1
mvn clean install
```
## Utilisation
Pour exécuter le projet, lancez la classe principale correspondant à l'implémentation de la couche de présentation souhaitée. Des exemples avec une configuration Spring basée sur XML et une configuration basée sur des annotations sont inclus.

## Fonctionnalités
- **Implémentation du Pattern DAO** : `IDao.java`, `DaoImpl.java`, et `DaoImplV2.java` démontrent le pattern DAO pour abstraire et encapsuler tout accès à la source de données.
- **Couche Logique Métier** : `IMetier.java` et `MetierImpl.java` représentent la couche de service contenant la logique métier.
- **Injection de Dépendances** : Présente l'injection de dépendances en utilisant la configuration XML de Spring (`PresAvecSpringXML.java`) et les annotations (`PresSpringAnnotation.java`).
- **Inversion de Contrôle** : Illustre l'IoC à travers le Framework Spring, permettant le découplage des composants.

## Dépendances
- Java JDK (version 8 ou supérieure)
- Maven
- Framework Spring

## Configuration
- **Configuration Basée sur XML** : Consultez `PresAvecSpringXML.java` pour des exemples de définition de beans et d'injection de dépendances utilisant XML.
- **Configuration Basée sur Annotations** : `PresSpringAnnotation.java` démontre la configuration de Spring et l'injection de dépendances en utilisant des annotations.


## Exemples
Le projet inclut plusieurs classes principales démontrant différents aspects de DI et IoC :
- `PresentationV1.java` : Implémentation de base sans Spring.
- `PresentationV2.java` : Implémentation améliorée avec gestion manuelle des dépendances.
- `PresAvecSpringXML.java` : Implémentation utilisant Spring avec configuration XML.
- `PresSpringAnnotation.java` : Implémentation utilisant Spring avec configuration basée sur des annotations.

# Diagramme de classe : 
![Capture d'écran 2024-02-19 114149](https://github.com/YassinMk/TP-ioc-partie1/assets/122708120/4e06f615-bd5c-4c06-810e-aff36869adcb)

  
## Dépannage
Pour les problèmes liés à la configuration du projet ou à la résolution des dépendances, assurez-vous que Maven est correctement installé et que la variable d'environnement JAVA_HOME est définie.

