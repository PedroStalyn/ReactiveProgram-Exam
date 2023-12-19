
package ec.edu.espoch.exa.reactiveprogra;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;


public class ExaReactiveProgra {

    public static void main(String[] args) {
        int numero = 5; // Número para el cual generaremos la tabla de multiplicar

        // Crear un observable de números del 1 al 10
        Observable<Integer> numerosObservable = Observable.range(1, 10);

        // Aplicar una transformación para obtener la tabla de multiplicar
        Observable<String> tablaMultiplicarObservable = numerosObservable
                .map(factor -> numero + " x " + factor + " = " + (numero * factor));

        // Suscribir un observador para imprimir cada resultado
        tablaMultiplicarObservable.subscribe(
                resultado -> System.out.println(resultado),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Operación completada")
        );
    }
}

