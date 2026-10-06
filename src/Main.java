public class Main {
    static void main(String[] args) {

        /*
        En el método main, instanciar un plan de hosting, intentar subir varios archivos
        que superen el límite y mostrar los mensajes de la consola.
                */

        PlanHosting plan = new PlanHosting(
                "Memoria",
                512,
                64
        );

        plan.subirArchivos(120);
        plan.subirArchivos(240);
        plan.subirArchivos(100);
    }
}
