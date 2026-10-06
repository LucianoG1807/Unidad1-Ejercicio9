public class PlanHosting {

    /*
    9 — Gestión de Plan de Hosting Web

Contexto

Los proveedores de infraestructura tecnológica ofrecen distintos planes de alojamiento web.
 Es necesario modelar estos servicios para controlar los recursos asignados a cada dominio.

Consigna

Desarrollar una clase que represente una cuenta de hosting web, controlando el espacio de almacenamiento consumido.

Desarrollo requerido

Definir la clase PlanHosting con atributos nombreDominio (String), capacidadMaximaGB (int) y espacioOcupadoGB (double).

Incorporar un constructor parametrizado y métodos de validación.

Implementar un método subirArchivos(double pesoGB) que incremente el espacio ocupado solo
si no supera la capacidad máxima (emitiendo una alerta si se excede).

En el método main, instanciar un plan de hosting, intentar subir varios archivos
que superen el límite y mostrar los mensajes de la consola.
     */

    String nombreDominio;
    int capacidadMaximaGB;
    double espacioOcupadoGB;

    public PlanHosting (String nombreDominio, int capacidadMaximaGB, double espacioOcupadoGB) {

        this.nombreDominio = nombreDominio;

        if (capacidadMaximaGB > 0) {
            this.capacidadMaximaGB = capacidadMaximaGB;
        }

        if (espacioOcupadoGB <= capacidadMaximaGB && espacioOcupadoGB >= 0) {
            this.espacioOcupadoGB = espacioOcupadoGB;
        }
    }

    void subirArchivos (double pesoGB) {

        if (pesoGB <= 0) {
            System.out.println("ARCHIVO INVALIDO.");
        } else if ((pesoGB + this.espacioOcupadoGB) > capacidadMaximaGB) {
            System.out.println("CAPACIDAD INSUFICIENTE.");
            System.out.println("GB DISPONIBLES DE ALMACENAMIENTO: " + (capacidadMaximaGB - espacioOcupadoGB));
        } else {
            espacioOcupadoGB += pesoGB;
            System.out.println("ARCHIVO SUBIDO CON EXITO.");
            System.out.println("GB DISPONIBLES DE ALMACENAMIENTO: " + (capacidadMaximaGB - espacioOcupadoGB));
        }
        }

}
