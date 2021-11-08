Feature: As a potential client i want to interact with the mobile application

  Background:
    Given La aplicacion carga correctamente

  @Demo
  Scenario Outline: El usuario inicia sesion en la aplicacion
    When El usuario ingresa sus credenciales: <email>, <password>
    Then Se muestra la pagina de inicio

    Examples:
      | email                       | password  |
      | federicomarkevicz@gmail.com | perla99   |


  @Demo @Fede
  Scenario Outline: El usuario cambia el valor de un boton
    When El usuario ingresa sus credenciales: <email>, <password>
    And El usuario hace click en el menu desplegable
    And El usuario hace click en la opcion Settings
    And El usuario cambia el valor a la opcion de Enable dark mode
    Then Se puede ver el fondo oscuro en la aplicacion

    Examples:
      | email                       | password  |
      | federicomarkevicz@gmail.com | perla99   |

  @Demo
  Scenario Outline: El usuario realiza la carga de 1 proyecto
    When El usuario ingresa sus credenciales: <email>, <password>
    And El usuario hace click en el menu desplegable
    And El usuario hace click en la opcion Time tracker
    And El usuario hace click en el boton +
    And El usuario selecciona la opcion de Project
    And El usuario selecciona uno de los proyectos previamente creados
    And El usuario selecciona el horario
    And el usuario hace click en el boton save
    Then Se visualiza una nueva entrada al proyecto

    Examples:
      | email                       | password |
      | federicomarkevicz@gmail.com | perla99  |