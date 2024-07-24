Feature: Navegar a RENIEC y realizar acciones

  Scenario: Usuario navega a RENIEC para buscar el consulado de Cuenca
    Given el usuario navega a la página de RENIEC
    When el usuario hace click en Peruanos en el Extranjero
    And el usuario hace click en Consulados en el Mundo
    And el usuario hace click en Lista de Consulados en el Mundo
    And el usuario ingresa "Cuenca" en el campo de búsqueda
    And el usuario hace click en el botón de búsqueda
    Then el usuario debería ver los resultados de búsqueda
