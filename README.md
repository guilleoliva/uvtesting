Requisitos técnicos
-------------
- GIT
- JDK
- Maven 3.1.1
- Editor de código java


Reglas introducidas por negocio
-------------------------------------------

Para calcular la nómina neta se aplicarán las siguientes condiciones: Si el salario bruto es menor de 1000 euros, no se aplicará ninguna retención. Para salarios a partir de 1000 euros, y menores de 1500 euros se les aplicará un 16%, y a los salarios a partir de 1500 euros se les aplicará un 18%. 

Para calcular la nómina bruta la regla a aplicar será la siguiente : El salario base será 1000 euros si el empleado es de tipo *repartidor*, y de 1500 euros si es de tipo *encargado*. A esta cantidad se le sumará una prima de 100 euros si ha vendido entre 1000 y 1499 euros, y de 200 euros si vende más de 1500 euros. Por último, cada hora extra se pagará a 20 euros. 

Casos de prueba
----------------------

Método  | Entrada | Salida 
---------- | ---------- | --------
calculaNominaNeta |	2000 |	1640
calculaNominaNeta |	1500 	|1230
calculaNominaNeta 	|1499.99 |	1259.9916
calculaNominaNeta 	|1250 	|1050
calculaNominaNeta 	|1000 	|840
calculaNominaNeta 	|999.99 	|999.99
calculaNominaNeta 	|500 	|500
calculaNominaNeta 	|0 	|0
calculaNominaNeta 	|-1 	|Exception
calculaNominaBruta 	|repartidor, 2000 euros, 8h 	|1360
calculaNominaBruta 	|repartidor, 1500 euros, 3h 	|1260
calculaNominaBruta 	|encargado, 1250 euros, 8h 	|1760
calculaNominaBruta 	|encargado, 1000 euros, 0h 	|1600
calculaNominaBruta 	|encargado, 500 euros, 0h 	|1500
calculaNominaBruta 	|encargado, 0 euros, 8h 	|1660
calculaNominaBruta 	|null, 1500 euros, 8h 	|Exception





