### Informacion del Proyecto
###### Proyecto que permite ejecutar casos de pruebas para el sitio web
https://www.saucedemo.com/ 
###### En el mismo encontraremos distintos escenarios de prueba de Login y Añadir productos al carrito . Tambien encontraremos un feature de prueba que me permite interactuar con un servicio de Mercado Libre.

### Pasos Para Ejecutar las pruebas

###### 1: Clonamos el proyecto y lo abrimos con un Editor
###### 2: Seleccionamos un feature que queremos ejecutar, los mismos se encuentran en la direccion: src/resources/web.feature.
###### Dentro del feature nos encontraremos con diferentes escenarios cons sus respectivos Tags.
###### 3: Seleccionamos el Tags del escenario que queremos ejecutar y lo copiamos.
###### 4: Abrimos nuestro Archivo Pom.xml que se encuentra en la parte inferior izquierda y nos dirigimos a la linea 31 donde nos encontraremos con la siguiente linea:
###### <cucumber.tags>--tags '@Login'</cucumber.tags>
###### Remplazamos @Login por el Tag que hemos copiado y guardamos los cambios.
###### Paso 5: Volvemos a nuestro feature y ejecutamos la prueba.

### Pasos para Visualizar Reportes
###### 1: Nos dirigimos al archivo "Target" y luego al archivo "extent-reports" 
###### 2: seleccionamos el archivo index.html y lo abrimos con el navegador

