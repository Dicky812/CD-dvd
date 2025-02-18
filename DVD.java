public class DVD extends Product{
    
    private int length;
    private String rating;
    private String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    // Override dari superclass Product
    public void print (){
        super.print();
        System.out.println("lenght:\t" + length);
        System.out.println("rating:\t" + rating);
        System.out.println("studio\t:" + studio);
}
}
