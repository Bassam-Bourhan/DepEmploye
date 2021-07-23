créer une application POJO Java avec objets persistants en utilisant JPA, Mysql et projet MAVEN
Réaliser une application permettant de définir des employés affectés à un département.
Création du projet: on utilise la commande Maven pour créer le projet de test que l’on nommera DepEmployeJPA.
Création des classes métiers: Il modélise les employés d’une entreprise et les départements auxquels ils appartiennent. Il y aura donc 2 entités : Employe et Departement.L’adresse d’un employé sera modélisée par une classe intégrée.
Programme principal: l’entité Employe est développée et compilée, on va écrire une classe principale qui permettra de créer un objet Employe et de le rendre persistant. Pour cela, on a besoin d’initialiser le EntityManager par une factory, de démarrer une transaction, créer une instance de l’objet, définir le nom et le salaire de l’employé par exemple, utilise EntityManager.persist() pour l’insérer dans la base de données, valider la transaction et fermer l’EntityManager.

