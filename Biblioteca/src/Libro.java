public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public void prestarLibro() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("El libro " + this.titulo + " se ha prestado correctamente");
        } else {
            System.out.println("El libro" + this.titulo + "no está disponible");
        }
    }

    public void devolverLibro() {
        this.disponible = true;
        System.out.println("El libro" + this.titulo + " se ha devuelto correctamente");
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + disponible);
    }
}
