# Autor: Luis Farco Oviedo

@stories
Feature: Academy Choucair
  Como usuario quiero aprender a automatizar en screamply en la academia choucair con el curso de automatizacion

  @scenarion1
      Scenario: Buscar un curso en automatico
      Given que Brandon quiere aprender automatizacion en la academia Choucair
        |  strUser    |  strPassword   |
        |  1066751789 |  Choucair2021* |
      When  el busca un curso en la plataforma de la academia choucair
        | strCourse                                 |
        | Certified Data & Analytics Tester (CDAT)  |
      Then  encuentra el curso llamado
        | strCourse                                 |
        | Certified Data & Analytics Tester (CDAT)  |

