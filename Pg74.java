// /**
//  * Mostrar fotos y luego imprime identidad y edad.
//  * @param identidad
//  * @param edad
//  * @see SEN FACTORIZAR
//  */

// void visualizarDatos(String identidad, int edad){
//     mostrarFoto();
//     System.out.println("identidad: " + identidad);
//     System.out.println("edad: " + edad);
// }

// Reduccion logica

/**
 * Mostrar fotos y luego imprime identidad y edad.
 * @param ident
 * @param edad
 * @see FACTORIZADO
 */

void visualizarDatosRef(String ident, int edad){
    mostrarFoto();
    mostrarDatos(ident, edad);
}

/**
 * Imprime identidad y edad.
 * @param ident
 * @param anos
 * @see FACTORIZADO
 */

void mostrarDatos(String ident, int anos){
    System.out.println("identidad: " + ident);
    System.out.println("anos: " + anos);
}