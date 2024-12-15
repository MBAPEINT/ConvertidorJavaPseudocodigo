# Convertidor de Java a Pseudocódigo 🖥️📝

## Descripción
Un programa educativo diseñado para convertir código Java a pseudocódigo en español, facilitando el aprendizaje de conceptos de programación.

## Características
- Convierte código Java a pseudocódigo en español
- Ideal para estudiantes y docentes de programación
- Interfaz gráfica intuitiva

## Requisitos
- Java Development Kit (JDK) 23
- Entorno de desarrollo compatible (Eclipse, IntelliJ, NetBeans)

## Instalación
1. Clonar el repositorio
```bash
git clone https://github.com/MBAPEINT/ConvertidorJavaPseudocodigo.git
```
2. Abrir el proyecto en su IDE preferido
3. Compilar y ejecutar la clase `ProyectoFinal.java`

## Ejemplos de Conversión 📝

### Ejemplo 1: Algoritmo de Ordenamiento MergeSort

#### Código Java Original
```java
public class OrdenamientoMergeSort {

    public static void main(String[] args) {

        // Definir un arreglo de enteros

        int[] numeros = {64, 25, 12, 22, 11};

        System.out.println("Arreglo original:");

        imprimirArreglo(numeros);

        // Llamar a la función de ordenamiento MergeSort

        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("\nArreglo ordenado:");

        imprimirArreglo(numeros);

    }

    // Función principal de MergeSort

    public static void mergeSort(int[] arreglo, int izquierda, int derecha) {

        if (izquierda < derecha) {

            // Encontrar el punto medio del arreglo

            int medio = (izquierda + derecha) / 2;

            // Ordenar la primera mitad

            mergeSort(arreglo, izquierda, medio);

            // Ordenar la segunda mitad

            mergeSort(arreglo, medio + 1, derecha);

            // Combinar las dos mitades ordenadas

            merge(arreglo, izquierda, medio, derecha);

        }

    }

    // Función para combinar dos subarreglos en un arreglo ordenado

    public static void merge(int[] arreglo, int izquierda, int medio, int derecha) {

        // Calcular los tamaños de los subarreglos

        int n1 = medio - izquierda + 1;

        int n2 = derecha - medio;

        // Crear arreglos temporales para los subarreglos

        int[] izquierdaArray = new int[n1];

        int[] derechaArray = new int[n2];

        // Copiar los datos a los subarreglos

        for (int i = 0; i < n1; i++) {

            izquierdaArray[i] = arreglo[izquierda + i];

        }

        for (int j = 0; j < n2; j++) {

            derechaArray[j] = arreglo[medio + 1 + j];

        }

        // Combinar los subarreglos en el arreglo original

        int i = 0;

        int j = 0;

        int k = izquierda;

        while (i < n1 && j < n2) {

            if (izquierdaArray[i] <= derechaArray[j]) {

                arreglo[k] = izquierdaArray[i];

                i++;

            } else {

                arreglo[k] = derechaArray[j];

                j++;

            }

            k++;

        }

        // Copiar los elementos restantes de izquierdaArray, si los hay

        while (i < n1) {

            arreglo[k] = izquierdaArray[i];

            i++;

            k++;

        }

        // Copiar los elementos restantes de derechaArray, si los hay

        while (j < n2) {

            arreglo[k] = derechaArray[j];

            j++;

            k++;

        }

    }

    // Función para imprimir el arreglo

    public static void imprimirArreglo(int[] arreglo) {

        for (int num : arreglo) {

            System.out.print(num + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE OrdenamientoMergeSort

    PROCEDIMIENTO main(String[] args)

        // Definir un arreglo de enteros

    numeros <- {64, 25, 12, 22, 11}

        ESCRIBIR CON SALTO "Arreglo original:"

        imprimirArreglo(numeros)

        // Llamar a la función de ordenamiento MergeSort

        mergeSort(numeros, 0, numeros.length - 1)

        ESCRIBIR CON SALTO "\nArreglo ordenado:"

        imprimirArreglo(numeros)

    FIN

    // Función principal de MergeSort

    PROCEDIMIENTO mergeSort(int[] arreglo, int izquierda, int derecha)

        SI izquierda  ES MENOR QUE  derecha ENTONCES

            // Encontrar el punto medio del arreglo

            int medio <- (izquierda + derecha) / 2

            // Ordenar la primera mitad

            mergeSort(arreglo, izquierda, medio)

            // Ordenar la segunda mitad

            mergeSort(arreglo, medio + 1, derecha)

            // Combinar las dos mitades ordenadas

            merge(arreglo, izquierda, medio, derecha)

        FIN

    FIN

    // Función para combinar dos subarreglos en un arreglo ordenado

    PROCEDIMIENTO merge(int[] arreglo, int izquierda, int medio, int derecha)

        // Calcular los tamaños de los subarreglos

        int n1 <- medio - izquierda + 1

        int n2 <- derecha - medio

        // Crear arreglos temporales para los subarreglos

        DIMENSION izquierdaArray[n1]

        DIMENSION derechaArray[n2]

        // Copiar los datos a los subarreglos

        PARA i <- 0 HASTA n1 HACER

            izquierdaArray[i] <- arreglo[izquierda + i]

        FIN

        PARA j <- 0 HASTA n2 HACER

            derechaArray[j] <- arreglo[medio + 1 + j]

        FIN

        // Combinar los subarreglos en el arreglo original

        int i <- 0

        int j <- 0

        int k <- izquierda

        MIENTRAS i  ES MENOR QUE  n1  Y  j  ES MENOR QUE  n2 HACER

            SI izquierdaArray[i]  ES MENOR O IGUAL QUE  derechaArray[j] ENTONCES

                arreglo[k] <- izquierdaArray[i]

                i <- i + 1

            SINO

                arreglo[k] <- derechaArray[j]

                j <- j + 1

            FIN

            k <- k + 1

        FIN

        // Copiar los elementos restantes de izquierdaArray, si los hay

        MIENTRAS i  ES MENOR QUE  n1 HACER

            arreglo[k] <- izquierdaArray[i]

            i <- i + 1

            k <- k + 1

        FIN

        // Copiar los elementos restantes de derechaArray, si los hay

        MIENTRAS j  ES MENOR QUE  n2 HACER

            arreglo[k] <- derechaArray[j]

            j <- j + 1

            k <- k + 1

        FIN

    FIN

    // Función para imprimir el arreglo

    PROCEDIMIENTO imprimirArreglo(int[] arreglo)

        PARA CADA num EN arreglo HACER

            ESCRIBIR SIN SALTAR num + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 2: Algoritmo de Ordenamiento QuickSort

#### Código Java Original
```java
public class OrdenamientoQuickSort {

