# Apprentice-BigO-lists

# 1.- A partir de las siguientes instrucciones implementaremos una lista simplemente ligada con sus operaciones principales.

Linked List Operations:

 Preparación:
 Crearemos dos clases, la primera sera la implementación de la lista, la llamaremos MyList la cual contendrá una referencia
 a un elemento Nodo, la segunda clase la llamaremos
 Nodo la cual contendrá un Integer y una referencia a un Nodo. 

 Inserción al inicio:
 1.- Apuntar al nodo inicio de la lista desde el apuntador del nuevo nodo.
 2.- Apuntar la cabeza de la lista al nuevo nodo.

 Inserción con índice:
 Teniendo a n como el índice de inserción.
 1.- Iterar a través de la lista hasta la posición n - 1.
 2.- Utilizar el apuntador del nuevo nodo para apuntar al elemento siguiente del nodo encontrado(n -1).
 3.- Utilizar el apuntador del nodo encontrado(n - 1) para apuntar al nuevo elemento de la lista.
 4.- Agregaremos una validación para detectar indices fuera de rango, si terminamos de iterar la lista y no hemos llegado al
   índice especificado entonces el indice esta fuera de rango y debemos informar del error.

 Eliminación:
 1.- Iteramos a través de la lista hasta encontrar el elemento anterior al que deseamos eliminar.
 2.- Utilizamos el elemento anterior para apuntar al elemento que apunta el nodo que deseamos eliminar.

Busqueda:
 1.- Iteramos la lista hasta encontrar el valor que buscamos.
 2.- Regresamos el valor del nodo encontrado.


# 2.- Modificaremos la lista anterior para implementaremos ahora una lista doblemente ligada, seguiremos las instrucciones para modificar cada uno de las operaciones como sea necesario.

 Double Linked list

 Preparación:
  Agregaremos otra referencia a un Nodo en la clase Nodo que nos servira para apuntar al Nodo anterior.

 Inserción con índice:
   1.- En este casos no necesitamos obtener primer el elemento anterior puesto que cada Nodo de la lista tiene ahora un
   apuntador al elemento anterior.
   2.- Hacemos que el primer apuntador al nuevo Nodo apunte al elemento encontrado en el índice especificado.
   3.- Hacemos que el segundo apuntador del nuevo Nodo apunte al elemento anterior al elemento encontrado, podemos hacer
       esto a través del segundo apuntador del elemento encontrado. 

 Eliminación
  1.- En este casos no necesitamos obtener primer el elemento anterior puesto que cada Nodo de la lista tiene ahora un
      apuntador al elemento anterior.
  2.- Hacemos que el Nodo anterior al que vamos a eliminar apunte al siguiente Nodo del que vamos a eliminar.
