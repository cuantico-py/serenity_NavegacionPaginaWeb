#lenguaje Gherkin
Feature: navegacion de pestañas

  Scenario: navegacion de pantallas
    Given dado que el usuario  esta en la pag de cidenet
    When cuando el usuario seleccione las pestanas Nosotros, Nuevo proyecto, Servicios, Equipo, Trabaja con Nosotros, Blog, Contactanos
    And el usuario  va al Home
    Then el usuario ve la pantalla del Home