    public static void main(String[] args) {

        // Definir un arreglo de ejemplo

        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        

        System.out.println("Arreglo original:");

        imprimirArreglo(numeros);

        

        // Llamar al método de ordenamiento

        quickSort(numeros, 0, numeros.length - 1);

        

        System.out.println("\nArreglo ordenado:");

        imprimirArreglo(numeros);

    }

    

    // Método principal de QuickSort

    public static void quickSort(int[] arreglo, int inicio, int fin) {

        if (inicio < fin) {

            // Obtener el índice del pivote

            int indicePivote = particion(arreglo, inicio, fin);

            

            // Ordenar recursivamente las dos mitades

            quickSort(arreglo, inicio, indicePivote - 1);

            quickSort(arreglo, indicePivote + 1, fin);

        }

    }

    

    // Método para hacer la partición

    private static int particion(int[] arreglo, int inicio, int fin) {

        // Usar el último elemento como pivote

        int pivote = arreglo[fin];

        int i = inicio - 1;

        

        // Mover elementos menores que el pivote a la izquierda

        for (int j = inicio; j < fin; j++) {

            if (arreglo[j] <= pivote) {

                i++;

                intercambiar(arreglo, i, j);

            }

        }

        

        // Colocar el pivote en su posición correcta

        intercambiar(arreglo, i + 1, fin);

        return i + 1;

    }

    

    // Método para intercambiar elementos

    private static void intercambiar(int[] arreglo, int i, int j) {

        int temporal = arreglo[i];

        arreglo[i] = arreglo[j];

        arreglo[j] = temporal;

    }

    

    // Método para imprimir el arreglo

