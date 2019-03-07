# parcial-1

# Punto 1
Haga que el programa divida y paralelice la búsqueda en exactamente 4 hilos de ejecución.

# Punto 2
Haga que el programa mantenga inactivos los hilos (sin esperas activas!), hasta tanto se detecte que el computador no tiene actividad (en este caso, cuando se completen 10 segundos sin detectar actividad en el teclado). Del mismo modo, una vez se detecte actividad del teclado, los hilos deberían nuevamente suspenderse (de nuevo, hasta tanto se detece la inactividad del teclado por al menos 10 segundos)

# Punto 3
En el proyecto GuidFinderAPI construya un API rest que registre y consulte historicos de las busquedas realizadas. Cada vez que finaliza una búsqueda el sistema debería registrar (por medio del api rest ) los siguientes datos Fecha de busqueda, UUID buscado,cantidad encontrada

De igual manera el API rest debería permitir la consulta de todas las busquedas de UUID´s utilizando la siguiente representación JSON

{ "Fecha":"2019-02-21T05:10:00", "Guid":"d0692660-c39a-4d73-9496-d9df0c4ebdf3", "Count":0 }

Almacene dicha información en memoria volatil

Utilice el nombre del recurso "uuid" es decir cuando se trate de acceder al recurso para consultarlo la url debería serhttp://localhost:8080/uuid utilizando el verbo GET

y para registrarlo debería ser la misma pero usando el verbo POST

# Preguntas Teoría
Conteste las siguientes preguntas en una archivo .txt

1. Establezca verdadero o falso en las siguientes sentencias:
		1. Rest es un protocolo que permite la interoperabilidad
		2. Rest es una tecnología que está basada sobre el protocolo http
		3. SOAP es un protocolo que tiene el objetivo transferir mensajes entre aplicaciones distribuidas
		4. Los componentes de rest son nouns,Adjectives,Representations
		5. SOA es un protocolo de transferencia de mensajes entre aplicaciones distribuidas
2. Explique cada uno de los niveles de madurez de REST (Gloria REST)
3. Cuales son los componentes del SOAP-ENVELOPE y para que sirven
4. Defina la diferencia de un estilo arquitectónico cliente servidor y un P2P
5. Escriba un ejemplo de un programa P2P y explique por que es P2P
6. Qué es WSDL y para que sirve?
7. Explique que significa que un objeto sea Thread-Safety
8. Explique los tipos y las variables atómicas. 

# Nota
Punto 1 y 2 Proyecto GuidFinderDesktop Punto 3 Proyecto GuidFinderAPI



------------Parcial de primer tercio Karen Mora------------
