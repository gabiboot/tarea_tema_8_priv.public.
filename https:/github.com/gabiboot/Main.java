public class Main {
    public static void main(String[] args) {
//edad, nombre y telefono.
        Persona persona = new Persona();

        persona.setNombre("Rocky");
        String nombre = persona.getNombre();
        persona.setTelefono(1234);
        Number telefono = persona.getTelefono();
        persona.setEdad("infinito");
        String edad = persona.getEdad();
        System.out.println( nombre);
        System.out.println(edad);
        System.out.println(telefono);
    }
}
    class Persona {
        private String nombre;
        private String edad;
        private Number telefono;

        public void setNombre(String nombre) {
            this.nombre = nombre;}
        public void setTelefono(Number telefono){
            this.telefono = telefono;}
        public void setEdad(String edad) {
            this.edad = edad;}
        public String getNombre() {
            return this.nombre;
        }
        public Number getTelefono(){
            return this.telefono;}
        public String getEdad(){
            return this.edad;}
    }
