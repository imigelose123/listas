public class lista {
    nodo inicio;
    //metodo constructor
    public lista (){
        this.inicio = null;
    }
    //vacia
    public boolean estevacio(){
        return  inicio==null;
    }

    //tamaño de una lista
    public int tamaño(){
        int contador = 0;
        nodo aux = inicio;

        while (aux.getSiguiente() !=null);
        contador++;
        aux = aux.getSiguiente();

    if (contador !=0) contador++;

    return contador;

    }
    public class listaSE{
        //calor ultimo nodo
        public Object ultimodato(){
            nodo aux = inicio;
            while (aux.getSiguiente() !=null){
                aux.getSiguiente();
            }
            return aux.getDato();
        }



    }
}
