# Autor: Luis Farco Oviedo

@stories
Feature: Academy Choucair
  Como usuario quiero aprender a automatizar en screamply en la academia choucair con el curso de automatizacion

  @scenarion1
      Scenario: Buscar un curso en automatico
      Given que Brandon quiere aprender automatizacion en la academia Choucair
      When  una busqueda del curso Certified Data & Analytics Tester (CDAT) en la plataforma de la academia choucair
      Then  encuentra el curso llamado Certified Data & Analytics Tester (CDAT)

