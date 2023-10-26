package Day5.Assignment2.Question1;

public class FruitSnacks extends Snacks {
    boolean citrusIndication = false;
    int count = 0;

    FruitSnacks(int i, char size, int flag_cit, int count) {
        super(i, size);
        setIndication(flag_cit);
        setCount(count);
        calculatePrice(size, citrusIndication);
    }

    public void setIndication(int flag_cit) {
        if (flag_cit == 1) {
            this.citrusIndication = false;
        } else if (flag_cit == 2) {
            this.citrusIndication = true;
        }
    }

    public void setCount(int count) {
        // System.out.println("Do you want Citrus? Enter the count: ");
        this.count = count;
    }

    public void calculatePrice(char sizee, boolean citrusIndication) {
        if (citrusIndication == true) {
            super.price += 5.99f * (float) count;
        } else if (citrusIndication == false) {
            super.price += 0 * (float) count;
        }
    }

    public void display() {
        System.out.println("The product id is " + id );
        System.out.println("Your snack will cost about: "+super.price + " for size " + size); 
        System.out.println("Does it include citrus: "+ citrusIndication);
    }

}
