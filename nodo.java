public class nodo {
    Object dato;
    nodo siguiente;
    //metodo constructor
    public nodo (Object dato,nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;

    }
    public Object getDato(){
        return this.dato;
    }
    public void  setDato(Object dato) {
        this.dato=dato;

    }
    public nodo getSiguiente(){
        return  this.siguiente;
    }
    public void setSiguiente (nodo siguiente){
        this.siguiente = siguiente;
    }
    //insertar
    public void insertarinicio(Object dato){
        if (vacia()){
            this.inicio = new nodo(dato,null);
        }
        else {
            nodo aux = inicio;
            this inicio = new nodo(dato,aux);
        }

    }
    //alinear
    public void eliminarInicio(){
        if (!vacia){
            this.inicio = inicio,getSiguiente();
        }
    }
    public void mostrar(){
        if (vacia()) {
            System.out.println(¨esta vacia¨);

        }
        else {
            nodo aux  = inicio;
            while (aux !=null){
                System.out.println(aux.getDato()+¨¨);

            }
            System.out.println(¨¨);
        }
    }
}
