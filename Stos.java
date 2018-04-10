public class Stos {
    private final int[] stackTablica= new int[100];
    private int wksaznik;
    
    
    
    public Stos(){
    for (int i=0; i<this.stackTablica.length; i++){
        this.stackTablica[i]=0;
    }
    this.wksaznik=0;
   
    
}
    public double Pop(){
        if (this.wksaznik>=1){
            this.wksaznik--;
            return this.stackTablica[this.wksaznik+1];
        }
        else {
            return this.stackTablica[this.wksaznik];
        }

}
    public void Push(int numer){
        if (this.wksaznik<this.stackTablica.length-1){
            this.stackTablica[this.wksaznik]=numer;
            this.wksaznik++;
        }
        else if(this.wksaznik==this.stackTablica.length-1){
            this.stackTablica[this.wksaznik]=numer;
            
        }
        else{
            System.err.println("Stos jest pełny");
        }
    }

} 