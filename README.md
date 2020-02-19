# Practica uno del curso de Mapeo obejto relaciónal

# JPA con Java, ejecutando con Maven 

Requerimeintos
Maven 3.3+ require JDK 1.7 or above to execute - they still allow you to build against 1.3 and other JDK versions by Using Toolchains

Puntos vistos

1. Persistence Unit (unidad de persistencia): Se configura dentro de un archivo persistence.xml y cada unidad de persistencia define:
    - Proveedor de JPA
    - Propiedades de la conexión JDBC o JNDI
    - Propiedades de la Base de Datos
    - Dialecto a utilizar (de acuerdo al proveedor y al tipo de BD)

2. EntityManagerFactory: Permite crear un EntityManager que pueda acceder y modificar el persistence unit que se le indique del archivo persistence.xml

3. EntityManager: Permite realizar consultas a una base de datos 

4. Annotations básicos para mapeos de tablas

5. Estrategia sequence