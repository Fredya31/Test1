# Autor: JohnF

@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scebario1
  Scenario Outline: Search for a automation at the academy Choucair
    Given than JohnF wants to learn automation at the academy Choucair
      | strUser    | strPassword  |
      | TuUsuario  | TuClave      |
    When he search for the course Recursos Automatizacion Bancolombia on the Choucair academy platform
      | strCourse                |
      | <strCourse |
    Then he finds the course called resources Recursos Automatizacion Bancolombia
      | strCourse   |
      | strCourse  |
    Examples:
      | strUser | strPassword  | strCourse               |
      | rpenaa  | Febrero.2020  | Metodoloía Bancolombia  |