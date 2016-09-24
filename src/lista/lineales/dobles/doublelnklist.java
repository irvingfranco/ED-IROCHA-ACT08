/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.lineales.dobles;

/**
 *
 * @author casa
 * @param <T>
 */
public class doublelnklist<T> {
    nodedl first;
    nodedl last;
    
    
    public void insertFirst(T data){
        nodedl node = new nodedl(data);
        if(isEmpty()){
            this.first = node;
            this.last = node;
        }else{
            node.next = first;//El apuntador "SIGUIENTE" del nuevo nodo, apunta al primer noo de la lista
            first.prev = node;//El apuntador "ANTERIOR" del primer nodo de la lista apunta al nodo anterior de la lista
            first = node; //El apuntador dirist (que es eatributo de la lista) apunta z
        }
    }
    public void insertLast(T data){
        nodedl node = new nodedl(data); 
        if(isEmpty()){ 
            this.first = node;
            this.last = node;
        } else { 
            node.prev = last; 
            last.next = node; 
            last = node; 
        }
    }
    
   
    public nodedl searchNode(T data){
        nodedl aux;
        if (isEmpty()){ //Si está vacío retorna falso.
            return null;
        }else{ //Si contiene elementos.
            aux = first; //colocamos auxiliar al inicio de la lista.
          while(aux.data!=data && aux!=last){ //Mientras que no encuentre el dato  o no llegue al final de la lista recorrera la lista
                 aux = aux.next;
            }
            if(aux.data == data){
                return aux;
            } else {
                return null;
            }
    }
    }
     public boolean enode(T data){
        nodedl aux = searchNode(data);
        if (aux==null){
            System.out.println("o se encontró el nodo");
            return false;
        }else{
            if (aux == first){
                eNodeFirst();
            }else if(aux == last){
                eNodeLast();
            }else{
                aux.prev.next=aux.next;
                aux.next.prev=aux.prev;
            }
            return true;
        }
    }
    
    public void eNodeFirst(){
        
        first=first.next;
        first.prev=null;
    }
    
    public void eNodeLast(){
        
        last=last.prev;
        last.next=null;
    }
    public void showlist(){
        if (!isEmpty()){
            nodedl t;
            t = (nodedl) first;
            System.out.print("☠<=>");
            while(t!=null){
                System.out.print("[|"+t.data+"|]<=>");
                t=t.next;
            }
            System.out.println("☠");
        } else {
            System.out.println("la lista está vacia");
        }
    }
    
    public void showlistreversa(){
        if (!isEmpty()){
            nodedl t;
            t = (nodedl) last;
            System.out.print("<=>");
            while(t!=null){
                System.out.print("[|"+t.data+"|]<=>");
                t=t.prev;
            }
            System.out.println("☠");
        } else {
            System.out.println("la lista está vacia");
        }
    }
    private boolean isEmpty(){//Método para ver si la lista esta vacia
        return first == null && last == null;
}
}
    
    

