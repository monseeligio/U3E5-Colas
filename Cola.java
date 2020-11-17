package colas;
public class Cola{
    Nodo cima;
    int tamanio;
    Nodo raiz;
        public boolean vacia(){
        return raiz==null;
    }
    
    public void empuja(int elemento){

        Nodo nodo= new Nodo(elemento);
         if(raiz==null && cima==null){
         raiz=nodo;
         cima=nodo;
        }
        cima.Siguiente=nodo;
        cima=nodo;
        tamanio++;
        
    }
    
    public void mostrar(){
      if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
        Nodo recorre=raiz;
        while(recorre!=null){
            System.out.println(recorre.elemento);
            recorre=recorre.Siguiente;}
        }
    }
    

    public void eliminar(){        
          if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
       raiz=raiz.Siguiente;
       tamanio--;
         }
    }
    
}
