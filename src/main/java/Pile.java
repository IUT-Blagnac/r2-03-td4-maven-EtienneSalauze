package Main;

public class Pile {
    int[] pile;
    int som = -1;
    
    Pile(int pfTaille){
        this.pile = new int[pfTaille];
    }

    /**
    Donne le sommet de la pile
    @return le sommet de la pile
     */
    public int som() {
        return this.pile[this.som];
    }
    
    /**
    Dit si la pile est vide ou non
    @return true si la pile est vide, false sinon
     */
    public boolean est_vide() {
        if(this.som == -1)
        {
            return true;
        }
        return false;
    }
    /**
    Ajoute un élément à la pile
    @param int pfElement, un nouvel élément de la pile
     */
    public void empiler(int pfElement) {
        this.som++;
        this.pile[som] = pfElement;
    }

    /**
    Enlève un élément de la pile
    @throws si la pile est déjà vide
     */
    public int depiler() throws Exception {
        if(this.est_vide()) {
            throw new Exception("La pile est vide");
        }
        this.som--;
        return this.pile[som + 1];
    }

    /**
    Vide la pile
     */  
    public void vider(){
        this.som = -1;
    }

}