    public static void imprimirArreglo(int[] arreglo) {

        for (int numero : arreglo) {

            System.out.print(numero + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE OrdenamientoQuickSort

    PROCEDIMIENTO main(String[] args)

        // Definir un arreglo de ejemplo

    numeros <- {64, 34, 25, 12, 22, 11, 90}

        ESCRIBIR CON SALTO "Arreglo original:"

        imprimirArreglo(numeros)

        // Llamar al método de ordenamiento

        quickSort(numeros, 0, numeros.length - 1)

        ESCRIBIR CON SALTO "\nArreglo ordenado:"

        imprimirArreglo(numeros)

    FIN

    // Método principal de QuickSort

    PROCEDIMIENTO quickSort(int[] arreglo, int inicio, int fin)

        SI inicio  ES MENOR QUE  fin ENTONCES

            // Obtener el índice del pivote

            int indicePivote <- particion(arreglo, inicio, fin)

            // Ordenar recursivamente las dos mitades

            quickSort(arreglo, inicio, indicePivote - 1)

            quickSort(arreglo, indicePivote + 1, fin)

        FIN

    FIN

    // Método para hacer la partición

    PROCEDIMIENTO particion(int[] arreglo, int inicio, int fin)

        // Usar el último elemento como pivote

        int pivote <- arreglo[fin]

        int i <- inicio - 1

        // Mover elementos menores que el pivote a la izquierda

        PARA j <- inicio HASTA fin HACER

            SI arreglo[j]  ES MENOR O IGUAL QUE  pivote ENTONCES

                i <- i + 1

                intercambiar(arreglo, i, j)

            FIN

        FIN

        // Colocar el pivote en su posición correcta

        intercambiar(arreglo, i + 1, fin)

        RETORNAR i + 1

    FIN

    // Método para intercambiar elementos

    PROCEDIMIENTO intercambiar(int[] arreglo, int i, int j)

        int temporal <- arreglo[i]

        arreglo[i] <- arreglo[j]

        arreglo[j] <- temporal

    FIN

    // Método para imprimir el arreglo

    PROCEDIMIENTO imprimirArreglo(int[] arreglo)

        PARA CADA numero EN arreglo HACER

            ESCRIBIR SIN SALTAR numero + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 3: Algoritmo de Ordenamiento BubbleSort

#### Código Java Original
```java
public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        // Definir un arreglo de ejemplo

        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        

        System.out.println("Arreglo original:");

        imprimirArreglo(numeros);

        

        // Llamar al método de ordenamiento

        bubbleSort(numeros);

        

        System.out.println("\nArreglo ordenado:");

        imprimirArreglo(numeros);

        

        // Probar con otro arreglo

        int[] otrosNumeros = {100, 50, 75, 25, 33, 67};

        System.out.println("\nSegundo arreglo original:");

        imprimirArreglo(otrosNumeros);

        

        bubbleSort(otrosNumeros);

        

        System.out.println("\nSegundo arreglo ordenado:");

        imprimirArreglo(otrosNumeros);

    }

    

    // Método de ordenamiento burbuja

    public static void bubbleSort(int[] arreglo) {

        int n = arreglo.length;

        boolean intercambioRealizado;

        

        for (int i = 0; i < n - 1; i++) {

            intercambioRealizado = false;

            

            // Burbujear el elemento más grande al final

            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    // Intercambiar elementos

                    int temp = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = temp;

                    intercambioRealizado = true;

                }

            }

            

            // Si no hubo intercambios, el arreglo ya está ordenado

            if (!intercambioRealizado) {

                break;

            }

        }

    }

    

    // Método para imprimir el arreglo

    public static void imprimirArreglo(int[] arreglo) {

        for (int numero : arreglo) {

            System.out.print(numero + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE OrdenamientoBurbuja

    PROCEDIMIENTO main(String[] args)

        // Definir un arreglo de ejemplo

    numeros <- {64, 34, 25, 12, 22, 11, 90}

        ESCRIBIR CON SALTO "Arreglo original:"

        imprimirArreglo(numeros)

        // Llamar al método de ordenamiento

        bubbleSort(numeros)

        ESCRIBIR CON SALTO "\nArreglo ordenado:"

        imprimirArreglo(numeros)

        // Probar con otro arreglo

    otrosNumeros <- {100, 50, 75, 25, 33, 67}

        ESCRIBIR CON SALTO "\nSegundo arreglo original:"

        imprimirArreglo(otrosNumeros)

        bubbleSort(otrosNumeros)

        ESCRIBIR CON SALTO "\nSegundo arreglo ordenado:"

        imprimirArreglo(otrosNumeros)

    FIN

    // Método de ordenamiento burbuja

    PROCEDIMIENTO bubbleSort(int[] arreglo)

        int n <- arreglo.length

        boolean intercambioRealizado

        PARA i <- 0 HASTA n - 1 HACER

            intercambioRealizado <- FALSO

            // Burbujear el elemento más grande al final

            PARA j <- 0 HASTA n - i - 1 HACER

                SI arreglo[j]  ES MAYOR QUE  arreglo[j + 1] ENTONCES

                    // Intercambiar elementos

                    int temp <- arreglo[j]

                    arreglo[j] <- arreglo[j + 1]

                    arreglo[j + 1] <- temp

                    intercambioRealizado <- VERDADERO

                FIN

            FIN

            // Si no hubo intercambios, el arreglo ya está ordenado

            SI !intercambioRealizado ENTONCES

                break

            FIN

        FIN

    FIN

    // Método para imprimir el arreglo

    PROCEDIMIENTO imprimirArreglo(int[] arreglo)

        PARA CADA numero EN arreglo HACER

            ESCRIBIR SIN SALTAR numero + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 4: Algoritmo de Búsqueda Secuencial

#### Código Java Original
```java
public class BusquedaSecuencial {

    public static void main(String[] args) {

        // Crear el arreglo de números

        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        

        System.out.println("Arreglo original:");

        imprimirArreglo(numeros);

        

        // Buscar varios números

        int[] buscar = {25, 11, 50};

        for (int numero : buscar) {

            int posicion = buscarNumero(numeros, numero);

            if (posicion != -1) {

                System.out.println("\nEl número " + numero + " está en la posición: " + posicion);

            } else {

                System.out.println("\nEl número " + numero + " no se encontró en el arreglo");

            }

        }

        

        // Contar números mayores que un valor

        int valor = 30;

        int cantidad = contarMayores(numeros, valor);

        System.out.println("\nHay " + cantidad + " números mayores que " + valor);

    }

    

    // Método de búsqueda secuencial

    public static int buscarNumero(int[] arreglo, int objetivo) {

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == objetivo) {

                return i;

            }

        }

        return -1;

    }

    

    // Método para contar números mayores que un valor

    public static int contarMayores(int[] arreglo, int valor) {

        int contador = 0;

        int i = 0;

        

        while (i < arreglo.length) {

            if (arreglo[i] > valor) {

                contador++;

            }

            i++;

        }

        

        return contador;

    }

    

    // Método para imprimir el arreglo

    public static void imprimirArreglo(int[] arreglo) {

        for (int numero : arreglo) {

            System.out.print(numero + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE BusquedaSecuencial

    PROCEDIMIENTO main(String[] args)

        // Crear el arreglo de números

    numeros <- {64, 34, 25, 12, 22, 11, 90}

        ESCRIBIR CON SALTO "Arreglo original:"

        imprimirArreglo(numeros)

        // Buscar varios números

    buscar <- {25, 11, 50}

        PARA CADA numero EN buscar HACER

            int posicion <- buscarNumero(numeros, numero)

            SI posicion  ES DIFERENTE DE  -1 ENTONCES

                ESCRIBIR CON SALTO "\nEl número " + numero + " está en la posición: " + posicion

            SINO

                ESCRIBIR CON SALTO "\nEl número " + numero + " no se encontró en el arreglo"

            FIN

        FIN

        // Contar números mayores que un valor

        int valor <- 30

        int cantidad <- contarMayores(numeros, valor)

        ESCRIBIR CON SALTO "\nHay " + cantidad + " números mayores que " + valor

    FIN

    // Método de búsqueda secuencial

    PROCEDIMIENTO buscarNumero(int[] arreglo, int objetivo)

        PARA i <- 0 HASTA arreglo.length - 1 HACER

            SI arreglo[i]  ES IGUAL A  objetivo ENTONCES

                RETORNAR i

            FIN

        FIN

        RETORNAR -1

    FIN

    // Método para contar números mayores que un valor

    PROCEDIMIENTO contarMayores(int[] arreglo, int valor)

        int contador <- 0

        int i <- 0

        MIENTRAS i  ES MENOR QUE  arreglo.length HACER

            SI arreglo[i]  ES MAYOR QUE  valor ENTONCES

                contador <- contador + 1

            FIN

            i <- i + 1

        FIN

        RETORNAR contador

    FIN

    // Método para imprimir el arreglo

    PROCEDIMIENTO imprimirArreglo(int[] arreglo)

        PARA CADA numero EN arreglo HACER

            ESCRIBIR SIN SALTAR numero + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 5: Algoritmo de Ordenamiento por Selección

#### Código Java Original
```java
public class OrdenamientoSeleccion {

    public static void main(String[] args) {

        // Crear el arreglo de números

        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        

        System.out.println("Arreglo original:");

        imprimirArreglo(numeros);

        

        // Ordenar el arreglo

        ordenarPorSeleccion(numeros);

        

        System.out.println("\nArreglo ordenado:");

        imprimirArreglo(numeros);

        

        // Encontrar el mayor y menor elemento

        int maximo = encontrarMaximo(numeros);

        int minimo = encontrarMinimo(numeros);

        

        System.out.println("\nEl número mayor es: " + maximo);

        System.out.println("El número menor es: " + minimo);

    }

    

    // Método de ordenamiento por selección

    public static void ordenarPorSeleccion(int[] arreglo) {

        int n = arreglo.length;

        

        for (int i = 0; i < n - 1; i++) {

            // Encontrar el elemento mínimo en el arreglo desordenado

            int indiceMinimo = i;

            

            for (int j = i + 1; j < n; j++) {

                if (arreglo[j] < arreglo[indiceMinimo]) {

                    indiceMinimo = j;

                }

            }

            

            // Intercambiar el elemento mínimo encontrado con el primer elemento

            if (indiceMinimo != i) {

                int temp = arreglo[i];

                arreglo[i] = arreglo[indiceMinimo];

                arreglo[indiceMinimo] = temp;

            }

            

            // Mostrar el estado del arreglo después de cada intercambio

            System.out.print("Paso " + (i + 1) + ": ");

            imprimirArreglo(arreglo);

        }

    }

    

    // Método para encontrar el elemento máximo

    public static int encontrarMaximo(int[] arreglo) {

        int maximo = arreglo[0];

        for (int numero : arreglo) {

            if (numero > maximo) {

                maximo = numero;

            }

        }

        return maximo;

    }

    

    // Método para encontrar el elemento mínimo

    public static int encontrarMinimo(int[] arreglo) {

        int minimo = arreglo[0];

        for (int numero : arreglo) {

            if (numero < minimo) {

                minimo = numero;

            }

        }

        return minimo;

    }

    

    // Método para imprimir el arreglo

    public static void imprimirArreglo(int[] arreglo) {

        for (int numero : arreglo) {

            System.out.print(numero + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE OrdenamientoSeleccion

    PROCEDIMIENTO main(String[] args)

        // Crear el arreglo de números

    numeros <- {64, 34, 25, 12, 22, 11, 90}

        ESCRIBIR CON SALTO "Arreglo original:"

        imprimirArreglo(numeros)

        // Ordenar el arreglo

        ordenarPorSeleccion(numeros)

        ESCRIBIR CON SALTO "\nArreglo ordenado:"

        imprimirArreglo(numeros)

        // Encontrar el mayor y menor elemento

        int maximo <- encontrarMaximo(numeros)

        int minimo <- encontrarMinimo(numeros)

        ESCRIBIR CON SALTO "\nEl número mayor es: " + maximo

        ESCRIBIR CON SALTO "El número menor es: " + minimo

    FIN

    // Método de ordenamiento por selección

    PROCEDIMIENTO ordenarPorSeleccion(int[] arreglo)

        int n <- arreglo.length

        PARA i <- 0 HASTA n - 1 HACER

            // Encontrar el elemento mínimo en el arreglo desordenado

            int indiceMinimo <- i

            PARA j <- i + 1 HASTA n HACER

                SI arreglo[j]  ES MENOR QUE  arreglo[indiceMinimo] ENTONCES

                    indiceMinimo <- j

                FIN

            FIN

            // Intercambiar el elemento mínimo encontrado con el primer elemento

            SI indiceMinimo  ES DIFERENTE DE  i ENTONCES

                int temp <- arreglo[i]

                arreglo[i] <- arreglo[indiceMinimo]

                arreglo[indiceMinimo] <- temp

            FIN

            // Mostrar el estado del arreglo después de cada intercambio

            ESCRIBIR SIN SALTAR "Paso " + (i + 1) + ": "

            imprimirArreglo(arreglo)

        FIN

    FIN

    // Método para encontrar el elemento máximo

    PROCEDIMIENTO encontrarMaximo(int[] arreglo)

        int maximo <- arreglo[0]

        PARA CADA numero EN arreglo HACER

            SI numero  ES MAYOR QUE  maximo ENTONCES

                maximo <- numero

            FIN

        FIN

        RETORNAR maximo

    FIN

    // Método para encontrar el elemento mínimo

    PROCEDIMIENTO encontrarMinimo(int[] arreglo)

        int minimo <- arreglo[0]

        PARA CADA numero EN arreglo HACER

            SI numero  ES MENOR QUE  minimo ENTONCES

                minimo <- numero

            FIN

        FIN

        RETORNAR minimo

    FIN

    // Método para imprimir el arreglo

    PROCEDIMIENTO imprimirArreglo(int[] arreglo)

        PARA CADA numero EN arreglo HACER

            ESCRIBIR SIN SALTAR numero + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 6: Algoritmo de Búsqueda por Interpolación

#### Código Java Original
```java
public class BusquedaInterpolacion {

    public static void main(String[] args) {

        // Crear un arreglo ordenado de ejemplo

        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        

        System.out.println("Arreglo ordenado:");

        imprimirArreglo(numeros);

        

        // Números a buscar

        int[] busquedas = {8, 15, 20};

        

        // Realizar búsquedas

        for (int numeroBuscado : busquedas) {

            int resultado = busquedaInterpolacion(numeros, numeroBuscado);

            

            if (resultado != -1) {

                System.out.println("\nEl número " + numeroBuscado + " se encontró en la posición: " + resultado);

            } else {

                System.out.println("\nEl número " + numeroBuscado + " no se encontró en el arreglo");

            }

        }

        

        // Verificar si el arreglo está ordenado

        boolean estaOrdenado = verificarOrden(numeros);

        System.out.println("\nEl arreglo está ordenado: " + estaOrdenado);

    }

    

    // Método de búsqueda por interpolación

    public static int busquedaInterpolacion(int[] arreglo, int objetivo) {

        int bajo = 0;

        int alto = arreglo.length - 1;

        

        while (bajo <= alto && objetivo >= arreglo[bajo] && objetivo <= arreglo[alto]) {

            

            // Fórmula de interpolación

            int pos = bajo + (((alto - bajo) * (objetivo - arreglo[bajo])) / (arreglo[alto] - arreglo[bajo]));

            

            System.out.println("Buscando en posición: " + pos);

            

            if (arreglo[pos] == objetivo) {

                return pos;

            }

            

            if (arreglo[pos] < objetivo) {

                bajo = pos + 1;

            } else {

                alto = pos - 1;

            }

        }

        return -1;

    }

    

    // Método para verificar si el arreglo está ordenado

    public static boolean verificarOrden(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            if (arreglo[i] > arreglo[i + 1]) {

                return false;

            }

        }

        return true;

    }

    

    // Método para imprimir el arreglo

    public static void imprimirArreglo(int[] arreglo) {

        for (int numero : arreglo) {

            System.out.print(numero + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE BusquedaInterpolacion

    PROCEDIMIENTO main(String[] args)

        // Crear un arreglo ordenado de ejemplo

    numeros <- {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

        ESCRIBIR CON SALTO "Arreglo ordenado:"

        imprimirArreglo(numeros)

        // Números a buscar

    busquedas <- {8, 15, 20}

        // Realizar búsquedas

        PARA CADA numeroBuscado EN busquedas HACER

            int resultado <- busquedaInterpolacion(numeros, numeroBuscado)

            SI resultado  ES DIFERENTE DE  -1 ENTONCES

                ESCRIBIR CON SALTO "\nEl número " + numeroBuscado + " se encontró en la posición: " + resultado

            SINO

                ESCRIBIR CON SALTO "\nEl número " + numeroBuscado + " no se encontró en el arreglo"

            FIN

        FIN

        // Verificar si el arreglo está ordenado

        boolean estaOrdenado <- verificarOrden(numeros)

        ESCRIBIR CON SALTO "\nEl arreglo está ordenado: " + estaOrdenado

    FIN

    // Método de búsqueda por interpolación

    PROCEDIMIENTO busquedaInterpolacion(int[] arreglo, int objetivo)

        int bajo <- 0

        int alto <- arreglo.length - 1

        MIENTRAS bajo  ES MENOR O IGUAL QUE  alto  Y  objetivo  ES MAYOR O IGUAL QUE  arreglo[bajo]  Y  objetivo  ES MENOR O IGUAL QUE  arreglo[alto] HACER

            // Fórmula de interpolación

            int pos <- bajo + (((alto - bajo) * (objetivo - arreglo[bajo])) / (arreglo[alto] - arreglo[bajo]))

            ESCRIBIR CON SALTO "Buscando en posición: " + pos

            SI arreglo[pos]  ES IGUAL A  objetivo ENTONCES

                RETORNAR pos

            FIN

            SI arreglo[pos]  ES MENOR QUE  objetivo ENTONCES

                bajo <- pos + 1

            SINO

                alto <- pos - 1

            FIN

        FIN

        RETORNAR -1

    FIN

    // Método para verificar si el arreglo está ordenado

    PROCEDIMIENTO verificarOrden(int[] arreglo)

        PARA i <- 0 HASTA arreglo.length - 1 - 1 HACER

            SI arreglo[i]  ES MAYOR QUE  arreglo[i + 1] ENTONCES

                RETORNAR FALSO

            FIN

        FIN

        RETORNAR VERDADERO

    FIN

    // Método para imprimir el arreglo

    PROCEDIMIENTO imprimirArreglo(int[] arreglo)

        PARA CADA numero EN arreglo HACER

            ESCRIBIR SIN SALTAR numero + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 7: Análisis Estadístico y Distribución de Valores en un Array de Números Enteros

#### Código Java Original
```java
public class EstadisticasArray {

    public static void main(String[] args) {

        // Crear array de ejemplo

        int[] numeros = {64, 34, 25, 12, 22, 11, 90, 15, 8, 45};

        

        System.out.println("Array original:");

        imprimirArray(numeros);

        

        // Calcular estadísticas básicas

        double promedio = calcularPromedio(numeros);

        int maximo = encontrarMaximo(numeros);

        int minimo = encontrarMinimo(numeros);

        double desviacion = calcularDesviacionEstandar(numeros, promedio);

        

        // Mostrar resultados

        System.out.println("\nEstadísticas del array:");

        System.out.println("Promedio: " + promedio);

        System.out.println("Máximo: " + maximo);

        System.out.println("Mínimo: " + minimo);

        System.out.println("Desviación estándar: " + desviacion);

        

        // Contar números en rangos

        System.out.println("\nDistribución de números:");

        contarRangos(numeros);

        

        // Verificar propiedades

        if (tieneNumerosConsecutivos(numeros)) {

            System.out.println("\nEl array tiene números consecutivos");

        } else {

            System.out.println("\nEl array no tiene números consecutivos");

        }

    }

    

    // Calcular promedio

    public static double calcularPromedio(int[] array) {

        double suma = 0;

        for (int numero : array) {

            suma = suma + numero;

        }

        return suma / array.length;

    }

    

    // Calcular desviación estándar

    public static double calcularDesviacionEstandar(int[] array, double promedio) {

        double sumaCuadrados = 0;

        

        for (int i = 0; i < array.length; i++) {

            double diferencia = array[i] - promedio;

            sumaCuadrados = sumaCuadrados + (diferencia * diferencia);

        }

        

        return Math.sqrt(sumaCuadrados / array.length);

    }

    

    // Encontrar máximo

    public static int encontrarMaximo(int[] array) {

        int max = array[0];

        int i = 1;

        

        while (i < array.length) {

            if (array[i] > max) {

                max = array[i];

            }

            i = i + 1;

        }

        

        return max;

    }

    

    // Encontrar mínimo usando do-while

    public static int encontrarMinimo(int[] array) {

        int min = array[0];

        int i = 1;

        

        do {

            if (array[i] < min) {

                min = array[i];

            }

            i = i + 1;

        } while (i < array.length);

        

        return min;

    }

    

    // Contar números en rangos

    public static void contarRangos(int[] array) {

        int[] rangos = new int[4];  // 0-25, 26-50, 51-75, 76-100

        

        for (int numero : array) {

            if (numero <= 25) {

                rangos[0] = rangos[0] + 1;

            } else if (numero <= 50) {

                rangos[1] = rangos[1] + 1;

            } else if (numero <= 75) {

                rangos[2] = rangos[2] + 1;

            } else {

                rangos[3] = rangos[3] + 1;

            }

        }

        

        String[] nombresRangos = {"0-25", "26-50", "51-75", "76-100"};

        for (int i = 0; i < rangos.length; i++) {

            System.out.println("Rango " + nombresRangos[i] + ": " + rangos[i] + " números");

        }

    }

    

    // Verificar si hay números consecutivos

    public static boolean tieneNumerosConsecutivos(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (Math.abs(array[i] - array[j]) == 1) {

                    return true;

                }

            }

        }

        return false;

    }

    

    // Imprimir array

    public static void imprimirArray(int[] array) {

        for (int numero : array) {

            System.out.print(numero + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE EstadisticasArray

    PROCEDIMIENTO main(String[] args)

        // Crear array de ejemplo

    numeros <- {64, 34, 25, 12, 22, 11, 90, 15, 8, 45}

        ESCRIBIR CON SALTO "Array original:"

        imprimirArray(numeros)

        // Calcular estadísticas básicas

        double promedio <- calcularPromedio(numeros)

        int maximo <- encontrarMaximo(numeros)

        int minimo <- encontrarMinimo(numeros)

        double desviacion <- calcularDesviacionEstandar(numeros, promedio)

        // Mostrar resultados

        ESCRIBIR CON SALTO "\nEstadísticas del array:"

        ESCRIBIR CON SALTO "Promedio: " + promedio

        ESCRIBIR CON SALTO "Máximo: " + maximo

        ESCRIBIR CON SALTO "Mínimo: " + minimo

        ESCRIBIR CON SALTO "Desviación estándar: " + desviacion

        // Contar números en rangos

        ESCRIBIR CON SALTO "\nDistribución de números:"

        contarRangos(numeros)

        // Verificar propiedades

        SI tieneNumerosConsecutivos(numeros ENTONCES

            ESCRIBIR CON SALTO "\nEl array tiene números consecutivos"

        SINO

            ESCRIBIR CON SALTO "\nEl array no tiene números consecutivos"

        FIN

    FIN

    // Calcular promedio

    PROCEDIMIENTO calcularPromedio(int[] array)

        double suma <- 0

        PARA CADA numero EN array HACER

            suma <- suma + numero

        FIN

        RETORNAR suma / array.length

    FIN

    // Calcular desviación estándar

    PROCEDIMIENTO calcularDesviacionEstandar(int[] array, double promedio)

        double sumaCuadrados <- 0

        PARA i <- 0 HASTA array.length - 1 HACER

            double diferencia <- array[i] - promedio

            sumaCuadrados <- sumaCuadrados + (diferencia * diferencia)

        FIN

        RETORNAR Math.sqrt(sumaCuadrados / array.length)

    FIN

    // Encontrar máximo

    PROCEDIMIENTO encontrarMaximo(int[] array)

        int max <- array[0]

        int i <- 1

        MIENTRAS i  ES MENOR QUE  array.length HACER

            SI array[i]  ES MAYOR QUE  max ENTONCES

                max <- array[i]

            FIN

            i <- i + 1

        FIN

        RETORNAR max

    FIN

    // Encontrar mínimo usando do-while

    PROCEDIMIENTO encontrarMinimo(int[] array)

        int min <- array[0]

        int i <- 1

        HACER

            SI array[i]  ES MENOR QUE  min ENTONCES

                min <- array[i]

            FIN

            i <- i + 1

        MIENTRAS i  ES MENOR QUE  array.length

        RETORNAR min

    FIN

    // Contar números en rangos

    PROCEDIMIENTO contarRangos(int[] array)

        DIMENSION rangos[4]

        PARA CADA numero EN array HACER

            SI numero  ES MENOR O IGUAL QUE  25 ENTONCES

                rangos[0] <- rangos[0] + 1

            SINO SI numero ES MENOR O IGUAL QUE 50 ENTONCES

                rangos[1] <- rangos[1] + 1

            SINO SI numero ES MENOR O IGUAL QUE 75 ENTONCES

                rangos[2] <- rangos[2] + 1

            SINO

                rangos[3] <- rangos[3] + 1

            FIN

        FIN

    nombresRangos <- {"0-25", "26-50", "51-75", "76-100"}

        PARA i <- 0 HASTA rangos.length - 1 HACER

            ESCRIBIR CON SALTO "Rango " + nombresRangos[i] + ": " + rangos[i] + " números"

        FIN

    FIN

    // Verificar si hay números consecutivos

    PROCEDIMIENTO tieneNumerosConsecutivos(int[] array)

        PARA i <- 0 HASTA array.length - 1 - 1 HACER

            PARA j <- i + 1 HASTA array.length - 1 HACER

                SI Math.abs(array[i] - array[j]) ES IGUAL A 1 ENTONCES

                    RETORNAR VERDADERO

                FIN

            FIN

        FIN

        RETORNAR FALSO

    FIN

    // Imprimir array

    PROCEDIMIENTO imprimirArray(int[] array)

        PARA CADA numero EN array HACER

            ESCRIBIR SIN SALTAR numero + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

### Ejemplo 8: Algoritmo de Cifrado Cesar

#### Código Java Original
```java
public class CifradoCesar {

    public static void main(String[] args) {

        // Definir el mensaje como números (códigos ASCII)

        int[] mensaje = {72, 111, 108, 97, 32, 77, 117, 110, 100, 111, 33};  // "Hola Mundo!"

        int desplazamiento = 3;

        

        System.out.println("Mensaje original:");

        imprimirMensaje(mensaje);

        

        // Cifrar el mensaje

        int[] mensajeCifrado = cifrar(mensaje, desplazamiento);

        System.out.println("\nMensaje cifrado:");

        imprimirMensaje(mensajeCifrado);

        

        // Descifrar el mensaje

        int[] mensajeDescifrado = cifrar(mensajeCifrado, 26 - desplazamiento);

        System.out.println("\nMensaje descifrado:");

        imprimirMensaje(mensajeDescifrado);

        

        // Mostrar estadísticas

        mostrarEstadisticas(mensaje);

    }

    

    public static int[] cifrar(int[] mensaje, int desplazamiento) {

        int longitud = mensaje.length;

        int[] resultado = new int[longitud];

        

        for (int i = 0; i < longitud; i++) {

            int valor = mensaje[i];

            

            if (valor >= 65 && valor <= 90) {  // Mayúsculas

                resultado[i] = ((valor - 65 + desplazamiento) % 26) + 65;

            } else if (valor >= 97 && valor <= 122) {  // Minúsculas

                resultado[i] = ((valor - 97 + desplazamiento) % 26) + 97;

            } else {

                resultado[i] = valor;

            }

        }

        

        return resultado;

    }

    

    public static void mostrarEstadisticas(int[] mensaje) {

        int letras = 0;

        int numeros = 0;

        int espacios = 0;

        int otros = 0;

        

        for (int i = 0; i < mensaje.length; i++) {

            int valor = mensaje[i];

            

            if ((valor >= 65 && valor <= 90) || (valor >= 97 && valor <= 122)) {

                letras = letras + 1;

            } else if (valor >= 48 && valor <= 57) {

                numeros = numeros + 1;

            } else if (valor == 32) {

                espacios = espacios + 1;

            } else {

                otros = otros + 1;

            }

        }

        

        System.out.println("\nEstadísticas del mensaje:");

        System.out.println("Letras: " + letras);

        System.out.println("Números: " + numeros);

        System.out.println("Espacios: " + espacios);

        System.out.println("Otros caracteres: " + otros);

    }

    

    public static void imprimirMensaje(int[] mensaje) {

        for (int i = 0; i < mensaje.length; i++) {

            System.out.print(mensaje[i] + " ");

        }

        System.out.println();

    }

}
```

#### Pseudocódigo Generado
```
INICIO CLASE CifradoCesar

    PROCEDIMIENTO main(String[] args)

        // Definir el mensaje como números (códigos ASCII)

    mensaje <- {72, 111, 108, 97, 32, 77, 117, 110, 100, 111, 33}

        int desplazamiento <- 3

        ESCRIBIR CON SALTO "Mensaje original:"

        imprimirMensaje(mensaje)

        // Cifrar el mensaje

        int[] mensajeCifrado <- cifrar(mensaje, desplazamiento)

        ESCRIBIR CON SALTO "\nMensaje cifrado:"

        imprimirMensaje(mensajeCifrado)

        // Descifrar el mensaje

        int[] mensajeDescifrado <- cifrar(mensajeCifrado, 26 - desplazamiento)

        ESCRIBIR CON SALTO "\nMensaje descifrado:"

        imprimirMensaje(mensajeDescifrado)

        // Mostrar estadísticas

        mostrarEstadisticas(mensaje)

    FIN

    PROCEDIMIENTO cifrar(int[] mensaje, int desplazamiento)

        int longitud <- mensaje.length

        DIMENSION resultado[longitud]

        PARA i <- 0 HASTA longitud HACER

            int valor <- mensaje[i]

            SI valor  ES MAYOR O IGUAL QUE  65  Y  valor  ES MENOR O IGUAL QUE  90 ENTONCES

                resultado[i] <- ((valor - 65 + desplazamiento) % 26) + 65

            SINO SI valor ES MAYOR O IGUAL QUE 97 Y valor ES MENOR O IGUAL QUE 122 ENTONCES // Minúsculas

                resultado[i] <- ((valor - 97 + desplazamiento) % 26) + 97

            SINO

                resultado[i] <- valor

            FIN

        FIN

        RETORNAR resultado

    FIN

    PROCEDIMIENTO mostrarEstadisticas(int[] mensaje)

        int letras <- 0

        int numeros <- 0

        int espacios <- 0

        int otros <- 0

        PARA i <- 0 HASTA mensaje.length - 1 HACER

            int valor <- mensaje[i]

            SI (valor  ES MAYOR O IGUAL QUE  65  Y  valor  ES MENOR O IGUAL QUE  90 ENTONCES

                letras <- letras + 1

            SINO SI valor ES MAYOR O IGUAL QUE 48 Y valor ES MENOR O IGUAL QUE 57 ENTONCES

                numeros <- numeros + 1

            SINO SI valor ES IGUAL A 32 ENTONCES

                espacios <- espacios + 1

            SINO

                otros <- otros + 1

            FIN

        FIN

        ESCRIBIR CON SALTO "\nEstadísticas del mensaje:"

        ESCRIBIR CON SALTO "Letras: " + letras

        ESCRIBIR CON SALTO "Números: " + numeros

        ESCRIBIR CON SALTO "Espacios: " + espacios

        ESCRIBIR CON SALTO "Otros caracteres: " + otros

    FIN

    PROCEDIMIENTO imprimirMensaje(int[] mensaje)

        PARA i <- 0 HASTA mensaje.length - 1 HACER

            ESCRIBIR SIN SALTAR mensaje[i] + " "

        FIN

        ESCRIBIR CON SALTO 

    FIN

FIN
```

## Limitaciones ⚠️

### 1. Clases Internas
No maneja clases internas o anidadas.

```java
// NO FUNCIONA
private static class Nodo {
    int valor;
    Nodo siguiente;
}
```

### 2. Caracteres
Solo acepta caracteres con comillas dobles.

```java
// NO FUNCIONA
char c = 'A';

// USAR
char c = "A";
```

### 3. Arrays Multidimensionales
Soporta únicamente arrays unidimensionales.

```java
// NO FUNCIONA
int[][] matriz = new int[3][3];

// USAR
int[] array = new int[9];
```

### 4. Imports
No acepta imports o librerías externas.

```java
// NO FUNCIONA
import java.util.Scanner;

// USAR solo clases básicas de Java
```

### 5. Incrementos en Arrays
No permite el operador de incremento en arrays.

```java
// NO FUNCIONA
array[i]++;

// USAR
array[i] = array[i] + 1;
```

### 6. Métodos String
No soporta métodos de String con paréntesis.

```java
// NO FUNCIONA
texto.length();

// USAR
texto.length;
```

### 7. Operador Ternario
No maneja operadores ternarios.

```java
// NO FUNCIONA
int x = (a > b) ? a : b;

// USAR if-else tradicional
if (a > b) {
    x = a;
} else {
    x = b;
}
```

## Propósito Educativo 🎓
Estas limitaciones están diseñadas para:
- Simplificar el código
- Facilitar el aprendizaje
- Promover prácticas de programación claras y directas

## Archivos Principales
- `src/proyectofinal/entradaCup.jflex`: Analizador léxico para CUP
- `src/proyectofinal/Grammar.cup`: Gramática para el analizador sintáctico
- `src/proyectofinal/Interfaz.java`: Interfaz gráfica del programa
- `src/proyectofinal/entrada.jflex`: Analizador léxico principal

### Descripción de los Archivos
- **entradaCup.jflex**: Define los tokens y patrones léxicos para el analizador CUP
- **Grammar.cup**: Define la gramática y reglas de producción para el análisis sintáctico
- **Interfaz.java**: Implementa la interfaz gráfica de usuario
- **entrada.jflex**: Analizador léxico principal para el procesamiento inicial