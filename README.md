Aunque los arrays de Object te permiten almacenar diferentes tipos, a menudo es más seguro y legible utilizar Colecciones Genéricas de Java, como List<Object>, ArrayList<Object>, etc. 
Las colecciones genéricas, aunque también pueden almacenar Object si se parametrizan de esa manera, ofrecen más flexibilidad y a menudo se utilizan con tipos específicos 
para proporcionar seguridad de tipos en tiempo de compilación.

Sin embargo, si la necesidad específica es tener un array que pueda contener una variedad de tipos, el array de Object es la forma de lograrlo en Java.

//
Consideraciones importantes al usar arrays de Object:

Pérdida de información de tipo en tiempo de compilación: Al almacenar diferentes tipos en un array de Object, el compilador ya no puede verificar el tipo específico de cada elemento.
Necesidad de "casting" (conversión de tipo): Cuando recuperas un elemento de un array de Object y quieres usarlo como su tipo original, 
generalmente necesitas realizar un "casting" explícito. Si el tipo al que intentas castear no es el correcto, se producirá una excepción ClassCastException en tiempo de ejecución.
