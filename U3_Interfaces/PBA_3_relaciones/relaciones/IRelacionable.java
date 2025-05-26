/*
Las Clases Persona y Numero son un claro ejemplo del polimorfismo con interfaces en Java, ya que cada Clase reescribe los métodos según los necesite. 

Polimorfismo: "Un mismo nombre (la interfaz o los métodos) puede tener múltiples formas (implementaciones diferentes según la clase)."

public interface IRelacionable: define una interfaz pública llamada IRelacionable

¿Qué es una interfaz?
Una interfaz en Java es un tipo especial de clase que solo contiene métodos abstractos (es decir, métodos sin cuerpo), que otras clases deben implementar.
 */
package relaciones;

// Interfaz: IRelacionable
public interface IRelacionable {

    /*
Tener en cuenta que:
Los métodos esMayor, esMenor y esIgual reciben un parámetro llamado o (letra o), que es de tipo Object.
Esto significa que pueden recibir cualquier tipo de objeto.

Estos métodos devuelven verdadero o falso según la comparación que se realice entre el objeto actual y el objeto recibido como parámetro.

Sin embargo, en esta interfaz no se define cómo se hace la comparación. Eso debe implementarse en cada clase que use esta interfaz.
     */
    boolean esMayor(Object o);

    boolean esMenor(Object o);

    boolean esIgual(Object o);
}
