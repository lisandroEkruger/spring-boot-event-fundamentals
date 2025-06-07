# Proyecto de Programación Orientada a Eventos con Spring Boot

## Descripción
Este proyecto ejemplifica los fundamentos de la programación orientada a eventos utilizando Spring Boot, un framework robusto y muy utilizado en el desarrollo de aplicaciones Java. La programación orientada a eventos es un paradigma donde se define una serie de eventos — sucesos que ocurren dentro de la aplicación y componentes que reaccionan a esos eventos mediante listeners o escuchas especializadas.

La principal ventaja de este enfoque es la desacoplación entre los distintos componentes del sistema, lo que facilita mantener y escalar la aplicación.

## Tecnologías Utilizadas
- Java 17
- Spring Boot 3.2.0
- Maven
- Spring Web
- Lombok (para simplificar la generación de getters, setters y constructores) 

## Estructura del Proyecto
- event: paquete que contiene las clases que representan los eventos. Por ejemplo, UserRegisteredEvent y UserValidatedEvent, que indican eventos concretos ocurridos en la aplicación.

- publisher: componente encargado de publicar los eventos, usando la interfaz ApplicationEventPublisher de Spring.

- listener: componentes que escuchan los eventos publicados y reaccionan ante ellos ejecutando la lógica correspondiente.

## Funcionamiento
- Definición de eventos: Los eventos se modelan como clases que contienen atributos con información relevante del suceso (por ejemplo, datos del usuario registrado).

- Publicación de eventos: Un “publisher” (publicador) inyectado como componente de Spring publica los eventos al contexto de Spring mediante ApplicationEventPublisher, propagando el suceso a todos los interesados.

- Escucha y respuesta a eventos: Los “listeners” se suscriben a eventos específicos a través de la anotación @EventListener. Cuando un evento es detectado, ejecutan la lógica necesaria, como validar datos o desencadenar acciones adicionales.

- Cadena de eventos: Algunos listeners pueden disparar nuevos eventos como respuesta a otro evento, facilitando la propagación y procesamiento en distintas etapas de la aplicación.

## Ejecución
Al iniciar el proyecto, mediante la clase principal de Spring Boot se invoca un método que genera y publica eventos de ejemplo (como UserRegisteredEvent). Automáticamente, los listeners registrados reaccionan, lo que puede ser verificado por mensajes en la consola que indican la publicación y escucha exitosa de dichos eventos.

## Beneficios de la programación orientada a eventos en Spring Boot
- Permite diseñar sistemas ampliamente desacoplados.
- Facilita la ampliación del sistema sin modificar componentes existentes.
- Ofrece un manejo claro y estructurado de sucesos y respuestas dentro de la aplicación.

## Notas finales
Este proyecto sirve como base para desarrollar aplicaciones que hacen uso intensivo del patrón de diseño orientado a eventos con Spring Boot. Se recomienda explorar y extender la lógica de los eventos y listeners para adaptarla a casos más complejos y reales.
