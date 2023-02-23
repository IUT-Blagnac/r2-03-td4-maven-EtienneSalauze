package Main;

public class Pile {
    int[] pile;
    int som = -1;
    
    Pile(int pfTaille){
        this.pile = new int[pfTaille];
    }

    public int som() {
        return this.pile[this.som];
    }
    
    public boolean est_vide() {
        if(this.som == -1)
        {
            return true;
        }
        return false;
    }
    public void empiler(int pfElement) {
        this.som++;
        this.pile[som] = pfElement;
    }

    public int depiler() throws Exception {
        if(this.est_vide()) {
            throw new Exception("La pile est vide");
        }
        this.som--;
        return this.pile[som + 1];
    }
        
    public void vider(){
        this.som = -1;
    }

}